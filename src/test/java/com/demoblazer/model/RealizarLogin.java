package com.demoblazer.model;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoblazer.driver.DriverDemoBlazer;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/***
 * 
 * @author dyeslen.duraes
 *
 *Classe responsavel pelo teste de login do cliente.
 */

public class RealizarLogin{
	
	/***
	 * Metodo responsavel por chamar o
	 * driver do Google Chrome para iniciar
	 * o teste.
	 * 
	 */
	
//	@Before
//	public void before() {
//		System.out.println("before");
//		DriverDemoBlazer.setDriver();
//	}
//	
	/***
	 * Metodo responsavel por acesso 
	 * a pagina inicial do sistema
	 */

	@When("acessa a pagina")
	public void acessa_a_pagina() {
		DriverDemoBlazer.getDriver().navigate().to("https://demoblaze.com/");
	}
	
	/***
	 * Metodo responsavel pelo acesso 
	 * do menu login 
	 */
	
	@When("acessa o menu login")
	public void acessa_o_menu_login() {
		WebElement linkLogin = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@id='login2']"));
		linkLogin.click();
	}
	
	/***
	 * Metodo responsavel por preencher
	 * formulario de login com <login> e
	 * <senha>. 
	 * @throws InterruptedException 
	 */
	
	@When("preencho com <login> e <senha>")
	public void preencho_com_login_e_senha() throws InterruptedException {
		//Thread.sleep(3000);
		WebDriverWait driverWait = new WebDriverWait(DriverDemoBlazer.getDriver(), Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
		WebElement login = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id='loginusername']"));
		driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginpassword']")));
		WebElement senha = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id='loginpassword']"));
		
		
		login.sendKeys("dyeslen");
		senha.sendKeys("dyeslen");
	}
	
	/***
	 * Metodo responsavel por clicar 
	 * no botao <log in>
	 * @throws InterruptedException 
	 */
	
	@When("clico no botao <log in>")
	public void clico_no_botao_log_in() throws InterruptedException {
		Thread.sleep(2000);
		WebElement botaoLogin = DriverDemoBlazer.getDriver().findElement(By.xpath("//button[@onclick='logIn()']"));
		
//		WebDriverWait driverWait = new WebDriverWait(DriverDemoBlazer.getDriver(),Duration.ofSeconds(4));
//		driverWait.until(ExpectedConditions.elementToBeClickable(botaoLogin));
		
		botaoLogin.click();
	}
	
	/***
	 * Metodo responsavel por redirecionar
	 * para a pagina do cliente
	 */
	
	@Then("abre pagina do cliente")
	public void abre_pagina_do_cliente() {
		DriverDemoBlazer.getDriver().navigate().to("https://demoblaze.com/");
	}
		
}