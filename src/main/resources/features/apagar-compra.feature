@apagar
Feature: apagar compra
	Scenario: apagar compra
		When entra na pagina inicial
		When clico em login
		And preencho com <login> e <senha>
		And clico no botao <log in>
		And entra na pagina inicial
		When escolha produto que deseja comprar
		Then  adicionar o produto no carrinho
		And ir para a pagina do carrinho de compra
	
		Then clico no botao <delete>