package cucumberfirstscript;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:C:\\softwares\\cucumber3.json"}, tags= {"@SmokeTest" })
public class Runnerclass {

}
