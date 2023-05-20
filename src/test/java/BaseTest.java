import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class BaseTest {
    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        File rootPath = new File("C:\\Users\\yurio\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", rootPath.getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(options);
        return webDriver;
    }
}
