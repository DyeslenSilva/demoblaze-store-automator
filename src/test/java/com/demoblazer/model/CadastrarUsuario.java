package com.demoblazer.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoblazer.driver.DriverDemoBlazer;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

/***
 * 
 * @author dyeslen.duraes
 *	Classe responsavel pelo cadastro 
 *de usuario no sistema.
 */

public class CadastrarUsuario{
	
	
	/***
	 * Metodo responsavel por chamar o
	 * driver e inicializa-lo
	 */
	
	@Before
	public void before() {
		System.out.println("before");
		DriverDemoBlazer.setDriver();
	}
	
	public CadastrarUsuario() {
	
	}
	
	/***
	 * Metodo responsavel por acessar a pagina inicial
	 * do sistema.
	 */
	
	@When("acesso a <homepage>")
	public void acesso_a_homepage() {
		DriverDemoBlazer.getDriver().navigate().to("https://demoblaze.com/");
	}
	
	/***
	 * Metodo responsavel por clicar no
	 * metodo <sign up> para realizar o cadastro
	 * do usuario.
	 */
	
	@SuppressWarnings("deprecation")
	@When("clico no botao <sign up>")
	public void clico_no_botao_sign_up() {
		WebElement signup = (WebElement) (new WebDriverWait(DriverDemoBlazer.getDriver(), 30)
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='signin2']"))));
				
				//DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@id='signin2']"));
		
		signup.click();
	}
	
	/***
	 * Metodo responsavel por preencher o formulario
	 * de cadastro com os campos <username> e <senha>.
	 */
	
	@SuppressWarnings("deprecation")
	@When("preencho <username> e <senha>")
	public void preencho_username_e_senha() {
		WebElement username = (WebElement) (new WebDriverWait(DriverDemoBlazer.getDriver(), 30)
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='sign-username"))));
				
		WebElement password =(WebElement)(new WebDriverWait(DriverDemoBlazer.getDriver(), 30)
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='sign-password']"))));
		
		username.sendKeys("dyeslen");
		password.sendKeys("dyeslen");
	}
	
	/***
	 * Metodo responsavel por clicar no botao <submit>
	 */
	
	@SuppressWarnings("deprecation")
	@When("clico no botao <submit>")
	public void clico_no_botao_submit() {
		WebElement submit = (WebElement)(new WebDriverWait(DriverDemoBlazer.getDriver(), 30)
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@onclick=\\\"send()\\\"]"))));
				
		submit.click();
	}

}