package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver webDriver;
    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebElement setDivDraggable() {
        return webDriver.findElement(By.xpath("//div[@id='draggable']"));
    }

    private WebElement setDivDroppable() {
        return webDriver.findElement(By.xpath("//div[@id='simpleDropContainer']/div[@id='droppable']"));
    }

    private WebElement SetPDropped(){
        return webDriver.findElement(By.xpath("//*[@id='droppable']/p"));
    }

    public WebElement getDivDraggable() {
        return setDivDraggable();
    }

    public WebElement getDivDroppable() {
        return setDivDroppable();
    }

    public WebElement getPDropped(){
        return SetPDropped();
    }
}
