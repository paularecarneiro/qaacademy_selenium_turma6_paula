package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registerpag {
    WebDriver driver;

    String NOME = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]";
    String SOBRENOME = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]";
    String ENDEREÇO = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]";
    String EMAIL = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]";
    String TELEFONE = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]";

    String SELEÇAOGENERO = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input";

    String SELECHOBBIES = "//input[@value='Movies']";

    public Registerpag(WebDriver driverParametro){ //modificando construtor padrão
        this.driver = driverParametro;
    }

    //criando os metodos public void preencher e selecionar
    //criando ações sendKeys e click
    public void preencherNome() {
        driver.findElement(By.xpath(NOME)).sendKeys("Paula");
    }

    public void preencherSobrenome() {
        driver.findElement(By.xpath(SOBRENOME)).sendKeys("Renata");
    }

    public void preencherEndereço() {
        driver.findElement(By.xpath(ENDEREÇO)).sendKeys("Rua Almotacel, Brasilandia");
    }

    public void preencherEmail() {
        driver.findElement(By.xpath(EMAIL)).sendKeys("paula.renata@testes.com");
    }

    public void preencherTelefone() {
        driver.findElement(By.xpath(TELEFONE)).sendKeys("11 945288396");
    }

    public void selecioneGenero(){
        driver.findElement(By.xpath(SELEÇAOGENERO)).click();
    }

    public void selecHobbies(){
        driver.findElement(By.xpath(SELECHOBBIES)).click();
    }

}