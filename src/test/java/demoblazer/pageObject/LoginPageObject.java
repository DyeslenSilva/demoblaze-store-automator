package demoblazer.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	private WebDriver driver;
	
	public LoginPageObject(WebDriver webDriver) {
		this.driver = webDriver;
	}
	
	@org.junit.Test
	public void realizaLogin(String usuario, String senha) {
		WebElement login = driver.findElement(By.id(""));
		WebElement senhaPass = driver.findElement(By.id(""));
		
		login.sendKeys(usuario);
		senhaPass.sendKeys(senha);
		
		driver.get("");	
	}
	

	public void clickBotao() {
		WebElement botaoLogin = driver.findElement(By.id(""));
		botaoLogin.click();
	}
}
