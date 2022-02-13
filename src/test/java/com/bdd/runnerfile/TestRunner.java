package com.bdd.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)


@CucumberOptions(features="C:\\Users\\friends\\eclipse-workspace\\OctBDD\\src\\test\\java\\com\\bdd\\featurefile",
           glue="com.bdd.stepdefinition",
              plugin= {"pretty","html:output/report"},
               tags= {"@Regression"},
                 dryRun=true,// to check the unimplemented steps in the feature file before execution
                 monochrome=true)// display console in proper readable format
public class TestRunner {

}
