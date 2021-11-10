package com.demoblazer.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demoblazer.driver.DriverDemoBlazer;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApagarCompra {	
	
	@When("clico em login")
	public void clico_em_login() {
		WebElement botaoLogin = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@id='login2']"));
		botaoLogin.click();
	}
	
	@When("entra na pagina inicial")
	public void entra_na_pagina_inicial() {
	  DriverDemoBlazer.getDriver().navigate().to("https://demoblaze.com/");
	}
	
	@When("clico no link <cart>")
	public void clico_no_link_cart() {
		WebElement linkCart = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@id='cartur']"));
		linkCart.click();
	}
	
	@Then("clico no botao <delete>")
	public void clico_no_botao_delete() {
		WebElement botaoDelete = DriverDemoBlazer.getDriver().findElement(By.xpath("//a[@onclick=\"deleteItem('5d8ea01e-11ac-3a0d-1d3c-35ed2f182263')\"]"));
		botaoDelete.click();
	}

}