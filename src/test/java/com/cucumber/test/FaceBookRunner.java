package com.cucumber.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"./src/test/resources/facebook.feature"},glue= {"StepDefinitions"},
dryRun=false,snippets=SnippetType.CAMELCASE,
plugin= {"pretty","html:Reports/facebookcucum.html"})


public class FaceBookRunner {

}
