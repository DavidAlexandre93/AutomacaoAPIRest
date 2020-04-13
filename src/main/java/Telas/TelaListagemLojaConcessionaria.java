package Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaListagemLojaConcessionaria {

	private WebDriver driver;

	public TelaListagemLojaConcessionaria(WebDriver driver) {
		this.driver = driver;
	}

	/********************************************************************
	 * @category Clicar no botao "Ver Ofertas"
	 ********************************************************************/
	public TelaListagemLojaConcessionaria VerOfertas() {
		driver.findElement(By.linkText("Ver Ofertas")).click();
		return this;
	}

	/********************************************************************
	 * @category Selecionar Concessionaria
	 ********************************************************************/
	public TelaListagemLojaConcessionaria SelecionarConcessionaria() {
		driver.findElement(By.id("Concessionária")).click();
		return this;
	}

	/********************************************************************
	 * @category Selecionar Loja
	 ********************************************************************/
	public TelaListagemLojaConcessionaria SelecionarLoja() {
		driver.findElement(By.id("Loja")).click();
		return this;
	}

	/********************************************************************
	 * @category Selecionar Carro
	 ********************************************************************/
	public TelaListagemLojaConcessionaria SelecionarCarro() {
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div[2]/div/div[4]/div/div[1]/div/div[1]/a[1]")).click();
		return this;
	}

	/********************************************************************
	 * @category Clicar ver o estoque de carros
	 ********************************************************************/
	public TelaListagemLojaConcessionaria ClicarVerEstoque() {
		driver.findElement(By.id("VehicleSellerInformationStock")).click();
		return this;
	}

	/********************************************************************
	 * @category Valida tela de concecionaria selecionada
	 ********************************************************************/
	public TelaListagemLojaConcessionaria VerificarConcecionaria(String validaBusca) {
		driver.findElement(By.id("PickUps e Cia")).getText().equals(validaBusca);
		return this;
	}

}
