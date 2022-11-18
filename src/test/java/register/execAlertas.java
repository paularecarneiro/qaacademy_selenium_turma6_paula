package register;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class execAlertas {
    WebDriver driver;

   @Before
    public void iniciaTeste(){
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().window().maximize();

    }

    @Test
    public void testesAlertasSimples() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        Alert alert = driver.switchTo().alert();
        String mensagemAlerta = alert.getText();
        Assert.assertEquals("I am an alert box!", mensagemAlerta);
        alert.accept();


    }

    @Test
    public void testAlertaOkCancel() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert alert = driver.switchTo().alert();
        String mensagemAlerta = alert.getText();
        Thread.sleep(2000);
        Assert.assertEquals("Press a Button !", mensagemAlerta);
        alert.dismiss();


    }
    @Test
    public void testAlertaTextBox() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("Teste TextBox");
        alert.accept();
        String mensagem = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
        // validar se no texto contem qualque parte do texto digitado
        //String msg =
        //msg.contains("digitar parte do texto")
        //Assert.assertTrue(msg.contais(("digitar parte do texto"));
        Assert.assertEquals("Hello Teste TextBox How are you today", mensagem);

    }


    @Test

    public void FrameTest (){
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Olá Mundo!");
    }

@Test
    public void TestJanela (){
       driver.get("https://demo.automationtesting.in/Windows.html");
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
       Object[]  janelas = driver.getWindowHandles().toArray();
       driver.switchTo().window(janelas[1].toString());
       String url = driver.getCurrentUrl();
       Assert.assertEquals("https://www.selenium.dev/", url);
}

}







