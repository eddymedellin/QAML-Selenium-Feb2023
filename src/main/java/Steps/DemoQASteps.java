package Steps;

import Pages.DemoQASelectMenuPage;
import net.bytebuddy.implementation.bytecode.ShiftRight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class DemoQASteps extends BaseSteps{

    public DemoQASteps(WebDriver driver) {
        super(driver);
    }

    DemoQASelectMenuPage demoQASelectMenuPage = new DemoQASelectMenuPage(webDriver);//added

    public void abrirPaginaDemoQA(){
        webDriver.get("https://demoqa.com/text-box/");
    }

    public void enviarFullName(String nombreCompleto){
        webDriver.findElement(By.id("userName")).sendKeys(nombreCompleto);
    }

    public void enviarEmail(String correoElectronico){
        webDriver.findElement(By.id("userEmail")).sendKeys(correoElectronico);
    }

    public void enviarCurrentAddress(String direccionActual){
        webDriver.findElement(By.id("currentAddress")).sendKeys(direccionActual);

    }

    public void enviarPermanentAddress(String direccionPermanente){
        webDriver.findElement(By.id("permanentAddress")).sendKeys(direccionPermanente);
    }

    public void clickSubmit(){
        WebElement botonSubmit = webDriver.findElement(By.id("submit"));
        botonSubmit.click();
    }

    //Added starts from here 12/05/2023
    public void navegarSelectMenu(){
        webDriver.navigate().to("https://demoqa.com/select-menu");
    }

    public void selecccionarColorPorTexto(String color){
        Select listaColores = new Select(demoQASelectMenuPage.getListaColores());
        listaColores.selectByVisibleText(color);
    }

    public String getColorSeleccionado(){
        Select listaColores = new Select(demoQASelectMenuPage.getListaColores());
        return listaColores.getFirstSelectedOption().getText();
    }

    public void seleccionarColorPorValue(String value){
        Select listaColores = new Select(demoQASelectMenuPage.getListaColores());
        listaColores.selectByValue(value);
    }

    public void seleccionarColorPorIndex(int index){
        Select listaColores = new Select(demoQASelectMenuPage.getListaColores());
        listaColores.selectByIndex(index);
    }

    public List<WebElement> getOpcionesColores(){
        Select listaColores = new Select(demoQASelectMenuPage.getListaColores());
        return listaColores.getOptions();
    }

    public void imprimirOpcionesColoresDisponibles(){
        for (WebElement o: getOpcionesColores()){
            imprimir(o.getText());
        }
    }

    public void imprimirValoresOpcionesColoresDisponibles(){
        for (WebElement o: getOpcionesColores()) {
            imprimir(o.getAttribute("value"));
        }
    }

    public void scrollHaciaListaCarros(){
        new Actions(webDriver).scrollToElement(demoQASelectMenuPage.getListaCarros()).perform();
    }

    public List<WebElement> getOpcionesCarros(){
        Select listaCarros = new Select(demoQASelectMenuPage.getListaCarros());
        return listaCarros.getOptions();
    }

    public void imprimirOpcionesCarrosDisponibles(){
        for (WebElement o: getOpcionesCarros()){
            imprimir(o.getText());
        }
    }
    //Added ends from here 12/05/2023
}
