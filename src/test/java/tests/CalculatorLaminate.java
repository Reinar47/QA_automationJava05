package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CalculatorLaminatePage;

public class CalculatorLaminate extends CalculatorLaminatePage implements InputData {

    @BeforeMethod
    public void setUpCalculatorLaminate(){
     targetTestSiteOpen();
    }
//    @AfterMethod
//    public void TearDownCalculatorLaminate(){
//        targetTestSiteClose();
//    }
     private void cleanFieldsOnSite(String[] arrayFields){
        for (int i = 0; i < arrayFields.length; i++) {
            cleanField(driver,arrayFields[i]);
        }
    }

    @Test
    public void calculatorLaminate_1() {
       cleanFieldsOnSite(getArrayCleanFields());
       inputTextByXPath(driver,getLengthRoom(),"500");
       inputTextByXPath(driver,getWidthRoom(),"500");
       inputTextByXPath(driver,getLengthLaminatePanel(),"1500");
       inputTextByXPath(driver,getWidthLaminatePanel(),"200");
       inputTextByXPath(driver,getNumberOfPanelsInPackage(),"9");
       selectByXpathVisibleText(driver,getLaminatePuttingType(),"с использованием отрезанного элемента");
       inputTextByXPath(driver,getMinimumLengthCut(),"200");
       inputTextByXPath(driver,getWallThreshold(),"10");
       buttonClickXpath(driver,getDirectionOfLaminatePutting_45_degree());
       buttonClickXpath(driver,getColourOfLaminate_1());
       buttonClickXpath(driver,getButtonCalculation());
       WebElement requiredLaminateDesks = driver.findElement(By.xpath(getRequiredLaminateDesks()));
       System.out.println("Требуемое количество досок ламината: " + requiredLaminateDesks.getText());
       WebElement requiredLaminatePackages = driver.findElement(By.xpath(getRequiredLaminatePackages()));
       System.out.println("Количество упаковок ламината: " + requiredLaminatePackages.getText());
       WebElement areaOfBuild = driver.findElement(By.xpath(getAreaOfBuild()));
        System.out.println("Площадь укладки: " + areaOfBuild.getText());

    }
    @Test
    public void calculatorLaminate_2() throws InterruptedException{

        cleanFieldsOnSite(getArrayCleanFields());
        inputTextByXPath(driver,getMinimumLengthCut(),"200");
        inputTextByXPath(driver,getLengthRoom(),"500");
        inputTextByXPath(driver,getWidthRoom(),"500");
        inputTextByXPath(driver,getLengthLaminatePanel(),"1500");
        inputTextByXPath(driver,getWidthLaminatePanel(),"200");
        inputTextByXPath(driver,getNumberOfPanelsInPackage(),"9");
        selectByXpathVisibleText(driver,getLaminatePuttingType(),"со смещение на 1/2 длины");
        inputTextByXPath(driver,getWallThreshold(),"10");
        buttonClickXpath(driver,getDirectionOfLaminatePutting_135_degree());
        buttonClickXpath(driver,getColourOfLaminate_1());
        buttonClickXpath(driver,getButtonCalculation());
        WebElement requiredLaminateDesks = driver.findElement(By.xpath(getRequiredLaminateDesks()));
        System.out.println("Требуемое количество досок ламината: " + requiredLaminateDesks.getText());
        WebElement requiredLaminatePackages = driver.findElement(By.xpath(getRequiredLaminatePackages()));
        System.out.println("Количество упаковок ламината: " + requiredLaminatePackages.getText());
        WebElement areaOfBuild = driver.findElement(By.xpath(getAreaOfBuild()));
        System.out.println("Площадь укладки: " + areaOfBuild.getText());

    }




    //  //div [@class="calc-result"]//div [@style][1]/span
}
