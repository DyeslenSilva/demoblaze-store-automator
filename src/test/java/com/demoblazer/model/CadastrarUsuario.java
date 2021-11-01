package com.demoblazer.model;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import demoblazer.pageObject.IndexObject;
import demoblazer.pageObject.UsuarioPageObject;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CadastrarUsuario extends UsuarioPageObject{
	
	private IndexObject indexObject;
	
	public CadastrarUsuario(WebDriver driver) {
		super(driver);
	}
	
	@When("acessa a pagina de cadastro")
	public void acessa_a_pagina_de_cadastro() {
		indexObject.abrePagina();
	}
	
	@When("preencho o <nome> do usuario e <senha>")
	public void preencho_o_nome_do_usuario_e_senha(String usuario, String senha) {
		cadastroDeUsuarios(usuario, senha);
		
	}
	
	@When("clico no botao submit")
	public void clico_no_botao_submit() {
		clickBotao();
	}
	
	@Then("o cadastro e realizado com sucesso")
	public void o_cadastro_e_realizado_com_sucesso(DataTable dataTable) {
	   assertTrue(false);
	}
}