package com.demoblazer.evidence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Evidences {
	
	public static Document geraPDFEvidence(File dir) throws FileNotFoundException, DocumentException {
		Document document = new Document(PageSize.A4);
		OutputStream outputStream = new FileOutputStream(dir +".pdf");
		PdfWriter.getInstance(document, outputStream);
		document.open();
		return document;
	}
	
	
	public static void addCabecalhoPDF() throws DocumentException {
		Font bold = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD);
		String usuarioLogado = System.getProperty("user.name");
		Document document = new Document(PageSize.A4);
		
		Font alteraFont = new Font(FontFamily.COURIER,12,Font.BOLD);
		alteraFont.setColor(BaseColor.BLUE);
	
		PdfPTable tableheader = new PdfPTable(new float[] { 0.15f, 0.35f,0.13f,0.37f });
		
		PdfPCell header = new PdfPCell(new Paragraph("Evidencia de Teste",alteraFont));
		header.setUseBorderPadding(true);
		header.setBorderColor(BaseColor.CYAN);
		header.setHorizontalAlignment(Element.ALIGN_CENTER);
		
		header.setColspan(4);
		tableheader.setSpacingBefore(4);
		tableheader.addCell(header);
		
		PdfPCell lblSistema = new PdfPCell(new Paragraph("Sistema"));
		PdfPCell txtSistema = new PdfPCell(new Paragraph("Loja Demo Blaze"));
		PdfPCell lblVersao = new PdfPCell(new Paragraph("Versao"));
		PdfPCell txtVersao = new PdfPCell(new Paragraph("Versao"));
		PdfPCell lblCT = new PdfPCell(new Paragraph());
		PdfPCell txtCT = new PdfPCell(new Paragraph());
		PdfPCell lblExecutor = new PdfPCell(new Paragraph("Executor"));
		PdfPCell txtExecutor = new PdfPCell(new Paragraph(usuarioLogado));
		PdfPCell lblData = new PdfPCell(new Paragraph());
		PdfPCell txtData = new PdfPCell(new Paragraph());
		
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
}
