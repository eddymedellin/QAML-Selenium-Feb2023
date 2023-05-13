package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQASelectMenuPage extends BasePage{
    public DemoQASelectMenuPage(WebDriver _webDriver) {
        super(_webDriver);
    }

    //Aqui van todos los localizadores

    private WebElement setListaColores(){//sets son privates
        return webDriver.findElement(By.id("oldSelectMenu"));
    }

    public WebElement getListaColores(){//gets son publics
        return setListaColores();
    }

    private WebElement setListaCarros(){
        return webDriver.findElement(By.id("cars"));
    }

    public WebElement getListaCarros(){
        return setListaCarros();
    }
}
