package com.demoblazer.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.demoblazer.driver.DriverDemoBlazer;

import demoblazer.pageObject.LoginPageObject;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RealizarLogin{

	
	private WebDriver driver;
//	private DriverDemoBlazer driverDemoBlazer;
	
	
	public RealizarLogin() {
		driver = DriverDemoBlazer.getDriver();
	}
	
	@Before
	public void before() {
		System.out.println("before");
		DriverDemoBlazer.setDriver();
	}
	
	
	@When("acessa a pagina de login")
	public void acessa_a_pagina_de_login() {
		WebElement linkLogin = driver.findElement(By.id("login2"));
		linkLogin.click();
		
	}
	
	@When("preencho o login e senha")
	public void preencho_o_login_e_senha() {
		WebElement txLogin = driver.findElement(By.id("loginusername"));
		WebElement txSenha = driver.findElement(By.id("loginpassword"));
		
		txLogin.sendKeys("dyeslen");
		txSenha.sendKeys("dyeslen");
	}
	@When("clico no botao login")
	public void clico_no_botao_login() {
		WebElement btLogin = driver.findElement(By.id("btn btn-primary"));
		btLogin.click();
	}
	@Then("abre pagina do cliente")
	public void abre_pagina_do_cliente() {
	   driver.get("https://www.demoblaze.com/index.html");
	}

		
}