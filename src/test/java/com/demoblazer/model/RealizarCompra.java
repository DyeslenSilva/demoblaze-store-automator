package com.demoblazer.model;

import org.openqa.selenium.WebDriver;

import demoblazer.pageObject.CompraPageObject;
import demoblazer.pageObject.LoginPageObject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RealizarCompra extends CompraPageObject{
	
	public RealizarCompra(WebDriver driver) {
		super(driver);
	}
	
	@When("escolhe produto que deseja comprar")
	public void escolhe_produto_que_deseja_comprar() {
		escolheProduto();
	}
	
	@Then("adiciona o produto no carrinho")
	public void adiciona_o_produto_no_carrinho() {
		addCarrinho();
	}
	
	@Then("vai para a pagina do carrinho de compra")
	public void vai_para_a_pagina_do_carrinho_de_compra() {
		paginaCart();
	}
	
	@Then("clica no botao <place order>")
	public void clica_no_botao_place_order() {
		placeOrder();
	}
	
	@Then("preencho o formulario")
	public void preencho_o_formulario() {
		preencheForm();
	}
	
	@Then("envia o formulario")
	public void envia_o_formulario() {
		submit();
	}
	
	
}
