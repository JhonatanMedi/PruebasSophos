package SophosPruebas.SophosPruebas.steps;

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
				
	}

}
