package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utils.BeforeSuite;
import utils.DataToFeature;
import utils.RunnerPersonalizado;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = {"src/test/resources/features"},
                 glue = "stepdefinitions",
                 snippets= CucumberOptions.SnippetType.CAMELCASE)
//                 tags = "@Regresion",
//                 plugin = {"pretty","json:target/cucumber-reports/cucumber.json"},

public class DominioRunner {

}
