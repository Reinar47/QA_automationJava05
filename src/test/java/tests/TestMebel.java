package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMebel implements InputData{

    private WebDriver driver;
    static {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod()
    public void TearDown(){
        driver.quit();
    }
    @Test
    public void testMeny() throws InterruptedException {

        driver.get("https://k3-mebel.ru/");
        threadSleep1000();
        buttonClickXpath(driver,"//li [@id=\"menu-item-16\"]/a[@href=\"https://k3-mebel.ru/about.html\"]");
        threadSleep1000();
        buttonClickXpath(driver,"//li[@class=\"page_item page-item-64\"]/a [@href]");
        threadSleep1000();
        buttonClickXpath(driver,"//li[@class=\"page_item page-item-101\"]/a [@href]");
        threadSleep1000();
        buttonClickXpath(driver,"//li[@class=\"page_item page-item-105\"]/a [@href]");
        threadSleep1000();
        buttonClickXpath(driver,"//li[@class=\"page_item page-item-108\"]/a [@href]");
        threadSleep1000();
        buttonClickXpath(driver,"//li[@class=\"page_item page-item-433\"]/a [@href]");
    }

    //li [@id="menu-item-15225"]/a[@href]
    @Test
    public void testMenuFooter() throws InterruptedException {

        driver.get("https://k3-mebel.ru/");
        threadSleep500();
        scrollDown(driver,"//li [@id=\"menu-item-15225\"]/a[@href]");
        threadSleep1000();
        buttonClickXpath(driver,"//li [@id=\"menu-item-15225\"]/a[@href]");

    }
}
