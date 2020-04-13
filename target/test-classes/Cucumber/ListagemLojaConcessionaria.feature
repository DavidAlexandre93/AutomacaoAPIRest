@ListagemLojaConcessionaria
Feature: Listagem Loja Concessionaria
  Acessar a pagina e realizar a listagem de estoque
  
  Scenario: Realizar a listagem de estoque de uma loja ou concessionaria
    Given acessou a tela principal
    When Ver ofertas
    And selecionar Loja
    And selecionar Concessionaria
    And selecionar Carro
    And selecionar Listagem de estoque
    Then realiza a consulta de estoque com sucesso