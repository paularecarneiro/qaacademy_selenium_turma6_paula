package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaGooglepag {
//elementos da pagina campoBusca; resultadoBusca

    private String campoBusca = "q";
    private String resultadoBusca = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span";

//Criar metodos
    public void preencherCampoBusca(WebDriver driver){
         driver.findElement(By.name(campoBusca)).sendKeys("Rosas de Ouro");

     }
//Criar metodo
     public void clicarResultadoBusca(WebDriver driver){
         driver.findElement(By.xpath(resultadoBusca)).click();


     }

}
