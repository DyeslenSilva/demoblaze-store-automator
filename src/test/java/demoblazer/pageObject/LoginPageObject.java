package demoblazer.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.Before;

public class LoginPageObject {
	
	private WebDriver driver;
	
	@FindBy(id = "loginusername")
	private WebElement login;
	
	@FindBy(id = "loginpassword")
	private WebElement senhaPass;
	
	@FindBy(className = "btn btn-primary")
	private WebElement btnLogin;
	
	@Before
	public void realizaLogin(String usuario, String senha) {	
		login.sendKeys(usuario);
		senhaPass.sendKeys(senha);
		
	
		driver.get("https://www.demoblaze.com/index.html");	
	}
	
	public void clickBotao() {
		WebElement botaoLogin = driver.findElement(By.className("btn btn-primary"));
		botaoLogin.click();
	}
	
}
