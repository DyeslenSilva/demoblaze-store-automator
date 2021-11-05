@login
Feature: login de um usuario
	Scenario: login de um usuario
		When acessa a pagina de login
		And preencho o login e senha
		And clico no botao login
		Then abre pagina do cliente

		