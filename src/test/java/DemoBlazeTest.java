import Steps.DemoBlazeSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoBlazeTest extends BaseTest{
    public WebDriver webDriver = getWebDriver() ;
    private DemoBlazeSteps demoBlazeSteps = new DemoBlazeSteps(webDriver);
    @Test
    public void validateMenuElementsCount(){
        demoBlazeSteps.getDemoblazePage();
        int menuElementsCount = demoBlazeSteps.countMenuElements();
        demoBlazeSteps.printMenuElements();
        Assert.assertEquals(menuElementsCount, 3);
        demoBlazeSteps.finalizarWebDriver();
    }
}