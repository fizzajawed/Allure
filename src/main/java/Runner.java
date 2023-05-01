
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/main/java/Feature/Login.feature"},
            //glue = {"com.example.steps"},
            plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})
    public class Runner {
    }

