package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files
        features ="src/test/resources/features",
        //glue is where we find implementation of gherkin steps
        //we provide path of the package where we define all the step definition
        glue ="Steps",
        //if we set the value of dry run to true, it will stop the execution
        //it quickly scans all the gherkin steps in all the feature files and will
        //give you the missing step definition
        //for actual execution, we need to set the value of dryRun to false
        dryRun = false,
        //tags will identify the scenarios in a group and will execute the scenarios having these tags
        //We use 'and' and 'or' keywords to execute based on conditions
        //no execution will occur because there is no scenario that has both the tags specified
        //tags ="@ali and @nafisa"
        tags ="@test1"
)

public class RunnerClass {
    //it will be empty
}
