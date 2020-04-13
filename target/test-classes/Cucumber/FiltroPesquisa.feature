@FiltroPesquisa
Feature: Filtro Pesquisa
  Acessar a pagina e pesquisar o filtro e pesquisa
  
  Scenario: Realizar Filtro e Pesquisa
    Given que acessou a tela principal
    When Ver ofertas
    And selecionar marca
    And selecionar modelo
    And selecionar versao
    Then realiza a consulta com sucesso

   
    
