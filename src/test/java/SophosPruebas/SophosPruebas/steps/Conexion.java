package SophosPruebas.SophosPruebas.steps;

import static org.junit.Assert.assertEquals;

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
		String baseUrl =("https://www.google.com.co/");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		assertEquals("https://www.google.com.co/", baseUrl);
		return this.driver;
	}
}
