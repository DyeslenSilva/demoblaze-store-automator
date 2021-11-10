package com.demoblazer.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demoblazer.driver.DriverDemoBlazer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RealizarCompra {
	
	
		@When("escolhe produto que deseja comprar")
		public void escolhe_produto_que_deseja_comprar() {
			WebElement produto = DriverDemoBlazer.getDriver().findElement(By.xpath(""));
			produto.click();
		}
		
		@Then("adiciona o produto no carrinho")
		public void adiciona_o_produto_no_carrinho() {
			WebElement adicionaProduto = DriverDemoBlazer.getDriver().findElement(By.xpath(""));
			adicionaProduto.click();
		}
		
		@Then("vai para a pagina do carrinho de compra")
		public void vai_para_a_pagina_do_carrinho_de_compra() {
			DriverDemoBlazer.getDriver().navigate().to("");
		}
		
		@Then("clica no botao <place order>")
		public void clica_no_botao_place_order() {
			WebElement botaoPlaceOrder = DriverDemoBlazer.getDriver().findElement(By.xpath(""));
			botaoPlaceOrder.click();
		}
		
		@Then("preencho o formulario")
		public void preencho_o_formulario() {
			WebElement txName = DriverDemoBlazer.getDriver().findElement(By.xpath(""));
			WebElement txCountry = DriverDemoBlazer.getDriver().findElement(By.xpath(""));
			WebElement txCity = DriverDemoBlazer.getDriver().findElement(By.xpath(""));
			WebElement txCreditCard = DriverDemoBlazer.getDriver().findElement(By.xpath(""));
			WebElement txMonth = DriverDemoBlazer.getDriver().findElement(By.xpath(""));
			WebElement txYear = DriverDemoBlazer.getDriver().findElement(By.xpath(""));
			
			txName.sendKeys("");
			txCountry.sendKeys("");
			txCity.sendKeys("");
			txCreditCard.sendKeys("");
			txMonth.sendKeys("");
			txYear.sendKeys("");
		}
		
		@Then("envia o formulario")
		public void envia_o_formulario() {
			WebElement btPurchase = DriverDemoBlazer.getDriver().findElement(By.xpath(""));
			btPurchase.click();
		}
	
}
