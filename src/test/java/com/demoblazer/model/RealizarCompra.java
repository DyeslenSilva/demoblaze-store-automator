package com.demoblazer.model;

import org.openqa.selenium.WebDriver;

import demoblazer.pageObject.CompraPageObject;
import demoblazer.pageObject.LoginPageObject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RealizarCompra extends CompraPageObject{

	private LoginPageObject loginPageObject;
	
	public RealizarCompra(WebDriver driver) {
		super(driver);
	}
	

	@When("realiza login no sistema")
	public void realiza_login_no_sistema(String login, String senha) {
	   loginPageObject.realizaLogin(login, senha);
	}
	
	@Then("escolhe produto que deseja comprar")
	public void escolhe_produto_que_deseja_comprar() {
		
	}
	@Then("adiciona o produto no carrinho")
	public void adiciona_o_produto_no_carrinho() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("vai para a pagina do carrinho de compra")
	public void vai_para_a_pagina_do_carrinho_de_compra() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("clica no botao <place order>")
	public void clica_no_botao_place_order() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("preencho o formulario")
	public void preencho_o_formulario() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("envia o formulario")
	public void envia_o_formulario() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
}
