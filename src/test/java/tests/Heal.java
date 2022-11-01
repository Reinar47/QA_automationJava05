package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HealPage;

public class Heal extends HealPage implements InputData{

//    private WebDriver driver;
//
//    static {
//        WebDriverManager.chromedriver().setup();
//    }
//    @BeforeMethod
//    public void setUp(){
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @AfterMethod()
//    public void TearDown(){
//        driver.quit();
//    }
    @Test
    public void testUrlLogoCheck() throws InterruptedException {
        driver.get("https://healthunify.com/bmicalculator/");
        threadSleep500();
        urlCheck(driver,getUrl());
        assertText(driver,getBMI_CalculatorLogo(),"BMI Calculator");
    }
    @Test
    public void testCalculatorKgSm() throws InterruptedException {
        driver.get("https://healthunify.com/bmicalculator/");
        threadSleep500();
        inputTextByXPath(driver,getWeightXpath(),"85");
        inputTextByXPath(driver,getHeightXpathSm(),"185");
        buttonClickXpath(driver,getCalculateButton());
        threadSleep500();
        assertValueByName(driver,"si","value","24.84");
        assertValueByName(driver,"us","value","25.25");
        assertValueByName(driver,"uk","value","157.73");


    }
    @Test
    public void testCalculatorPoundsFoots() throws InterruptedException {
        driver.get("https://healthunify.com/bmicalculator/");
        threadSleep500();
        selectByXpathByValue(driver,getSelectBoxKilo_Pounds(),"pounds");
        cleanField(driver,getWeightXpath());
        inputTextByXPath(driver,getWeightXpath(),"198");
        selectByXpathByValue(driver,getSelectBoxFoot(),"5");
        selectByXpathByValue(driver,getSelectBoxInch(),"5");
        buttonClickXpath(driver,getCalculateButton());
        threadSleep500();
        assertValueByName(driver,"si","value","33.06");
        assertValueByName(driver,"us","value","33.61");
        assertValueByName(driver,"uk","value","209.93");


    }

}
