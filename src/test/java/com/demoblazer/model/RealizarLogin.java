package com.demoblazer.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demoblazer.pageObject.LoginPageObject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RealizarLogin extends LoginPageObject{

	private WebDriver driver;
	
	
	public RealizarLogin(WebDriver webDriver) {
		super(webDriver);
	}

	
	@When("acessa a pagina de login")
	public void acessa_a_pagina_de_login() {
	    WebElement paginaLogin = driver.findElement(By.id("loginusername"));
	    paginaLogin.click();
	}
	
	@When("preencho o <login> e <senha>")
	public void preencho_o_login_e_senha(String login, String senha) {
		realizaLogin(login, senha);
	}
	
	@When("clico no botao login")
	public void clico_no_botao_login() {
		clickBotao();
	}
	
	@Then("abre pagina do cliente")
	public void abre_pagina_do_cliente() {
		
	}

		
}