/**
 * Created by Allbrax on 09/03/2015.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty"},
                 features = {"src/test/features/"})
public class RunCukesTest {
}