package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseSteps {
    public WebDriver webDriver;

    //Constructor
    public BaseSteps(WebDriver driver) {
        this.webDriver = driver;
    }

    public String getURLActual() {
        return webDriver.getCurrentUrl();
    }

    public String getTituloActual() {
        return webDriver.getTitle();
    }

    public void cerrarVentana() {
        webDriver.close();
    }

    public String getCodigoFuente() {
        return webDriver.getPageSource();
    }

    public void finalizarWebDriver() {
        webDriver.quit();
    }

    public void imprimir(String cadenaAImprimir) {
        System.out.println(cadenaAImprimir);
    }

    public boolean isCorrectlyDisplayedElement(WebElement element){
        if(element.isDisplayed()){
            return true;
        }else {
            return false;
        }
    }
}
