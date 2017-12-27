package configurations;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Akbar on 12/27/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        //reports derectory
        plugin = {"pretty", "html:target/site/cucumber-pretty"},

        //Creates auto method name in camelCase
        snippets = SnippetType.CAMELCASE,

        // Path to feature file
        features = {"src/test/java/features"},

        //Tags to be executed
        tags = {"@sign_in-1"},

        // execution class package
        glue = {"stepdefinitions"}
)










public class TestRunner {
// Ooops
//    We no longer support signing in with this version of the app. Please update to thelatest version.


}
