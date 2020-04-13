package Cucumber.Passos;

import Constante.Utils;
import Cucumber.Steps.FiltroPesquisaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FiltroPesquisaPassos {

	@Given("^que acessou a tela principal$")
	public void acessarTelaPrincipal() throws Throwable {
		FiltroPesquisaSteps.SetUp();
		Utils.WaitElement();
	}

	@When("^Ver ofertas$")
	public void verOfertas() throws Throwable {
		FiltroPesquisaSteps.VerOfertas();
	}

	@When("^selecionar marca$")
	public void marca() throws Throwable {
		FiltroPesquisaSteps.Marca();
	}

	@When("^selecionar modelo$")
	public void modelo() throws Throwable {
		FiltroPesquisaSteps.Modelo();
		FiltroPesquisaSteps.NomeModelo();
		FiltroPesquisaSteps.ClicarModelo();
	}

	@When("^selecionar versao$")
	public void versao() throws Throwable {
		FiltroPesquisaSteps.Versao();
		FiltroPesquisaSteps.NomeVersao();
		FiltroPesquisaSteps.ClicarVersao();
	}

	@Then("^realiza a consulta com sucesso$")
	public void verificarMarcaModeloPesquisado() throws Throwable {
		FiltroPesquisaSteps.VerificarMarcaModeloPesquisado();

	}
}
