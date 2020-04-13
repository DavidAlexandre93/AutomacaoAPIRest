package Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaFiltroPesquisa {

	private WebDriver driver;

	public TelaFiltroPesquisa(WebDriver driver) {
		this.driver = driver;
	}

	/********************************************************************
	 * @category Clicar no botao "Ver Ofertas"
	 ********************************************************************/
	public TelaFiltroPesquisa VerOfertas() {
		driver.findElement(By.linkText("Ver Ofertas")).click();
		return this;
	}

	/********************************************************************
	 * @category Selecionar a Marca
	 ********************************************************************/
	public TelaFiltroPesquisa Marca() {
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div/div/a[4]/small"))
				.click();
		return this;
	}

	/********************************************************************
	 * @category Selecionar o Modelo
	 ********************************************************************/
	public TelaFiltroPesquisa Modelo() {
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[2]"))
				.click();
		return this;

	}

	/********************************************************************
	 * @category Digitar o nome do Modelo
	 ********************************************************************/
	public TelaFiltroPesquisa NomeModelo(String modelo) {
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[3]/div/div[4]/div/input"))
				.sendKeys(modelo);
		return this;
	}

	/********************************************************************
	 * @category Clicar no Modelo Digitado
	 ********************************************************************/
	public TelaFiltroPesquisa ClicarModelo(String modelo) {
		driver.findElement(By.linkText(modelo)).click();
		return this;
	}

	/********************************************************************
	 * @category Selecionar a Versão
	 ********************************************************************/
	public TelaFiltroPesquisa Versao() {
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[3]"))
				.click();
		return this;

	}

	/********************************************************************
	 * @category Digitar o nome da Versão
	 ********************************************************************/
	public TelaFiltroPesquisa NomeVersao(String versao) {
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[2]/div/div[3]/div/input"))
				.sendKeys(versao);
		return this;
	}

	/********************************************************************
	 * @category Clicar na Versao digitada
	 ********************************************************************/
	public TelaFiltroPesquisa ClicarVersao(String versao) {
		driver.findElement(By.linkText(versao)).click();
		return this;
	}

	public TelaFiltroPesquisa VerificarMarcaModeloPesquisado(String validaBusca) {
		driver.findElement(By.cssSelector("tr[class='title-search']")).getText().equals(validaBusca);
		return this;
	}

}
