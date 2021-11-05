package com.demoblazer.exec;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features" , 
			tags = "@login", glue = "src/test/java/CucumberTestDefinition" )
public class DemoBlazerCucumber{

}