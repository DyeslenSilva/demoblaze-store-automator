	package demoblazer.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CompraPageObject {
		
	private static WebDriver webDriver;
	
	public CompraPageObject(WebDriver driver) {
		webDriver = driver;
	}
	
	public void addCarrinho() {
		WebElement produto = webDriver.findElement(By.id(""));
		produto.click();
		
		WebElement compraButton = webDriver.findElement(By.id(""));
		compraButton.click();	
	
		WebElement cart = webDriver.findElement(By.id(""));
		cart.click();		
	}
	
	public static void paginaCart() {
		webDriver.get("https://www.demoblaze.com/cart.html#");
	}
	
	public void placeOrder() {
		WebElement placeOrder = webDriver.findElement(By.className("btn btn-success"));
		placeOrder.click();
	}
	
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
	
	public void clickBotaoPurchase() {
		WebElement purchase = webDriver.findElement(By.id(""));
		purchase.click();
	}
	
	
	public void escolheProduto() {
		WebElement produto = webDriver.findElement(By.id(""));
		produto.sendKeys("");
	}
	
	public void submit() {
		WebElement submit = webDriver.findElement(By.id(""));
		submit.click();

	}
	
}