package demoblazer.pageObject;

import org.openqa.selenium.WebDriver;

public class IndexObject {
		
	private static String pagina = "https://demoblaze.com/";
	
	private WebDriver webDriver;
	
	public IndexObject(WebDriver driver) {
		this.webDriver = driver;
	}
	
	public void abrePagina() {
		webDriver.navigate().to(pagina);
	}
}
