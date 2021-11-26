package com.demoblazer.model;

import java.sql.Driver;

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
 *Classe responsavel por realizar testes de
 *realizar uma compra com sucesso.
 */

public class RealizarCompra {
	
	

	
	/***
	 * Metodo responsavel por escolher 
	 * um produto para compra
	 * @throws InterruptedException 
	 * 
	 */
	
	
		//@SuppressWarnings("deprecation")
		@When("escolhe produto que deseja comprar")
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
		@Then("adiciona o produto no carrinho")
		public void adiciona_o_produto_no_carrinho() throws InterruptedException {
			Thread.sleep(2000);
			WebElement adicionaProduto = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@onclick='addToCart(1)']")); 		
			adicionaProduto.click();
		}
		
		/***
		 * Metodo responsavel por redirecionar para
		 * a pagina de carrinho da compra
		 */
		
		@Then("vai para a pagina do carrinho de compra")
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
		@Then("clica no botao <place order>")
		public void clica_no_botao_place_order() throws InterruptedException {
			Thread.sleep(2000);
			WebElement botaoPlaceOrder = DriverDemoBlazer.getDriver().findElement(By.xpath("//button[@class='btn btn-success']"));
			botaoPlaceOrder.click();
		}
		
		/***
		 * Metodo responsavel por preencher o formulario
		 * de compra.
		 * @throws InterruptedException 
		 */
		
		//@SuppressWarnings("deprecation")
		@Then("preencho o formulario")
		public void preencho_o_formulario() throws InterruptedException {
			Thread.sleep(2000);
			WebElement txName = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id=\"name\"]"));
			WebElement txCountry = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id=\"country\"]"));
			WebElement txCity = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id=\"city\"]"));
			WebElement txCreditCard = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id=\"card\"]"));
			WebElement txMonth = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id=\"month\"]")); 				
			WebElement txYear = DriverDemoBlazer.getDriver().findElement(By.xpath("//input[@id=\"year\"]"));
					
			txName.sendKeys("Dyeslem");
			txCountry.sendKeys("Brasil");
			txCity.sendKeys("Itapevi");
			txCreditCard.sendKeys("38479234");
			txMonth.sendKeys("12");
			txYear.sendKeys("24");
		}
		
		/***
		 * Metodo responsavel por enviar o formulario 
		 * da compra.
		 * @throws InterruptedException 
		 */
		
		@Then("envia o formulario")
		public void envia_o_formulario() throws InterruptedException {
			Thread.sleep(3000);
			WebElement btPurchase = DriverDemoBlazer.getDriver().findElement(By.xpath("//button[@onclick=\"purchaseOrder()\"]"));
			btPurchase.click();
		}
	
}
