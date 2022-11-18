package cep;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetCeppage {
    private String retornoCep = "/html[1]/body[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[4]";
    private String retornoLocalidade = "/html[1]/body[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[3]";
    private String retornoNomeRua = "/html[1]/body[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]";
    private String retornoBairro = "/html[1]/body[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]";

    public void validarRetornoBusca(WebDriver driver) {
    String rua = driver.findElement(By.xpath(retornoNomeRua)).getText();
        Assert.assertEquals("Rua Almotacel", rua);
    String bairro = driver.findElement(By.xpath(retornoBairro)).getText();
        Assert.assertEquals("Brasilandia", bairro);
    String localidade = driver.findElement(By.xpath((retornoLocalidade))).getText();
        Assert.assertEquals("São Paulo/SP", localidade);
    String cep = driver.findElement(By.xpath(retornoCep)).getText();
        Assert.assertEquals("02848040", cep);

    }
}
