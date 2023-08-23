package com.cucumber.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"./src/test/resources/opengoogle.feature"},glue= {"StepDefinitions"},
plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:Reports/cucumberReport.html","json:Reports/cucuber.json"})

public class RunnerClass {

}
