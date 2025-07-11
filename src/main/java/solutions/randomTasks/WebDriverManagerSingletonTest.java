package solutions.randomTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManagerSingletonTest {
private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

private WebDriverManagerSingletonTest(){};

public static WebDriver getDriver(String browser){
    if (threadLocal.get() == null){
        WebDriver driver = switch(browser.toLowerCase()){
            case "chrome" -> new ChromeDriver();
            case "firefox" -> new FirefoxDriver();
            case "edge" -> new EdgeDriver();
            default -> throw new IllegalArgumentException("Unsupported browser: " + browser);
        };
        threadLocal.set(driver);
    }
    return threadLocal.get();
}

public static void quitDriver(){
    if (threadLocal.get() != null) {
        threadLocal.get().quit();
        threadLocal.remove();
    }
}
}
