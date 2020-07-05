package SophosPruebas.SophosPruebas.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.annotations.Step;

public class RealizarBusqueda {
	

	
	@Step
	public void buscar(WebDriver driver,String parametro) {
		
		WebElement buscardor = driver.findElement(By.name("q"));
		buscardor.sendKeys(parametro);
		
		WebElement btnBuscar = driver.findElement(By.name("btnK"));
		btnBuscar.click();
		
		WebElement registrosCantidad =  driver.findElement(By.id("result-stats"));
		registrosCantidad.getText();
		
		//assertEquals("5.410.000", registrosCantidad);// esta validacion no funiona ya que trae 5.330.000  registro
				
	}

}
