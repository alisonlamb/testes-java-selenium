package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageQazando {

    WebDriver driver;

    public HomePageQazando(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSite() {
        driver.get("https://www.qazando.com.br/curso.html");
        driver.manage().window().maximize();
    }

    public void preencherEmail(String email) {
        WebElement input = driver.findElement(By.id("email"));
        input.sendKeys(email);
        input.sendKeys(Keys.TAB);
    }

    public void clicarGanharCupom() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("button")).click();
    }

    public void validarTextoCupomDesconto(String textoCupom) {
        WebElement spanCodigoDesconto = driver.findElement(By.cssSelector("#cupom > h2 > span"));
        Assert.assertEquals(textoCupom, spanCodigoDesconto.getText());
    }
}
