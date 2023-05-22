package Steps;

import Pages.DemoBlaze;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DemoBlazeSteps extends BaseSteps {

    public DemoBlazeSteps(WebDriver driver) {
        super(driver);
    }

    DemoBlaze demoBlaze = new DemoBlaze(webDriver);

    public void abrirPaginaDemoBlaze(){
        webDriver.get("https://www.demoblaze.com/");
        imprimir("Navegando en DemoBlaze");
    }

    public int obternerNumeroDeCategorias(){
        int numeroDeCategorias = demoBlaze.getCategorias().size();
        return numeroDeCategorias;
    }

}
