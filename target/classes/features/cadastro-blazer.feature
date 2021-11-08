@cadastro
Feature: cadastro de um usuario
		Scenario: cadastro de um usuario
			When acesso a <homepage>
			And clico no botao <sign up>
			And preencho <username> e <senha>
			And clico no botao <submit>