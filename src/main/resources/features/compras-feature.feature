@compras	
Feature: compras

Background: 
	Given: um usuario deve estar logado no sistema
	
	Scenario: realizar compra
		When escolhe produto que deseja comprar
		Then  adiciona o produto no carrinho
		And vai para a pagina do carrinho de compra
		And clica no botao <place order>
		And preencho o formulario
		And envia o formulario