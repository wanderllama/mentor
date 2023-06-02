package SeleniumUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base extends Driver{

    private static Properties p = new Properties();

    // static block to read config.properties resource bundle file
    static {
        try {
            FileInputStream file = new FileInputStream("config.properties");
            p.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("Error Occurred While Reading Configuration File");
            e.printStackTrace();
        }
    }

    // method to getProperties from config.properties file
    public static String getProperties(String key) {
        return p.getProperty(key);
    }

//     generic setup BeforeMethod
//    @BeforeMethod
//    public void setup() {
//        driver = getDriver("browser");
//    }

    // generic teardown AfterMethod
//    @AfterMethod
//    public void teardown() {
//        closeDriver();
//    }

    // login positive
    public void login(WebDriver driver, String userName, String passowrd) {
        driver.get(getProperties("docuportUrl"));
        driver.findElement(By.xpath("//input[@id='input-14']")).sendKeys(getProperties(userName));
        driver.findElement(By.xpath("//input[@id='input-15']")).sendKeys(getProperties(passowrd));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    // Create Selenium Objects
    // create WebDriverWait object
    public WebDriverWait createWait(WebDriver driver) {
        return new WebDriverWait(driver , 10);
    }

    // create Actions object
    public Actions createActions(WebDriver driver) {
        return new Actions(driver);
    }

    // create select object
    public Select createSelect(WebElement element) {
        return new Select(element);
    }

    // Assert methods
    // title verification
    public void titleVerification(WebDriver driver , String expectedTitle) {
        Assert.assertEquals(driver.getTitle() , expectedTitle);
    }
    public void titleVerificationContains(WebDriver driver , String expectedTitle) {
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }

    // url verification
    public void urlVerification(WebDriver driver , String url) {
        Assert.assertEquals(driver.getCurrentUrl() , url);
    }
    public void urlVerificationContains(WebDriver driver , String url) {
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
    }

    // text verification
    // text verification is overloaded
    public void textVerification(WebElement element , String text) {
        Assert.assertEquals(element.getText() , text);
    }
    public void textVerification(String actual, String expected) {
        Assert.assertEquals(actual, expected);}
    public void textVerificationContains(WebElement element , String text) {
        Assert.assertTrue(element.getText().contains(text));
    }

    // is displayed verification
    public void isDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }
}
