package google;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetornoGooglepag {
    String textoRetorno = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/div/cite";

    public void validarRetornoBusca(WebDriver driver) {
        driver.findElement(By.xpath(textoRetorno));
        Assert.assertEquals("https://sociedaderosasdeouro.com.br", textoRetorno);

    }

    public void textoRetorno(WebDriver driver) {
    }
}
