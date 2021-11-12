package com.demoblazer.model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.demoblazer.driver.DriverDemoBlazer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/***
 * 
 * @author dyeslen.duraes
 *	CLasse responsavel pelo teste
 *de apagar uma compra realizada pelo cliente.
 */

public class ApagarCompra {	
	
	
	private static WebDriver driver;
	
	
	/***
	 * Metodo responsavel por clicar no botao login
	 * e redireciona para a pagina inicial
	 */
	
	@SuppressWarnings("deprecation")
	@When("clico em login")
	public void clico_em_login() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement botaoLogin = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@id='login2']"));
		botaoLogin.click();
	}
	
	/***
	 * Metodo responsavel pelo redirecionamento
	 * para a pagina inicial.
	 */
	
	@When("entra na pagina inicial")
	public void entra_na_pagina_inicial() {
	  DriverDemoBlazer.getDriver().navigate().to("https://demoblaze.com/");
	}
	
	/***
	 * Metodo responsavel por clicar no link <cart>
	 * e redirecionar para o carrinho de compras
	 */
	
	@SuppressWarnings("deprecation")
	@When("clico no link <cart>")
	public void clico_no_link_cart() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement linkCart = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@id='cartur']"));
		linkCart.click();
	}
	
	/***
	 * Metodo responsavel por clicar no 
	 * botao delete e apagar uma compra.
	 * 
	 */
	
	@SuppressWarnings("deprecation")
	@Then("clico no botao <delete>")
	public void clico_no_botao_delete() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement botaoDelete = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@onclick=\"deleteItem('5d8ea01e-11ac-3a0d-1d3c-35ed2f182263')\"]"));
		botaoDelete.click();
	}

}