package com.demoblazer.model;

import org.openqa.selenium.By;
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
	
	/***
	 * Metodo responsavel por clicar no botao login
	 * e redireciona para a pagina inicial
	 */
	
	@When("clico em login")
	public void clico_em_login() {
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
	
	@When("clico no link <cart>")
	public void clico_no_link_cart() {
		WebElement linkCart = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@id='cartur']"));
		linkCart.click();
	}
	
	/***
	 * Metodo responsavel por clicar no 
	 * botao delete e apagar uma compra.
	 * 
	 */
	
	@Then("clico no botao <delete>")
	public void clico_no_botao_delete() {
		WebElement botaoDelete = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@onclick=\"deleteItem('5d8ea01e-11ac-3a0d-1d3c-35ed2f182263')\"]"));
		botaoDelete.click();
	}

}