package DriverTrening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;

public class BrowserOpener {

    public static void main(String[] args) {
        setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://tutorials.jenkov.com/java/lambda-expressions.html");
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
