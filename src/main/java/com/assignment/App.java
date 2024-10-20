package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {

        //To run in headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.facebook.com/");
        
        driver.getTitle();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.name("login"));
        Thread.sleep(2000);
        email.sendKeys("abc@tcs.com");
        password.sendKeys("TCS#2024");
        login.click();
        Thread.sleep(2000);
        //WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[1]"));
        //System.out.println(errorMessage.getText());
        System.out.println("Successfully tested");
        System.out.println(((ChromeDriver) driver).getCapabilities().getCapability("chrome").toString());

        driver.quit();
    }
}