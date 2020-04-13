package Cucumber.Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constante.ScreenShotCapture;

public class ListagemLojaConcessionariaSteps {

	private static WebDriver driver;

	public static void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webmotors.com.br/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ScreenShotCapture.screenShot();
	}

	public static void VerOfertas() {
		driver.findElement(By.linkText("Ver Ofertas")).click();
		ScreenShotCapture.screenShot();
	}

	public static void SelecionarConcessionaria() {
		driver.findElement(By.id("Concessionária")).click();
	}

	public static void SelecionarLoja() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("Loja")).click();
	}

	public static void SelecionarCarro() {
		ScreenShotCapture.screenShot();
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div[2]/div/div[4]/div/div[1]/div/div[1]/a[1]")).click();
	}

	public static void ClicarVerEstoque() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("VehicleSellerInformationStock")).click();
	}

	public static void VerificarConcecionaria() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("PickUps e Cia")).getText().equals("PickUps e Cia");
	}

	public static void Evidencias() throws Exception {
		ScreenShotCapture.screenShot();
		ScreenShotCapture.arquivosDir();
	}

}
