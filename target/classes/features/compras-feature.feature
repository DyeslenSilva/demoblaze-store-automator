Feature: compras

Background: 
	Given: um usuario deve estar logado no sistema
	
	Scenario: realizar compra
		When realiza login no sistema
		Then escolhe produto que deseja comprar