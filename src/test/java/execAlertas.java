import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class execAlertas {
    WebDriver driver;

    @Before
    public void iniciaTeste(){
    driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.automationtesting.in/Alerts.html");

    }

//https://demo.automationtesting.in/Alerts.html

    @Test
    public void testesAlertasSimples() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        Alert alert = driver.switchTo().alert();
        String mensagemAlerta = alert.getText();
        String mensagemEsperada = "I am an alert box!";
        Thread.sleep(2000);
        alert.accept();
        Assert.assertEquals("mensagemEsperada", "mensagemAlerta");


    }

    @Test
    public void testAlertaOkCancel() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert alert = driver.switchTo().alert();
        String mensagemEsperada = "Press a Button !";
        String mensagemAlerta = alert.getText();
        Thread.sleep(2000);
        alert.dismiss();
        Assert.assertEquals("mensagemAlerta", "mensagemEsperada");


        }
    }