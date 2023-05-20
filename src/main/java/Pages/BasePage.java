package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver webDriver;


    public BasePage(WebDriver _webDriver){
        this.webDriver = _webDriver;
}
    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
