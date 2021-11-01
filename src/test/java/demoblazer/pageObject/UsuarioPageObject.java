package demoblazer.pageObject;

import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;


public class UsuarioPageObject {
	
	private WebDriver webDriver;
	
	private static String pagina = "https://www.demoblaze.com/index.html";

	
	public UsuarioPageObject(WebDriver driver) {
		driver = this.webDriver;
	}
	
	@BeforeAll
	public void abrePagina() {
		webDriver.get(pagina);
	}
	
	@org.junit.Test
	public void cadastroDeUsuarios(String usuario, String senha) {
		WebElement loginElement = webDriver.findElement(By.name(""));
		WebElement senhaElement = webDriver.findElement(By.name(""));
		
		loginElement.sendKeys("dye2312");
		senhaElement.sendKeys("1234");
	}
	
	
	public void clickBotao() {
		WebElement botaoSalvar = webDriver.findElement(By.id(""));
		botaoSalvar.click();
	}
	
	@org.junit.Test
	public void realizaLogin(String usuario, String senha) {
		WebElement login = webDriver.findElement(By.id(""));
		WebElement senhaPass = webDriver.findElement(By.id(""));
		
		login.sendKeys(usuario);
		senhaPass.sendKeys(senha);
		
		webDriver.get("");	
	}
	
	
	
	
}
