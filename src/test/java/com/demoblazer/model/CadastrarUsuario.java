package com.demoblazer.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demoblazer.driver.DriverDemoBlazer;
import demoblazer.pageObject.IndexObject;
import demoblazer.pageObject.UsuarioPageObject;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastrarUsuario{
	
	private IndexObject indexObject;
	private UsuarioPageObject  usuarioPageObject;
	
//	public CadastrarUsuario(WebDriver driver) {
//		usuarioPageObject = new UsuarioPageObject(DriverDemoBlazer.getDriver());
//		indexObject = new IndexObject(driver);
//		System.out.println("construtor");
//	}
	
	
	@Before
	public void before() {
		System.out.println("before");
		DriverDemoBlazer.setDriver();
	}
	
	public CadastrarUsuario() {
	
	}
	
	@When("acesso a <homepage>")
	public void acesso_a_homepage() {
		DriverDemoBlazer.getDriver().navigate().to("https://demoblaze.com/");
	}
	
	@When("clico no botao <sign up>")
	public void clico_no_botao_sign_up() {
		WebElement submit = DriverDemoBlazer.getDriver().findElement(By.xpath("//button[@onclick=\"register()\"]"));
		submit.click();
	}
	@When("preencho <username> e <senha>")
	public void preencho_username_e_senha() {
		WebElement username = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id=\"sign-username\"]"));
		WebElement password = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id=\"sign-password\"]"));

		username.sendKeys("dyeslen");
		password.sendKeys("dyeslen");
	}
	@When("clico no botao <submit>")
	public void clico_no_botao_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
	
}