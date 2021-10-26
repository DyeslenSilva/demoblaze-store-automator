import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazer {
		
		public void demoBlazer() {
			System.setProperty("webdriver.chrome.driver", "/demoblaze-store-automator/driver/chromedriver.exe");
			WebDriver browser = new ChromeDriver();
			browser.navigate().to("	");
		}
	
}
