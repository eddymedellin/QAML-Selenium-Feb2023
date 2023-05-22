package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DemoBlaze extends BasePage{
    public DemoBlaze(WebDriver _webDriver) {
        super(_webDriver);
    }

    private List<WebElement> setCategorias(){
        return webDriver.findElements(By.xpath("//*[@id='itemc']"));
    }

    public  List<WebElement> getCategorias(){
        return setCategorias();
    }

}
