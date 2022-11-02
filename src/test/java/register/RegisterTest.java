package register;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RegisterTest {
    WebDriver driver;

    @Test
    public void testRegister() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Paula");
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Renata");
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Almotacel,Brasilândia");
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("paula.renata@testes.com");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("11 945288396");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
        driver.findElement(By.xpath("//input[@value='Movies']")).click();
              // Select
        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[3]")).click();

        Select ano = new Select(driver.findElement(By.id("yearbox")));
        ano.selectByVisibleText("1986");

        Select mes = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
        mes.selectByVisibleText("June");

        Select dia = new Select(driver.findElement(By.id("daybox")));
        dia.selectByVisibleText("7");


    }
}