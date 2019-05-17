package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.cli.Main;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;


public class TestRunner {
    //Runner for tests
    @Test
    public void testRunner() {
        Main.main(new String[]{
                "--threads", "2",
                "-p", "pretty",
                "-p", "html:target/cucumber-report",
                "-p", "json:target/cucumber-report/cucumber.json",
                "-g", "stepDefinitions", "src/test/java/Features"});
    }
}