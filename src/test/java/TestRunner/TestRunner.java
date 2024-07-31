package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/resources/features/",
        glue={"steps"},
        tags="@prod or @staging or @test or @datatable",
        plugin={"html:target/cucumber-reports/cucumber-html-report.html","json:target/cucumber-reports/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
