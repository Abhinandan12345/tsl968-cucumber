package cim.lti.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( monochrome=true,//used to format the console
                 dryRun=false
                  ,features="src/test/resources/features/b.feature",glue="stepdefination",plugin= {"pretty","html:target/tsl968.html","json:target/jsonR/report.json"})
public class runner {

}
