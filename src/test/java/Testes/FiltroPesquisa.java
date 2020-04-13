package Testes;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constante.ChamadaMassa;
import Constante.ScreenShotCapture;
import Funcoes.ConfigFunction;
import Telas.TelaFiltroPesquisa;

/********************************************************************
 * @category Teste para realizar Pesquisa de Marca e Modelo
 ********************************************************************/

public class FiltroPesquisa {
	
	private WebDriver driver;
	
	ChamadaMassa massaDados = new ChamadaMassa();
	//ScreenShotCapture telaScreen = new ScreenShotCapture();
	
	@Before
	public void IniciarBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void RealizarFiltroPesquisa() {
		
		
		
		try {
			
			JSONObject obj = massaDados.dadosJson();
			
			ConfigFunction config = new ConfigFunction(driver);
			TelaFiltroPesquisa filtroPesquisa = new TelaFiltroPesquisa(driver);
			
		config.acessar();
		ScreenShotCapture.screenShot();
		filtroPesquisa.VerOfertas();
		ScreenShotCapture.screenShot();
		filtroPesquisa.Marca();
		ScreenShotCapture.screenShot();
		filtroPesquisa.Modelo();
		ScreenShotCapture.screenShot();
		filtroPesquisa.NomeModelo((String)obj.get("modelo"));
		ScreenShotCapture.screenShot();
		filtroPesquisa.ClicarModelo((String)obj.get("modelo"));
		ScreenShotCapture.screenShot();
		filtroPesquisa.Versao();
		ScreenShotCapture.screenShot();
		filtroPesquisa.NomeVersao((String)obj.get("versao"));
		ScreenShotCapture.screenShot();
		filtroPesquisa.ClicarVersao((String)obj.get("versao"));
		ScreenShotCapture.screenShot();
		filtroPesquisa.VerificarMarcaModeloPesquisado((String)obj.get("validaBusca"));
		ScreenShotCapture.arquivosDir();
		
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	
	}
	
	@After
	public void FinalizarExecucao() {
		driver.quit();
	}
	
	
}
