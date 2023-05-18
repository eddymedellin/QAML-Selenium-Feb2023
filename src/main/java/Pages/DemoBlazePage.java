package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DemoBlazePage extends BasePage {
    public DemoBlazePage(WebDriver webdriver) {
        super(webdriver);
    }

    public List<WebElement> setCategories(){
        return webDriver.findElements(By.xpath("//a[@id='itemc']"));

    }

    public List<WebElement> getCategories(){
        return setCategories();
    }

}

