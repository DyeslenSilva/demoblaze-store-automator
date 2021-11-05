package demoblazer.pageObject;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class IndexObject {
		
	private static String pagina = "https://www.demoblaze.com/index.html";
	
	private WebDriver webDriver;
	
	public IndexObject(WebDriver driver) {
		this.webDriver = driver;
	}
	
	public void abrePagina() {
		webDriver.get(pagina);
	}
}
