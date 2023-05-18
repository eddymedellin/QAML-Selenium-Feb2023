package Steps;
import Pages.DemoBlazePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DemoBlazeSteps extends BaseSteps{

    private DemoBlazePage demoBlazePage = new DemoBlazePage(webDriver);
    public DemoBlazeSteps(WebDriver driver) {
        super(driver);
    }

    public void abrirPaginaDemoBlaze(){
        webDriver.get("https://www.demoblaze.com/");
        imprimir("Navegando en Demo Blaze");
    }

    public List<WebElement> findCategories(){
        return demoBlazePage.getCategories();
    }



    public List<WebElement> printCategories(){
    for (WebElement webElement: demoBlazePage.getCategories()){
        String name = webElement.getText();
        System.out.println(name);
        }
        return  null;
    }
}
