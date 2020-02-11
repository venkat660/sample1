package testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="E:\\RELAX\\ECLIPSE WORK FOLDER\\CUCUMBER\\Feature\\Amazon.feature",glue="cucumberpackage", monochrome=true,tags=("@flipkartsearchingaproduct"))

public class Amazontestrun {

}
