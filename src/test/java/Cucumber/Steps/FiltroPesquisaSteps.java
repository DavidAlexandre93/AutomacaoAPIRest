package Cucumber.Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constante.ScreenShotCapture;

public class FiltroPesquisaSteps {

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

	public static void Marca() {
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div/div/a[4]/small"))
				.click();
	}

	public static void Modelo() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[2]"))
				.click();
	}

	public static void NomeModelo() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[3]/div/div[4]/div/input"))
				.sendKeys("");
	}

	public static void ClicarModelo() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.linkText("CITY")).click();
	}

	public static void Versao() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[3]"))
				.click();
	}

	public static void NomeVersao() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[2]/div/div[3]/div/input"))
				.sendKeys("1.5 SPORT 16V FLEX 4P MANUAL");
	}

	public static void ClicarVersao() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.linkText("1.5 SPORT 16V FLEX 4P MANUAL")).click();
	}

	public static void VerificarMarcaModeloPesquisado() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.cssSelector("tr[class='title-search']")).getText().equals("Honda City 1.5 Sport 16v Flex 4p Manual Novos e Usados");
	}

	public static void Evidencias() throws Exception {
		ScreenShotCapture.screenShot();
		ScreenShotCapture.arquivosDir();
	}

}
