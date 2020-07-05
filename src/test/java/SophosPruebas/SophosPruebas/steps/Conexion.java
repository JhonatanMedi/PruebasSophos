package SophosPruebas.SophosPruebas.steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;

public class Conexion {
	

	private WebDriver driver;

	@Before
	@Step
	public WebDriver abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com.co/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//TiemEspera.segundos(2);
		return this.driver;
	}
}
