package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationExercisePage {

    WebDriver driver;

    public AutomationExercisePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSite() {
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
    }

    public void clickButton(String button) {
        driver.findElement(By.xpath("//*[text()='"+button+"']")).click();
    }

    public void fillField(String fieldName, String value) {
        String prefix = "signup-";
        driver.findElement(By.cssSelector("[data-qa='"+prefix+fieldName+"']")).sendKeys(value);
    }

    public void validarMsgErro(String msg) {
        String msgExibida = driver.findElement(By.cssSelector("form[action=\"/signup\"] > p")).getText();
        Assert.assertEquals(msg, msgExibida);
    }

}
