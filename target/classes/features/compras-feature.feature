@compras	
Feature: compras

	Scenario: realizar compra
		When escolhe produto que deseja comprar
		Then  adiciona o produto no carrinho
		And vai para a pagina do carrinho de compra
		And clica no botao <place order>
		And preencho o formulario
		And envia o formulario