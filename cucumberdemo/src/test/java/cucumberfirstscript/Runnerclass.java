package cucumberfirstscript;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:C:\\softwares\\cucumber3.html"}, tags= {"@SmokeTest" })
public class Runnerclass {

}
