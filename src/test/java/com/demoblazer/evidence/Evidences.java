package com.demoblazer.evidence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.openqa.selenium.WebDriver;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;

public class Evidences {
	
	private static String usuarioLogado = System.getProperty("user.name");
	private static Font alteraFont = new Font(FontFamily.COURIER,12,Font.BOLD);
	private static	Font alteraFontDadosInseridos = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD);
	private static Font changeFontlbl = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD);
	private static	Font changeFonttxt = new Font(Font.FontFamily.TIMES_ROMAN,10);
	
	private	static PdfPCell lblSistema = new PdfPCell(new Paragraph("Sistema"));
	private	static PdfPCell txtSistema = new PdfPCell(new Paragraph("Loja Demo Blaze"));
	private	static PdfPCell lblVersao = new PdfPCell(new Paragraph("Versao"));
	private	static PdfPCell txtVersao = new PdfPCell(new Paragraph("Versao"));
	private	static PdfPCell lblCT = new PdfPCell(new Paragraph());
	private	static PdfPCell txtCT = new PdfPCell(new Paragraph());
	private	static PdfPCell lblExecutor = new PdfPCell(new Paragraph("Executor"));
	private	static PdfPCell txtExecutor = new PdfPCell(new Paragraph(usuarioLogado));
	private	static PdfPCell lblData = new PdfPCell(new Paragraph());
	private	static PdfPCell txtData = new PdfPCell(new Paragraph());
	private static	PdfPTable tableheader = new PdfPTable(new float[] { 0.15f, 0.35f,0.13f,0.37f });
	private static	PdfPCell header = new PdfPCell(new Paragraph("Evidencia de Teste",alteraFont));
	private static	Document document = new Document(PageSize.A4);
	
	private static PdfPTable table;
	private static	PdfPCell cell;

	
	public static Document geraPDFEvidence(File dir) throws FileNotFoundException, DocumentException {
		Document document = new Document(PageSize.A4);
		OutputStream outputStream = new FileOutputStream(dir +".pdf");
		PdfWriter.getInstance(document, outputStream);
		document.open();
		return document;
	}
	
	
	public static void addCabecalhoPDF() throws DocumentException {
		alteraFont.setColor(BaseColor.BLUE);
		
		header.setUseBorderPadding(true);
		header.setBorderColor(BaseColor.CYAN);
		header.setHorizontalAlignment(Element.ALIGN_CENTER);
		
		header.setColspan(4);
		tableheader.setSpacingBefore(4);
		tableheader.addCell(header);
		
		
		lblSistema.setBorderColor(BaseColor.BLUE);
		lblSistema.setHorizontalAlignment(Element.ALIGN_TOP);
		txtSistema.setBorderColor(BaseColor.BLUE);
		
		lblVersao.setBorderColor(BaseColor.BLUE);
		lblVersao.setHorizontalAlignment(Element.ALIGN_TOP);
		txtVersao.setBorderColor(BaseColor.BLUE);
		
		lblCT.setBorderColor(BaseColor.BLUE);
		lblCT.setHorizontalAlignment(Element.ALIGN_TOP);
		txtCT.setBorderColor(BaseColor.BLUE);
		
		lblExecutor.setBorderColor(BaseColor.BLUE);
		lblExecutor.setHorizontalAlignment(Element.ALIGN_TOP);
		txtExecutor.setBorderColor(BaseColor.BLUE);
		
		lblData.setBorderColor(BaseColor.BLUE);
		lblData.setHorizontalAlignment(Element.ALIGN_TOP);
		txtData.setBorderColor(BaseColor.BLUE);
		
		txtCT.setColspan(3);
		
		tableheader.addCell(lblSistema);
		tableheader.addCell(txtSistema);
		tableheader.addCell(lblVersao);
		tableheader.addCell(txtVersao);
		tableheader.addCell(lblCT);
		tableheader.addCell(txtCT);
		tableheader.addCell(lblExecutor);
		tableheader.addCell(txtExecutor);
		tableheader.addCell(lblData);
		tableheader.addCell(txtData);
		
		tableheader.setSpacingAfter(20);
		
		document.add(tableheader);
	}
	
	public static void insertSummary(WebDriver driver, Document doc) {
		alteraFontDadosInseridos.setColor(BaseColor.GREEN);
		
		table = new PdfPTable(1);
		table.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.setWidthPercentage(60);
		table.setSpacingAfter(20);
		
		cell = new PdfPCell(new Phrase("Execucao: " ,alteraFontDadosInseridos));
		cell.setBorder(PdfPCell.LEFT | PdfPCell.TOP | PdfPCell.BOTTOM | PdfPCell.RIGHT);
		cell.setBorderColor(BaseColor.BLUE);
		
		table.addCell(cell);
		table.setWidthPercentage(50);
	}
	
	public static void insertDescription(Document doc,String requirements,
								String target,String nameTest) throws DocumentException {		
		
		Paragraph lblFieldRequirements = new Paragraph("Requirements: ",changeFontlbl);
		Paragraph txtFieldRequirements = new Paragraph(requirements, changeFonttxt);
		
		Paragraph lblFieldNameTarget = new Paragraph("Target Test", changeFontlbl);
		Paragraph txtFieldNameTarget = new Paragraph(requirements, changeFonttxt);
		
		Paragraph lblFieldnameTest = new Paragraph("Name Test Case", changeFontlbl);
		Paragraph txtFieldnameTest = new Paragraph(nameTest, changeFonttxt);
		DottedLineSeparator dottedLineSeparator = new DottedLineSeparator();
		dottedLineSeparator.setLineColor(BaseColor.BLUE);
		
		lblFieldRequirements.setSpacingAfter(5);
		txtFieldRequirements.setSpacingAfter(5);
		
		lblFieldNameTarget.setSpacingAfter(5);
		txtFieldNameTarget.setSpacingAfter(5);
		
		lblFieldnameTest.setSpacingAfter(5);
		txtFieldnameTest.setSpacingAfter(5);
		
		dottedLineSeparator.setOffset(-2);
		dottedLineSeparator.setGap(1f);
		lblFieldRequirements.add(dottedLineSeparator);
		
		lblFieldNameTarget.add(dottedLineSeparator);
		lblFieldnameTest.add(dottedLineSeparator);
		
		txtFieldnameTest.setSpacingAfter(45);
		
		doc.add(lblFieldRequirements);		
		doc.add(txtFieldRequirements);
		
		doc.add(lblFieldNameTarget);
		doc.add(txtFieldNameTarget);
		
		doc.add(lblFieldnameTest);
		doc.add(txtFieldnameTest);
	}
}