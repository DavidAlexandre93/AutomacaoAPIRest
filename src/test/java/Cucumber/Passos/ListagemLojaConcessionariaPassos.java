package Cucumber.Passos;

import Constante.Utils;
import Cucumber.Steps.ListagemLojaConcessionariaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListagemLojaConcessionariaPassos {

	@Given("^acessou a tela principal$")
	public void acessarTelaPrincipal() throws Throwable {
		ListagemLojaConcessionariaSteps.SetUp();
		Utils.WaitElement();
	}

	@When("^Ver ofertas$")
	public void verOfertas() throws Throwable {
		ListagemLojaConcessionariaSteps.VerOfertas();
	}

	@When("^selecionar Loja$")
	public void loja() throws Throwable {
		ListagemLojaConcessionariaSteps.SelecionarLoja();
	}

	@When("^selecionar Concessionaria$")
	public void concessionaria() throws Throwable {
		ListagemLojaConcessionariaSteps.SelecionarConcessionaria();
	}

	@When("^selecionar Carro$")
	public void carro() throws Throwable {
		ListagemLojaConcessionariaSteps.SelecionarCarro();
	}

	@When("^selecionar Listagem de estoque$")
	public void verEstoque() throws Throwable {
		ListagemLojaConcessionariaSteps.ClicarVerEstoque();
	}

	@Then("^realiza a consulta de estoque com sucesso$")
	public void listagemEstoque() throws Throwable {
		ListagemLojaConcessionariaSteps.VerificarConcecionaria();
	}

}
