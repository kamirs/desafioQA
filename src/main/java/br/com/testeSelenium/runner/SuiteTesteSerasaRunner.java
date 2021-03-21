package br.com.testeSelenium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty" }, 
tags = {"@ConsultarInformacaoDoCPF, @ConsultarInformacaoDoCPF"}, //, "html:target/cucumber"
features = "src\\main\\resources\\features",
monochrome=true
,glue={"br.com.testeSelenium.steps"})

public class SuiteTesteSerasaRunner {

}
