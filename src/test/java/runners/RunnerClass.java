package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
// Class01 Notes developed based on jUnit & nUnit. jUnit executes our files
 @RunWith(Cucumber.class)
 @CucumberOptions(
         //features we use to provide the path of all the features file
         features = "src/test/resources/features/Dashboard.feature",
         //glue is where we find implementations for gherkin steps
         //we provide the path of package where we defined all the steps
         glue = "steps",
         // If we set dry run to true, it stops the actual execution and quickly
         // scans all the steps whether they are implemented or not
         // To execute the script - set dry run to false
         dryRun = false,
         // Monochrome cleans your console output for cucumber test if it has
         // irrelevant or unreadable characters in it
         // It is recommended to always set it to true
         monochrome = true,
         tags = "@dashboard"
 )
// in the entire framework, this is always the running point for all tests:
public class RunnerClass {

}
