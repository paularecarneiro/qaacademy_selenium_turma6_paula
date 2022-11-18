package google;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleTest<BuscaGooglePage> {
    WebDriver driver;
    @Before
    public void abrirBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }
    @Test
    public void testGoogle() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Rosas de Ouro");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span")).click();
        Thread.sleep(2000);
        String texto = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/div/cite")).getText();
                Assert.assertEquals("https://sociedaderosasdeouro.com.br", texto);

    }

    @Test
    public void testeGoogle() throws InterruptedException {
        driver.get("https://www.google.com/");
        BuscaGooglepag buscaGooglepag = new BuscaGooglepag();
        buscaGooglepag.preencherCampoBusca(driver);
        buscaGooglepag.clicarResultadoBusca(driver);
        RetornoGooglepag retornoGooglepag = new RetornoGooglepag();
        retornoGooglepag.textoRetorno(driver);


       }




}







