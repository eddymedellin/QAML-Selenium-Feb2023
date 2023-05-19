import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class BaseTest {
    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        File ruta = new File("C:\\Drivers-selenium\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", ruta.getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
        return webDriver;
    }
}
