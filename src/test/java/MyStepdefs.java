import SeleniumUtil.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.annotations.Test;

public class MyStepdefs {

    @Given("^the user type is (.*)$")
    public void the_user_type_is(String userType) {
        switch (userType) {
            case "employee":
                System.out.println("the user is employee");
                break;
            case "advisor":
                System.out.println("the user is advisor");
                break;
        }
    }

    @Given("the user type is {String}")
    public void theUserTypeIsEmployee(String userType) {

    }
}
