package com.travelnow.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.travelnow.steps",
    plugin = {"pretty", "html:target/reportes/cucumber.html", "json:target/cucumber-report.json"},
    monochrome = true
)
public class TestRunner {
}
