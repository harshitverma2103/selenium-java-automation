package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ch2 {

    public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    driver.get("https://automationexercise.com/login");
    driver.findElement(By.name("email")).sendKeys("harshit@yopmail.com");
    driver.findElement(By.name("password")).sendKeys("test@1234");
    driver.findElement(By.className("btn-default")).click();
    driver.quit();
    }
};
