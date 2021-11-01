

@cadastro
Feature: cadastro de um usuario
		Scenario: cadastro de um usuario
				When acessa a pagina de cadastro
				And preencho o <nome> do usuario e <senha>
				And clico no botao submit
				Then o cadastro e realizado com sucesso
				
				|usuario|senha|
				|dyeslen|1701|
				|dy17|1432|
				|dy829|9232|