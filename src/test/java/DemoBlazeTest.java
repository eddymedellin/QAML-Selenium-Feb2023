import Steps.DemoBlazeSteps;
import Steps.DemoQASteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoBlazeTest extends BaseTest{

    private WebDriver webDriver = getWebDriver();
    private DemoBlazeSteps demoBlazeSteps = new DemoBlazeSteps(webDriver);

    @Test
    public void practica5_categorias(){
        demoBlazeSteps.abrirPaginaDemoBlaze();
        int numeroDeCategoriasActual = demoBlazeSteps.obternerNumeroDeCategorias();
        int numeroDeCategoriasEsperadas = 3;
        Assert.assertEquals(numeroDeCategoriasActual,numeroDeCategoriasEsperadas);
    }
}
