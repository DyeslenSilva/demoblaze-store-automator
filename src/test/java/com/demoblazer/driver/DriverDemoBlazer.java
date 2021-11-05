package com.demoblazer.driver;

import io.cucumber.java.BeforeAll;

public class DriverDemoBlazer {
	
	@BeforeAll
	public void properties() {
		System.setProperty("webdriver.chrome.driver", "/demoblaze-store-automator/driver/chromedriver.exe");
	}
	

}
