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
		
		paginaCart();
		placeOrder();
		escolheProduto();
		
	}
	
	private static void paginaCart() {
		webDriver.get("https://www.demoblaze.com/cart.html#");
	}
	
	private void placeOrder() {
		WebElement placeOrder = webDriver.findElement(By.id(""));
		placeOrder.click();
		
		WebElement name = webDriver.findElement(By.id(""));
		WebElement country = webDriver.findElement(By.id(""));
		WebElement city = webDriver.findElement(By.id(""));
		WebElement creditCard = webDriver.findElement(By.id(""));
		WebElement month = webDriver.findElement(By.id(""));
		WebElement year = webDriver.findElement(By.id(""));
		
		name.sendKeys("Dyeslen");
		country.sendKeys("Brasil");
		city.sendKeys("Itu");
		creditCard.sendKeys("398492321");
		month.sendKeys("12");
		year.sendKeys("2022");
		
		WebElement purchase = webDriver.findElement(By.id(""));
		purchase.click();
	}
	
	public void escolheProduto() {
		WebElement produto = webDriver.findElement(By.id(""));
		WebElement submit = webDriver.findElement(By.id(""));
		
		produto.sendKeys("");
		submit.click();
	}
}