package com.assignment;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.io.File;
import java.time.Duration;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public static void main( String[] args ) throws InterruptedException, IOException
    {

        //To run in headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new EdgeDriver(options);
        driver.get("http://18.117.226.30:8081/contact.html");
        
        driver.getTitle();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.name("your_name")).sendKeys("Ashraf");
        driver.findElement(By.name("phone_number")).sendKeys("9999999999");
        driver.findElement(By.name("email_address")).sendKeys("abc@tcs.com");
        driver.findElement(By.name("your_message")).sendKeys("This is a test by Selenium");
        driver.findElement(By.id("my-button")).click();
        String message = driver.findElement(By.id("response")).getText();
        System.out.println(message);
        System.out.println("Tested Successfully");
        
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("test-report.jpg");
   
		FileUtils.copyFile(srcFile,destFile);
		
        driver.quit();
    }
}