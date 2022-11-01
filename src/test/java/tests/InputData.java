package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public interface InputData{
    default String ZIPcode(){
        return "604067";
    }
    default String first_Name(){
        return "John";
    }
    default String last_Name() {
        return "Smith";
    }
    default String email(){
        return "xxx@yyy.com";
    }
    default String password(){
        return "1111";
    }


    default void threadSleep1000() throws InterruptedException{
        Thread.sleep(1000);
    }
    default void threadSleep500() throws InterruptedException{
        Thread.sleep(500);
    }
    default void buttonClickXpath(WebDriver driver, String locator){
        driver.findElement(By.xpath(locator)).click();
    }

    default void inputTextById(WebDriver driver,String locator, String text){
        driver.findElement(By.id(locator)).sendKeys(text);
    }
    default void inputTextByXPath(WebDriver driver,String locator, String text){
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }
    default void inputTextByName(WebDriver driver,String locator, String text){
        driver.findElement(By.name(locator)).sendKeys(text);
    }
    default void assertText(WebDriver driver,String locator,String text) throws InterruptedException {
        WebElement assertTexField = driver.findElement(By.xpath(locator));
        Assert.assertEquals(assertTexField.getText(),text);
        threadSleep500();
    }
    default void urlCheck(WebDriver driver,String expectedUrl){
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }
    default void cleanField(WebDriver driver,String locator){
        WebElement textField = driver.findElement(By.xpath(locator));
        textField.clear();
    }
    default void assertValueByXpath(WebDriver driver,String locator,String value,String text){
        WebElement assertTexField = driver.findElement(By.xpath(locator));
        Assert.assertEquals(assertTexField.getAttribute(value),text);
    }
    default void assertValueByName(WebDriver driver,String locator,String value,String text){
        WebElement assertTexField = driver.findElement(By.name(locator));
        Assert.assertEquals(assertTexField.getAttribute(value),text);
    }
    default void selectByXpathVisibleText(WebDriver driver,String locator,String visibleText){
        Select selectBox = new Select(driver.findElement(By.xpath(locator)));
        selectBox.selectByVisibleText(visibleText);
    }
    default void selectByXpathIndex(WebDriver driver,String locator,int index){
        Select selectBox = new Select(driver.findElement(By.xpath(locator)));
        selectBox.selectByIndex(index);
    }
    default void selectByXpathByValue(WebDriver driver,String locator,String value){
        Select objSelect = new Select(driver.findElement(By.xpath(locator)));
        objSelect.selectByValue(value);
    }
    default void scrollDown(WebDriver driver,String locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath(locator));
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }





}
