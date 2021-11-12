package com.demoblazer.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demoblazer.driver.DriverDemoBlazer;
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
	 * 
	 */
	
		@When("escolhe produto que deseja comprar")
		public void escolhe_produto_que_deseja_comprar() {
			WebElement produto = DriverDemoBlazer.getDriver()
					.findElement(By.xpath("//a[@href='prod.html?idp_=1']"));
			produto.click();
		}
	
		/***
		 * 
		 */
		
		@Then("adiciona o produto no carrinho")
		public void adiciona_o_produto_no_carrinho() {
			WebElement adicionaProduto = DriverDemoBlazer.getDriver()
					.findElement(By.xpath("//a[@onclick='addToCart(1)']"));
			adicionaProduto.click();
		}
		
		@Then("vai para a pagina do carrinho de compra")
		public void vai_para_a_pagina_do_carrinho_de_compra() {
			DriverDemoBlazer.getDriver().navigate().to("https://demoblaze.com/cart.html");
		}
		
		@Then("clica no botao <place order>")
		public void clica_no_botao_place_order() {
			WebElement botaoPlaceOrder = DriverDemoBlazer.getDriver().findElement(By.xpath("//button[@class='btn btn-success']"));
			botaoPlaceOrder.click();
		}
		
		@Then("preencho o formulario")
		public void preencho_o_formulario() {
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
		
		@Then("envia o formulario")
		public void envia_o_formulario() {
			WebElement btPurchase = DriverDemoBlazer.getDriver().findElement(By.xpath("//button[@onclick=\"purchaseOrder()\"]"));
			btPurchase.click();
		}
	
}
