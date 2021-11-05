package com.demoblazer.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.BeforeAll;

public class DriverDemoBlazer {

	private static WebDriver driver;

	public static void setDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
