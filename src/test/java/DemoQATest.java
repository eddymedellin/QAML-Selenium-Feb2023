import Steps.DemoQASteps;
import Steps.GoogleSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQATest extends BaseTest{
    private WebDriver webDriver = getWebDriver();
    private DemoQASteps demoQASteps = new DemoQASteps(webDriver);

    @Test
    public void practica2(){
        demoQASteps.abrirPaginaDemoQA();
        demoQASteps.enviarFullName("Moises Lopez Garcia");
        demoQASteps.enviarEmail("moylop1996@qamindlab.com");
        demoQASteps.enviarCurrentAddress("Calle 1, Colonia 2, 12345");
        demoQASteps.enviarPermanentAddress("Calle Permanente, Colonia Permanente, 67890");
        //demoQASteps.clickSubmit();
        //demoQASteps.cerrarVentana();
    }

    //Added starts from here 12/05/2023
    @Test
    public void practica4_Select(){
        demoQASteps.abrirPaginaDemoQA();
        demoQASteps.navegarSelectMenu();

        demoQASteps.imprimirOpcionesColoresDisponibles();

        demoQASteps.imprimir("Imprimir atributo Value:");
        demoQASteps.imprimirValoresOpcionesColoresDisponibles();

        demoQASteps.selecccionarColorPorTexto("Yellow");
        demoQASteps.imprimir(demoQASteps.getColorSeleccionado());

        demoQASteps.seleccionarColorPorValue("2");//Green
        demoQASteps.imprimir(demoQASteps.getColorSeleccionado());

        demoQASteps.seleccionarColorPorIndex(4);//Purple
        demoQASteps.imprimir(demoQASteps.getColorSeleccionado());

        demoQASteps.finalizarWebDriver();
    }

    @Test
    public void practica4_select_multiple(){
        demoQASteps.abrirPaginaDemoQA();
        demoQASteps.navegarSelectMenu();
        demoQASteps.scrollHaciaListaCarros();
        demoQASteps.imprimirOpcionesCarrosDisponibles();
        demoQASteps.finalizarWebDriver();
    }
    //Added ends from here 12/05/2023
}
