import Pages.DemoBlazePage;
import Steps.DemoBlazeSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoBlazeTest extends BaseTest{
    private WebDriver webDriver = getWebDriver();
    private DemoBlazeSteps demoBlazeSteps = new DemoBlazeSteps(webDriver);

    @Test
    public void practica5(){
    demoBlazeSteps.abrirPaginaDemoBlaze();

    System.out.println("Las categorias son: ");
    demoBlazeSteps.printCategories();
    int items =demoBlazeSteps.findCategories().size();
    final int itemsExpected = 3;
        Assert.assertEquals(items, itemsExpected);

    }
}
