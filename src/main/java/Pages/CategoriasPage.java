package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoCategoriasPage extends BasePage{
    public DemoCategoriasPage(WebDriver _webdriver) {
        super(_webdriver);
    }


    private List<WebElement> setListaCategoria(){
        //return webDriver.findElements(By.xpath("//*[contains(@id,'itemc')]"));
        return webDriver.findElements(By.xpath("//div[@class='container']//a[@id='itemc']"));

    }
    public List<WebElement> getListaCategoria(){
        return setListaCategoria();
    }
}
