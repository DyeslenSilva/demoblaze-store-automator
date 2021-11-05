package com.demoblazer.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demoblazer.driver.DriverDemoBlazer;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RealizarLogin{
	
	@Before
	public void before() {
		System.out.println("before");
		DriverDemoBlazer.setDriver();
	}
	
	
	@When("acessa a pagina")
	public void acessa_a_pagina() {
		DriverDemoBlazer.getDriver().navigate().to("https://www.demoblaze.com/index.html");
	}
	
	@When("acessa o menu login")
	public void acessa_o_menu_login() {
		WebElement linkLogin = DriverDemoBlazer.getDriver().findElement(By.id("login2"));
		linkLogin.click();
	}
	
	@When("preencho com <login> e <senha>")
	public void preencho_com_login_e_senha() {
		WebElement txLogin = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id=\"loginusername\"]"));
		WebElement txSenha = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id=\"loginpassword\"]"));
		
		txLogin.sendKeys("dyeslen");
		txSenha.sendKeys("dyeslen");
	}
	
	@When("clico no botao <log in>")
	public void clico_no_botao_login() {
		WebElement btLogin = DriverDemoBlazer.getDriver().findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
		btLogin.click();
	}
	
	@Then("abre pagina do cliente")
	public void abre_pagina_do_cliente() {
		DriverDemoBlazer.getDriver().navigate().to("https://www.demoblaze.com/index.html");
	}
		
}