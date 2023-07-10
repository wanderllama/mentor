package SeleniumUtil;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
//                "json:target/cucumber.json"
//                , "html:target/cucumber_report.html"
//                , "me.jvt.cucumber.report.PrettyReports:target/cucumber"
//                , "rerun:target/rerun.txt"
                 "pretty"
        }
        , features = "src/test/resources/"
        , glue = "src/test/java/"
        , dryRun = true
        , tags = "@wip"
)
public class CukesRunner { }