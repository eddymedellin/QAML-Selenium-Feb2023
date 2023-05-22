package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.plaf.PanelUI;


public class DemoQADroppablePage extends BasePage{
    public DemoQADroppablePage(WebDriver webDriver) {
        super(webDriver);
    }

    /*private WebElement setDivDraggable() {
        return webDriver.findElement(By.xpath("//div[@id='draggable']"));
    }

    private WebElement setDivDroppable() {
        return webDriver.findElement(By.xpath("//div[@id='simpleDropContainer']/div[@id='droppable']"));
    }

    public WebElement getDivDraggable() {
        return setDivDraggable();
    }

    public WebElement getDivDroppable() {
        return setDivDroppable();
    }
*/


   //////////////////////Page Factory Selenium, se pueden quitar los métodos de arriba////////////////////////

    @FindBy(xpath = "//div[@id='draggable']")
    private WebElement divDraggable;

    @FindBy(xpath = "//div[@id='simpleDropContainer']/div[@id='droppable']")
    private WebElement divDroppable;


    public WebElement getDroppable(){
        return divDroppable;
    }

    public WebElement getDraggable(){
        return divDraggable;
    }
}

