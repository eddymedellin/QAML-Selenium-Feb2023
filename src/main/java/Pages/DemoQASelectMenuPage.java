package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQASelectMenuPage extends BasePage{

    public DemoQASelectMenuPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getListaColores(){
        WebElement colorsWebElementLista = webDriver.findElement(By.id("oldSelectMenu"));
        return colorsWebElementLista;
    }

    public WebElement getListaCarros(){
        webDriver.findElement(By.id("cars"));
        return webDriver.findElement(By.id("cars"));
    }

}
