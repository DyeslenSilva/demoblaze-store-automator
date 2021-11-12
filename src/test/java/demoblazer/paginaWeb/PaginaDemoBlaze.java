package demoblazer.paginaWeb;

import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author dyeslen.duraes
 *Classe responsavel por representar 
 *o driver do Google Chrome para 
 *o Selenium.
 */
public class PaginaDemoBlaze {
	
	/***
	 * Atributo responsavel pela 
	 * representação do driver do
	 * Google Chrome para o Selenium.
	 */
	ChromeDriver chromeDriver = null;
	
	/***
	 * Construtor responsavel por 
	 * inicializar o driver do Google
	 * Chrome para o Selenium.
	 */
	
	public PaginaDemoBlaze() {
		chromeDriver = new ChromeDriver();
	}
}
