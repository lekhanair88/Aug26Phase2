package Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\lekha.k.nair\\Desktop\\Workspace-BackUp\\eclipse-Cucumber\\Aug26OB\\src\\resources\\java\\bgDemo.feature",
		tags="@ProductTest",glue= {"BgStepDefinition"})
public class TestRunner {
}
