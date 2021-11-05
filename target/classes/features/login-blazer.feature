@login
Feature: login de um usuario
	Scenario: login de um usuario
		When acessa a pagina
		And acessa o menu login
		And preencho com <login> e <senha>
		And clico no botao <log in>
		Then abre pagina do cliente

		