import Steps.CategoriasSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoCategoriasPageTest extends BaseTest {
    private WebDriver webDriver = getWebDriver(); //aquí voy a volver a crear un webdrive privado, aqui se reutiliza nuevamente del BaseTest
    private CategoriasSteps categoriaSteps = new CategoriasSteps(webDriver);

    @Test
    public void verificarCategorias(){
        categoriaSteps.abrirDemoCategorias();
        String textoEsperado = "CATEGORIES";
        String textoActual = categoriaSteps.obtenerTextoCategoria();
        categoriaSteps.imprimir(textoActual);
        Assert.assertEquals(textoActual, textoEsperado);

        categoriaSteps.imprimir("¿Cuantas categorias se visualizan?");
        int numCategoriaActual=categoriaSteps.contadorCategoria();
        int numCategoriaEsperado=3;
        categoriaSteps.imprimirContador(numCategoriaActual);
        Assert.assertEquals(numCategoriaActual, numCategoriaEsperado);

        categoriaSteps.imprimirMenuCategorias();
        categoriaSteps.finalizarWebDriver();
    }
}
