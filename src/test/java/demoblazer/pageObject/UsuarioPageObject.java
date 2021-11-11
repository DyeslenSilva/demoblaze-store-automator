package demoblazer.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsuarioPageObject {
	
	private WebDriver webDriver;
	
	public UsuarioPageObject(WebDriver driver) {
		driver = this.webDriver;
	}
	
	public void cadastroDeUsuarios(String usuario, String senha) {
		WebElement loginElement = webDriver.findElement(By.id("sign-username"));
		WebElement senhaElement = webDriver.findElement(By.id("sign-password"));
		
		loginElement.sendKeys("dyeslen");
		senhaElement.sendKeys("123");
	}
	
	public void clickBotao() {
		WebElement botaoSalvar = webDriver.findElement(By.className("btn btn-primary"));
		botaoSalvar.click();
	}
}