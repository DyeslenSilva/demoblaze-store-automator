package demoblazer.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.Before;

/***
 * 
 * @author dyeslen.duraes
 *	Classe responsavel pela configuração
 *de objetos para realizar testes de login.
 */

public class LoginPageObject {
	
	/***
	 *Atributo responsavel pela configuraçao 
	 *do driver do Google Chrome para o Selenium 
	 */
	private WebDriver driver;
	
	/***
	 * Atributo responsavel pela representação
	 * de uma caixa de texto para o login do
	 * usuario.
	 */
	
	@FindBy(id = "loginusername")
	private WebElement login;
	
	/***
	 * Atributo responsavel pela representação
	 * de uma caixa de texto (especifico para
	 * senhas) para a senha do usuario.
	 */
	
	@FindBy(id = "loginpassword")
	private WebElement senhaPass;
	
	/***
	 * Atributo responsavel pela representação
	 * de um botao para que o usuario possa realizar
	 * o login.
	 */
	
	@FindBy(className = "btn btn-primary")
	private WebElement btnLogin;
	
	/***
	 * 
	 * @param usuario
	 * @param senha
	 * 
	 * Metodo responsavel por realizar o login
	 * de um usuario da pagina. O usuario deve passar
	 * o <usuario> que deve estar cadastrado no banco,
	 * e a <senha> que tambem deve estar cadastrada no 
	 * banco.
	 */
	
	@Before
	public void realizaLogin(String usuario, String senha) {	
		login.sendKeys(usuario);
		senhaPass.sendKeys(senha);
	}
	
	/***
	 * Metodo responsavel por clicar no 
	 * botao para que seja realizado
	 * o login do cliente no sistema.
	 */
	
	public void clickBotao() {
		WebElement botaoLogin = driver.findElement(By.className("btn btn-primary"));
		botaoLogin.click();
	}
	
}
