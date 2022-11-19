package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registerpag {
    WebDriver driver;

    String NOME = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]";
    String SOBRENOME = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]";
    String ENDEREÇO = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]";
    String EMAIL = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]";
    String TELEFONE = "//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]";

    String SELEÇAOGENERO = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input";

    String SELECHOBBIES = "//input[@value='Movies']";

    String SKILLS = "Skills";

    String COUNTRY = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";

    String SELECTCOUNTRY = "//*[@id=\"select2-country-results\"]/li[3]";

    String ANO = "yearbox";

    String MES = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";

    String DIA = "daybox";

    public Registerpag(WebDriver driverParametro){ //modificando construtor padrão
        this.driver = driverParametro;
    }

    //criando os metodos public void preencher e selecionar
    //criando ações sendKeys e click
    public void preencherNome(String nome) {
        driver.findElement(By.xpath(NOME)).sendKeys(nome);
    }

    public void preencherSobrenome(String sobrenome) {
        driver.findElement(By.xpath(SOBRENOME)).sendKeys(sobrenome);
    }

    public void preencherEndereço(String endereco) {
        driver.findElement(By.xpath(ENDEREÇO)).sendKeys(endereco);
    }

    public void preencherEmail(String email) {
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);
    }

    public void preencherTelefone(String telefone) {
        driver.findElement(By.xpath(TELEFONE)).sendKeys(telefone);
    }

    public void selecioneGenero(){
        driver.findElement(By.xpath(SELEÇAOGENERO)).click();
    }

    public void selecHobbies(){
        driver.findElement(By.xpath(SELECHOBBIES)).click();
    }

    public void selecSkills(String Skilss){
        Select skills = new Select(driver.findElement(By.id(SKILLS)));
            skills.selectByVisibleText(Skilss);
    }
public void seleccountry(){
        driver.findElement(By.xpath(COUNTRY)).click();
        }
public void selecionarseleccountry(){
        driver.findElement(By.xpath(SELECTCOUNTRY)).click();
    }
public void preencherAno(String anos){
    Select ano = new Select(driver.findElement(By.id(ANO)));
    ano.selectByVisibleText(anos);
}
public void preencherMes(String meses){
    Select mes = new Select(driver.findElement(By.xpath(MES)));
    mes.selectByVisibleText(meses);
        }
public void preencherDia(String dias){
    Select dia = new Select(driver.findElement(By.id(DIA)));
    dia.selectByVisibleText(dias);

}

}
