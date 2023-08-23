package com.cucumber.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"./src/test/resources/facebooksingle.feature"},glue= {"StepDefinitions"},
dryRun=false, snippets=SnippetType.CAMELCASE,
monochrome=true,plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:Reports/facebooksinglehead.html"})
public class FaceBookSingleRunner {

}
