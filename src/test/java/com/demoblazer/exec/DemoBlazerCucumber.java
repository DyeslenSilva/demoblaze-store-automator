package com.demoblazer.exec;

import org.junit.runner.RunWith;

import cucumber.api.testng.TestNGCucumberRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/login-blazer.feature" , tags = "@login")
public class DemoBlazerCucumber{

}