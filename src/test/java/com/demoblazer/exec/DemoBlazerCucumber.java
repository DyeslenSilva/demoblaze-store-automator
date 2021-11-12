package com.demoblazer.exec;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/***
 * 
 * @author dyeslen.duraes
 *	Classe responsavel por rodar os testes
 *do projeto.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/compras-feature.feature" , 
			tags = "@compras", glue = "com.demoblazer.model")
public class DemoBlazerCucumber{

}