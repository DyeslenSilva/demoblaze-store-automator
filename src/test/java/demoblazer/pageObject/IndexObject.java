package demoblazer.pageObject;

import org.openqa.selenium.WebDriver;

/***
 * 
 * @author dyeslen.duraes
 *	Classe responsavel pelas configurações
 *de acesso da pagina inicial
 */

public class IndexObject {
		
	/***
	 * Atributo responsavel pela representação
	 *  da pagina inicial.
	 */
	private static String pagina = "https://demoblaze.com/";
	
	/***
	 * Atributo responsavel pela representação
	 * do driver do Google Chrome para o 
	 * Selenium
	 */
	private WebDriver webDriver;
	
	/***
	 * 
	 * @param driver
	 * 
	 * Construtor responsavel por inicializar
	 * o driver do Google Chrome para o 
	 * Selenium.
	 */
	
	public IndexObject(WebDriver driver) {
		this.webDriver = driver;
	}
	
	/***
	 * Metodo responsavel por redirecionar
	 * o usuario para a pagina inicial.
	 */
	public void abrePagina() {
		webDriver.navigate().to(pagina);
	}
}
