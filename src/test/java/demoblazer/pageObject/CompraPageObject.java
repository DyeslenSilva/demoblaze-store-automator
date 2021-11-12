package demoblazer.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/***
 * 
 * @author dyeslen.duraes
 *	Classe responsavel pela configuração
 *de objetos para realização de teste
 */

public class CompraPageObject {
		
	/***
	 * Atributo estatico para configuração 
	 * do driver do Google chrome para o
	 * Selenium
	 */
	
	private static WebDriver webDriver;
	
	
	/***
	 * 
	 * @param driver
	 * 
	 * Construtor responsavel por inicializar 
	 * o driver do Google Chrome para o
	 * Selenium.
	 */
	
	public CompraPageObject(WebDriver driver) {
		webDriver = driver;
	}
		
	/***
	 * Metodo responsavel por escolher um produto 
	 * para adicionar no carrinho
	 */
	
	public void escolheProduto() {
		WebElement produto = webDriver.findElement(By.id(""));
		produto.sendKeys("");
	}
	
	/***
	 * Metodo responsavel por adicionar um 
	 * determinado produto no carrinho
	 */
	public void addCarrinho() {
		WebElement produto = webDriver.findElement(By.id(""));
		produto.click();
		
		WebElement compraButton = webDriver.findElement(By.id(""));
		compraButton.click();	
	
		WebElement cart = webDriver.findElement(By.id(""));
		cart.click();		
	}
	
	/***
	 * Metodo responsavel por redirecionar
	 * o usuario para o carrinho da compra.
	 */
	
	public void paginaCart() {
		webDriver.get("https://www.demoblaze.com/cart.html#");
	}
	
	/***
	 * Metodo responsavel por clicar no 
	 * botao <Place Order> para continuar 
	 * a compra.
	 */
	
	public void placeOrder() {
		WebElement placeOrder = webDriver.findElement(By.className("btn btn-success"));
		placeOrder.click();
	}
	
	/***
	 * Metodo resposanvel por preencher 
	 * o formulario para realizar a compra
	 */
	
	public void preencheForm() {	
		WebElement name = webDriver.findElement(By.id("name"));
		WebElement country = webDriver.findElement(By.id("country"));
		WebElement city = webDriver.findElement(By.id("city"));
		WebElement creditCard = webDriver.findElement(By.id("card"));
		WebElement month = webDriver.findElement(By.id("month"));
		WebElement year = webDriver.findElement(By.id("year"));
		
		name.sendKeys("Dyeslen");
		country.sendKeys("Brasil");
		city.sendKeys("Itu");
		creditCard.sendKeys("398492321");
		month.sendKeys("12");
		year.sendKeys("2022");
		
		clickBotaoPurchase();
		
	}
	
	/***
	 * Metodo responsavel por clicar no botao 
	 * purchase para concluir a compra.
	 */
	
	public void clickBotaoPurchase() {
		WebElement purchase = webDriver.findElement(By.id(""));
		purchase.click();
	}
	
	/***
	 * Metodo responsavel por clicar no botao 
	 * submit para concluir o processo.
	 */
	
	public void submit() {
		WebElement submit = webDriver.findElement(By.id(""));
		submit.click();

	}
	
}