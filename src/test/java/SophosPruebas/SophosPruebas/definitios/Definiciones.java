package SophosPruebas.SophosPruebas.definitios;

import org.openqa.selenium.WebDriver;
import SophosPruebas.SophosPruebas.steps.Conexion;
import SophosPruebas.SophosPruebas.steps.RealizarBusqueda;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Definiciones {
	private RealizarBusqueda realizarBusqueda;
	private Conexion conexion;
	private WebDriver driver;
	
		
	@Given("^abrir Pagina$")
	public void abrir_Pagina() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();
	}
	
	@When("^realice la busqueda por (.*)")
	public void realizarBusquedaParametro(String parametro) {
		this.realizarBusqueda = new RealizarBusqueda();
		this.realizarBusqueda.buscar(driver, parametro);
	}
}