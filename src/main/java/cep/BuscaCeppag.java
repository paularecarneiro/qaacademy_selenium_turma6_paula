package cep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BuscaCeppag {
//elementos da pagina campoBusca; resultadoBusca

    private String campoBusca = "endereco";
    private String tipoCep = "tipoCEP";
    private String botaoPesquisar = "btn_pesquisar";

//Criar metodos
    public void preencherCampos(WebDriver driver){
        driver.findElement(By.name(campoBusca)).sendKeys("02848040");

    }
    public void selecionarTipo(WebDriver driver){
        String idSelectTipo = "";
        Select select = new Select(driver.findElement(By.id(idSelectTipo)));
        select.selectByVisibleText("Localidade/Logradouro");
    }

    public void clicarBotaoBusca(WebDriver driver){
        String IdbotaoPesquisar = "";
        driver.findElement(By.id(IdbotaoPesquisar)).click();
    }

}




