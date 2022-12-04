package Cucumberoptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Cucumber",glue="Stepdefinition",monochrome=true)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
}
