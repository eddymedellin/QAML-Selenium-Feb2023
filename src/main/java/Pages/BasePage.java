package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver webDriver;

    public BasePage(WebDriver _webDriver){
        this.webDriver = _webDriver;
    }
}
