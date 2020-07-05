package SophosPruebas.SophosPruebas.definitios;

import org.openqa.selenium.WebDriver;
import SophosPruebas.SophosPruebas.steps.Conexion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Definiciones {

	private Conexion conexion;
	@Given("^abrir Pagina$")
	public void abrir_Pagina() {
		this.conexion = new Conexion();
		this.conexion.abrirNavegador();
	}
	
}