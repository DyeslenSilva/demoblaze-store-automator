@apagar
Feature: apagar compra
	Scenario: apagar compra
		When clico em login
		And preencho com <login> e <senha>
		And clico no botao <log in>
		And entra na pagina inicial
		And  clico no link <cart>
		Then clico no botao <delete>