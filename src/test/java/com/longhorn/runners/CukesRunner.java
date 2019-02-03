package com.longhorn.runners;
//first pull req

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        features = "src/test/resources/features/purchases.feature"

)


public class CukesRunner {
}
