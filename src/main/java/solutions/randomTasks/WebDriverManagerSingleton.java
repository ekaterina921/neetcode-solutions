package solutions.randomTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverManagerSingleton {

    // ThreadLocal to hold a WebDriver instance for each thread
    private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    // Private constructor
    private WebDriverManagerSingleton() {
    }

    // Method to get the WebDriver instance for the current thread
    public static WebDriver getDriver(String browser) {
        if (threadLocalDriver.get() == null) {
            WebDriver driver;

            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browser);
            }
            threadLocalDriver.set(driver);
        }
        return threadLocalDriver.get();
    }

    // Method to quit the driver for the current thread
    public static void quitDriver() {
        if (threadLocalDriver.get() != null) {
            threadLocalDriver.get().quit();
            threadLocalDriver.remove(); // Remove the driver from ThreadLocal
        }
    }
}

