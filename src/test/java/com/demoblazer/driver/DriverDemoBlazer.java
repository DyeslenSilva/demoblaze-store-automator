package com.demoblazer.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverDemoBlazer {
	/***
	 * Classe responsavel pela onfigura��o do 
	 * driver do Google Chrmome para o selenium
	 */
	

	private static WebDriver driver;

	/***
	 * Metodo responsavel pela configura�ao 
	 * do driver
	 */
	public static void setDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
