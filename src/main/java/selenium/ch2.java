package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ch2 {

    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    driver.get("https://automationexercise.com/login");
    driver.findElement(By.name("email")).sendKeys("harshit@yopmail.com");
    driver.findElement(By.name("password")).sendKeys("test@1234");
    driver.findElement(By.className("btn-default")).click();
    Thread.sleep(1000);
    String url = driver.getCurrentUrl();
    System.out.println(url);
    Assert.assertEquals(url, "https://automationexercise.com/");
    driver.quit();
    }
}
