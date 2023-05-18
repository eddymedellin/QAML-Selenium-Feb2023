package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver webDriver;

    public BasePage(WebDriver webdriver){
        this.webDriver = webdriver;
    }
}
