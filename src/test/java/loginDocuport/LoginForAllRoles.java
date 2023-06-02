package loginDocuport;

import SeleniumUtil.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginForAllRoles extends Base {

    @AfterMethod
    public void teardown() {
        closeDriver();
    }

    // negative login scenario
    // -> test error message for bad password
    // -> test password text fields class attribute changes when no password used
    // -> test error message for attempting to login with no password
    @Test
    public void negativeLoginTest() {
        // login with bad password and test error message
        login(getDriver(), "client1", "badPassword");
        String errorMessageBadPassword = getDriver().findElement(By.xpath("//span[@class='body-1']")).getText();
        Assert.assertEquals(errorMessageBadPassword, "Username or password is incorrect");

        // login with no password and test the attribute has been updated
        // password text field has changed -> shows red
        String normalPasswordClassAttribute = getDriver().findElement(By.xpath("//label[@for='input-15']")).getAttribute("class");
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertNotEquals(getDriver().findElement(By.xpath("//label[@for='input-15']")).getAttribute("class"), normalPasswordClassAttribute);

        // error message is displayed below the password text field
        String errorMessageNoPassword = getDriver().findElement(By.xpath("//div[@class='v-messages__message']")).getText();
        Assert.assertEquals(errorMessageNoPassword, "Please enter your password");

        // afterMethod executes
    }

    // positive test for client
    @Test
    public void validateClientLogin() {
        // login with good client credentials
        login(getDriver(), "client1", "password1");
        
        // checks to see if the avatar(WebElement only found once logged in) is displayed
        isDisplayed(getDriver().findElement(By.xpath("//div[@class='v-avatar primary']")));
        
        // afterMethod executes
    }

    // positive test for supervisor
    @Test
    public void validateSupervisorLogin() {
        // login with good supervisor credentials
        login(getDriver(), "supervisor1", "password1");
        
        // checks to see if the avatar(WebElement only found once logged in) is displayed
        isDisplayed(getDriver().findElement(By.xpath("//div[@class='v-avatar primary']")));
        
        // afterMethod executes
    }

    // positive test for advisor
    @Test
    public void validateAdvisorLogin() {
        // login with good client credentials
        login(getDriver(), "advisor1", "password1");
        
        // checks to see if the avatar(WebElement only found once logged in) is displayed
        isDisplayed(getDriver().findElement(By.xpath("//div[@class='v-avatar primary']")));
        
        // afterMethod executes
    }

    // positive test for employee
    @Test
    public void validateEmployeeLogin() {
        // login with good client credentials
        login(getDriver(), "employee1", "password1");
        
        // checks to see if the avatar(WebElement only found once logged in) is displayed
        isDisplayed(getDriver().findElement(By.xpath("//div[@class='v-avatar primary']")));
        
        // afterMethod executes
    }
}
