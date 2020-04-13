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
import Telas.TelaListagemLojaConcessionaria;

/******************************************************************
 * @category Teste para realizar a Listagem de estoque de uma concessionaria
 ********************************************************************/

public class ListagemLojaConcessionaria {

	private WebDriver driver;

	ChamadaMassa massaDados = new ChamadaMassa();
	// ScreenShotCapture telaScreen = new ScreenShotCapture();

	@Before
	public void IniciarBrowser() {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void ListagemEstoque() {

		try {

			JSONObject obj = massaDados.dadosJson();

			ConfigFunction config = new ConfigFunction(driver);
			TelaListagemLojaConcessionaria listagem = new TelaListagemLojaConcessionaria(driver);

			config.acessar();
			ScreenShotCapture.screenShot();
			listagem.VerOfertas();
			ScreenShotCapture.screenShot();
			listagem.SelecionarConcessionaria();
			ScreenShotCapture.screenShot();
			listagem.SelecionarLoja();
			ScreenShotCapture.screenShot();
			listagem.SelecionarCarro();
			ScreenShotCapture.screenShot();
			listagem.ClicarVerEstoque();
			ScreenShotCapture.screenShot();
			listagem.VerificarConcecionaria((String)obj.get("validaBusca"));
			ScreenShotCapture.arquivosDir();

		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	@After
	public void FinalizarExecucao() {
		driver.quit();
	}

}
