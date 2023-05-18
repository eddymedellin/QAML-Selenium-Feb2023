package Steps;
import Pages.DemoBlazePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class DemoBlazeSteps extends BaseSteps{
    private DemoBlazePage demoBlazePage = new DemoBlazePage(webDriver);
    public DemoBlazeSteps(WebDriver driver) {
        super(driver);
    }
    public void getDemoblazePage(){
        webDriver.get("https://www.demoblaze.com/");
    }
    private List<WebElement> getMenuElementsList(){
        return demoBlazePage.findDemoBlazeMenuElementsList();
    }
    public int  countMenuElements(){
        return getMenuElementsList().size();
    }
    public void printMenuElements(){
        List<WebElement> listMenu =  getMenuElementsList();
        for(WebElement menuOption:listMenu){
            imprimir(menuOption.getText());
        }
    }
}