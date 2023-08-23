package com.cucumber.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/resources/Multipledata.feature"},glue={"StepDefinitions.MultipleData"},
dryRun=false)

public class MultipleDataRunner {

}
