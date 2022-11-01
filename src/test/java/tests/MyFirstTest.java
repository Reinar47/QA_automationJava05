package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import java.time.Duration;

public class MyFirstTest {
    private WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
    @Test
    public void testBdoWarrior() throws InterruptedException{
        driver.get("https://bdocodex.com/ru/skillbuilder/");
        Thread.sleep(1000);
        WebElement buttobWarrior = driver.findElement(By.xpath("//div[@class='class_cell'][1]/*"));
        buttobWarrior.click();
        Thread.sleep(1000);
        WebElement buttonSkill = driver.findElement(By.xpath
                ("//tr[4]//descendant::button[@class=\"btn btn-gradient btn-success btn-sm slv_plus\"]"));
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            buttonSkill.click();
        }
        Thread.sleep(1000);
        WebElement counter = driver.findElement(By.xpath
                ("//tr[4]//descendant::div[@class='level_cell current_level']"));
        String counterValue = counter.getText();
        Assert.assertEquals(counterValue,"10");

    }
    @Test
    public void testBdoWarrior2() throws InterruptedException{
        driver.get("https://bdocodex.com/ru/skillbuilder/");
        Thread.sleep(1000);
        WebElement buttobWarrior = driver.findElement(By.xpath("//div[@class='class_cell'][1]/*"));
        buttobWarrior.click();
        Thread.sleep(1000);
        WebElement buttonSkillAbsolute = driver.findElement(By.xpath
                ("//div[@data-gid=\"618\"]"));
        buttonSkillAbsolute.click();
        Thread.sleep(1000);
        WebElement counter = driver.findElement(By.xpath
                ("//tr[4]//descendant::div[@class='level_cell current_level']"));
        String counterValue = counter.getText();
        Assert.assertEquals(counterValue,"10");

    }
    @Test
    public void testBdoSearch() throws InterruptedException {
        driver.get("https://bdocodex.com/ru/skillbuilder/");
        Thread.sleep(1000);
        WebElement searchfield = driver.findElement(By.id("searchfield"));
        searchfield.sendKeys("марни");
        Thread.sleep(1000);
        WebElement searchButton = driver.findElement(By.xpath
                ("//button[@class=\"btn btn-primary btn-gradient btn navbar-btn mt-2 ms-2\"]"));
        searchButton.click();
        Thread.sleep(1000);
    }




    }











//    WebElement textBox = driver.findElement(By.name("my-text"));
//    WebElement submitButton = driver.findElement(By.cssSelector("button"));            ////div[@data-gid="519"]

//     textBox.sendKeys("Selenium");
//        submitButton.click();

//    String value = message.getText();
//     driver.quit();

//       -------------------------------------------------------
//    public void eightComponents() {
//    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//
//    String title = driver.getTitle();
//    assertEquals("Web form", title);
//
//    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//
//    WebElement textBox = driver.findElement(By.name("my-text"));
//    WebElement submitButton = driver.findElement(By.cssSelector("button"));
//
//    textBox.sendKeys("Selenium");
//    submitButton.click();
//
//    WebElement message = driver.findElement(By.id("message"));
//    String value = message.getText();
//    assertEquals("Received!", value);
//}


