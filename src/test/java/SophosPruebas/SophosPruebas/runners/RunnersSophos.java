package SophosPruebas.SophosPruebas.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features" , glue = "SophosPruebas.SophosPruebas.definitions", tags ="@Iniciosesion")

public class RunnersSophos {

}
