package cep;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CepTest {
            WebDriver driver;
        @Test
        public void cepRua() throws InterruptedException {
            driver = new ChromeDriver();
            driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.id("tipoCEP")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/select[1]/optgroup[1]/option[1]")).click();
            driver.findElement(By.id("endereco")).sendKeys("02848040");
            driver.findElement(By.id("btn_pesquisar")).click();
            Thread.sleep(2000);
            String textoRua = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]")).getText();
            Assert.assertEquals("Rua Almotacel", textoRua);
            String textoBairro = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
            Assert.assertEquals("Brasilândia", textoBairro);
            String textoEstado = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[3]")).getText();
            Assert.assertEquals("São Paulo/SP", textoEstado);
            String textoCep = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[4]")).getText();
            Assert.assertEquals("02848-040", textoCep);



}

        }


