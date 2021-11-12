package demoblazer.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/***
 * 
 * @author dyeslen.duraes
 *	Classe responsavel pela configuração
 *de objetos para o cadastro de um usuario
 *no sistema.
 */

public class UsuarioPageObject {
	
	/***
	 * Atributo responsavel pela configuração 
	 * do driver do Google Chrome para o Selenium.
	 */
	private WebDriver webDriver;
	
	/***
	 * 
	 * @param driver
	 * Construtor responsavel por inicializar
	 * o driver do Google Chrome para o Selenium.
	 */
	
	public UsuarioPageObject(WebDriver driver) {
		driver = this.webDriver;
	}
	
	/***
	 * 
	 * @param usuario
	 * @param senha
	 * 
	 * Metodo responsavel por cadastrar um
	 * usuario na base de dados no sistema.
	 * Deve passar o <usuario> do sistema e
	 * a <senha> como parametro para concluir
	 * o cadastro com sucesso.
	 */
	public void cadastroDeUsuarios(String usuario, String senha) {
		WebElement loginElement = webDriver.findElement(By.id("sign-username"));
		WebElement senhaElement = webDriver.findElement(By.id("sign-password"));
		
		loginElement.sendKeys("dyeslen");
		senhaElement.sendKeys("123");
	}
	
	/***
	 * Metodo responsavel por clicar no 
	 * botao submit para concluir com sucesso
	 * o cadastro do usuario
	 */
	public void clickBotao() {
		WebElement botaoSalvar = webDriver.findElement(By.className("btn btn-primary"));
		botaoSalvar.click();
	}
}