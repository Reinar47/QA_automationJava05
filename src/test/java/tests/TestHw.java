package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class TestHw  implements InputData{

    private WebDriver driver;

    private String userEmail;

    static {
        WebDriverManager.chromedriver().setup();
    }
//    @BeforeMethod
//    public void setUp(){
//        driver = new ChromeDriver();
//    }
//
//    @AfterMethod()
//    public void TearDown(){
//        driver.quit();
//    }
    @BeforeGroups("checkBay")
    public void setUpCheckBay(){
        driver = new ChromeDriver();
    }
    @AfterGroups("checkBay")
    public void TearDownCheckBay(){
        driver.quit();
    }
    @BeforeGroups("ZIP")
    public void setUpZIP(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterGroups("ZIP")
    public void TearDownZIP(){
        driver.quit();
    }



    @Test(priority = 1,groups = "ZIP")
    public void testZIP() throws InterruptedException {

        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        threadSleep500();
        inputTextByXPath(driver,"//input[@name=\"zip_code\"]",ZIPcode());
        threadSleep500();
        buttonClickXpath(driver,"//input [@value=\"Continue\"]");
        threadSleep500();

        assertText(driver,"//p[1]//*","Sign Up");
    }
    @Test(priority = 2,groups = "ZIP")
    public void testZIPNegative() throws InterruptedException {
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        threadSleep500();
        inputTextByXPath(driver,"//input[@name=\"zip_code\"]","");
        threadSleep500();
        buttonClickXpath(driver,"//input [@value=\"Continue\"]");
        threadSleep500();
        assertText(driver,"//span[@class=\"error_message\"]",
                "Oops, error on page. ZIP code should have 5 digits");
    }
    @Test(priority = 1,groups = "checkBay",dependsOnGroups = "ZIP")
    public void testSign_Up() throws InterruptedException {

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=607056");
        threadSleep500();
        inputTextByName(driver,"first_name",first_Name());
        inputTextByName(driver,"last_name",last_Name());
        inputTextByName(driver,"email",email());
        inputTextByName(driver,"password1",password());
        inputTextByName(driver,"password2",password());
        buttonClickXpath(driver,"//input[@value=\"Register\"]");
        threadSleep500();
        assertText(driver,"//span[@class=\"confirmation_message\"]","Account is created!");
        userEmail = driver.findElement(By.xpath("//td/b")).getText();
        System.out.println(userEmail);
    }
    @Test(priority = 2,groups = "checkBay",dependsOnMethods = "testSign_Up")
    public void testLog_In() throws InterruptedException {

        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        threadSleep500();
        inputTextByXPath(driver,"//input[@name=\"email\"]",userEmail);
        inputTextByXPath(driver,"//input[@name=\"password\"]",password());
        buttonClickXpath(driver,"//input[@value=\"Login\"]");
        threadSleep500();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.sharelane.com/cgi-bin/main.py");
    }
    @Test(priority = 3,groups = "checkBay",dependsOnMethods = "testLog_In")
    public void testBay() throws InterruptedException {

//        driver.get("https://www.sharelane.com/cgi-bin/main.py");
//        threadSleep500();
//        inputTextByXPath(driver,"//input[@name=\"email\"]",userEmail);
//        inputTextByXPath(driver,"//input[@name=\"password\"]",password());
//        buttonClickXpath(driver,"//input[@value=\"Login\"]");
//        threadSleep500();
        buttonClickXpath(driver,"//tr[@align=\"center\"]/td/a/*");
        threadSleep500();
        buttonClickXpath(driver,"//img[@src=\"../images/add_to_cart.gif\"]");
        assertText(driver,"//span [@class=\"confirmation_message\"]","Book was added to the Shopping Cart");

    }
    @Test(priority = 4,groups = "checkBay",dependsOnMethods = "testBay")
    public void testBayMultiple() throws InterruptedException {
//        driver.get("https://www.sharelane.com/cgi-bin/main.py");
//        threadSleep500();
//        inputTextByXPath(driver,"//input[@name=\"email\"]",userEmail);
//        inputTextByXPath(driver,"//input[@name=\"password\"]",password());
//        buttonClickXpath(driver,"//input[@value=\"Login\"]");
//        threadSleep500();
//        buttonClickXpath(driver,"//tr[@align=\"center\"]/td/a[@href]/img[@src]");
//        threadSleep500();
//        buttonClickXpath(driver,"//p/a [@href]/img[@src]");
//        threadSleep500();
        buttonClickXpath(driver,"//a[@href=\"./shopping_cart.py\"]");
        assertValueByXpath(driver,"//td/input[@type=\"text\"]","value","1");
        assertText(driver,"//tbody/tr[@align=\"center\"][2]/td[4]","10.00");
        assertText(driver,"//tbody/tr[@align=\"center\"][2]/td[7]","10.70");
        cleanField(driver,"//td/input[@type=\"text\"]");
        inputTextByXPath(driver,"//td/input[@type=\"text\"]","3");
        buttonClickXpath(driver,"//input [@value=\"Update\"]");
        threadSleep500();
        assertText(driver,"//tbody/tr[@align=\"center\"][2]/td[4]","10.00");
        assertText(driver,"//tbody/tr[@align=\"center\"][2]/td[7]","32.10");

    }


//    public void assertText(String locator,String text){                         //https://www.sharelane.com/cgi-bin/main.py
//        WebElement assertTexField = driver.findElement(By.xpath(locator));
//        Assert.assertEquals(assertTexField.getText(),text);
//    }
//
//    public void inputTextByXPath(String locator, String text){
//        WebElement inputTextField = driver.findElement(By.xpath(locator));
//        inputTextField.sendKeys(text);
//    }
//    public void buttonClick(String locator){
//        WebElement buttonClick = driver.findElement(By.xpath(locator));
//        buttonClick.click();
//    }
//

}
