package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "stepdefinitions",
        features = "src/test/resources/features/login.feature",
        snippets = SnippetType.CAMELCASE)
public class LoginRunner {
}
