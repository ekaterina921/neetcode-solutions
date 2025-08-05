package solutions.randomTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTests {

    WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    public void simpleSeleniumTest1() throws InterruptedException {
        driver.navigate().to("https://www.selenium.dev/");
        driver.findElement(By.className("selenium-button")).click();
        Assertions.assertTrue(true);
    }

    @Test
    public void simpleSeleniumTest2() throws InterruptedException {
        String title = driver.getTitle();

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(title).isEqualTo("Web form");
        softAssert.assertThat(value).isEqualTo("Received!");
        softAssert.assertAll();
    }
}
