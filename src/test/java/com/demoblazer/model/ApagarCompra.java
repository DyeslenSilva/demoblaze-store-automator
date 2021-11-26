package com.demoblazer.model;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
 *	CLasse responsavel pelo teste
 *de apagar uma compra realizada pelo cliente.
 */

public class ApagarCompra {	
	
	
	private static RealizarCompra realizarCompra;

	
	/***
	 * Metodo responsavel pelo redirecionamento
	 * para a pagina inicial.
	 */
	
	@When("entra na pagina inicial")
	public void entra_na_pagina_inicial() {
	  DriverDemoBlazer.getDriver().navigate().to("https://demoblaze.com/");
	}
	
	
	
	/***
	 * Metodo responsavel por clicar no botao login
	 * e redireciona para a pagina inicial
	 * @throws InterruptedException 
	 */	
	
	//@SuppressWarnings("deprecation")
	@When("clico em login")
	public void clico_em_login() throws InterruptedException {
		WebElement botaoLogin = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@id='login2']"));		
		botaoLogin.click();
	}
	

	/***
	 * Metodo responsavel por clicar no link <cart>
	 * e redirecionar para o carrinho de compras
	 * @throws InterruptedException 
	 */
	
	@When("preencho com login e senha")
	public void preencho_com_login_e_senha() {
		WebDriverWait driverWait = new WebDriverWait(DriverDemoBlazer.getDriver(), Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
		WebElement login = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id='loginusername']"));
		driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginpassword']")));
		WebElement senha = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id='loginpassword']"));
		

		
		login.sendKeys("dyeslen");
		senha.sendKeys("dyeslen");
	}
	
	@When("clico no botao login")
	public void clico_no_botao_login() throws InterruptedException {
		Thread.sleep(2000);
		WebElement botaoLogin = DriverDemoBlazer.getDriver().findElement(By.xpath("//button[@onclick='logIn()']"));
		
//		WebDriverWait driverWait = new WebDriverWait(DriverDemoBlazer.getDriver(),Duration.ofSeconds(4));
//		driverWait.until(ExpectedConditions.elementToBeClickable(botaoLogin));
		
		botaoLogin.click();
	}
	

	@When("escolha produto que deseja comprar")
	public void escolhe_produto_que_deseja_comprar() throws InterruptedException {
		Thread.sleep(2000);
		WebElement produto = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@href='prod.html?idp_=1']"));
		produto.click();
	}

	/***
	 * Metodo responsavel por adicionar
	 * um produto no carrinho.
	 * @throws InterruptedException 
	 */
	
	//@SuppressWarnings("deprecation")
	@Then("adicionar o produto no carrinho")
	public void adiciona_o_produto_no_carrinho() throws InterruptedException {
		Thread.sleep(2000);
		WebElement adicionaProduto = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@onclick='addToCart(1)']")); 		
		adicionaProduto.click();
	}
	
	/***
	 * Metodo responsavel por redirecionar para
	 * a pagina de carrinho da compra
	 */
	
	@Then("ir para a pagina do carrinho de compra")
	public void vai_para_a_pagina_do_carrinho_de_compra() {
		DriverDemoBlazer.getDriver().navigate().to("https://demoblaze.com/cart.html");
	}
	
	/***
	 * Metodo responsavel por clicar no botao
	 * <place order> para preencher o formulario
	 * da compra
	 * @throws InterruptedException 
	 */
	
	//@SuppressWarnings("deprecation")
	
	/***
	 * Metodo responsavel por clicar no 
	 * botao delete e apagar uma compra.
	 * @throws InterruptedException 
	 * 
	 */
	
	//@SuppressWarnings("deprecation")
	@Then("clico no botao <delete>")
	public void clico_no_botao_delete() throws InterruptedException {
		Thread.sleep(3000);

		WebElement botaoDelete = DriverDemoBlazer.getDriver().findElement(By.xpath("(//a[text()='Delete'])[1]"));
		botaoDelete.click();
	}

}