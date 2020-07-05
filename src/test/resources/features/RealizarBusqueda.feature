#Jhonatan Medina
# búsqueda digitar el valor "Sophos solutions" y solicitar la búsqueda, en la vista de los resultados validar la cantidad de resultados
#07/07/2020
@RealizarBusqueda 
Feature: Validación búsqueda en google de: "Sophos solutions" 

Scenario Outline: : Validación búsqueda en google de: "Sophos solutions" 
	Given abrir Pagina 
	When realice la busqueda por <parametro>
	
	Examples: 
		|parametro|
		|Sophos Solutions|