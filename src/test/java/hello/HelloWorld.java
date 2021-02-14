package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorld {


    @Test
    public void helloWorld(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.get("https://github.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("header-search-input")));
        WebElement search = driver.findElement(By.className("header-search-input"));

        Assert.assertTrue(search.isDisplayed(), "Verify search box is displayed");
        driver.quit();
    }
}
