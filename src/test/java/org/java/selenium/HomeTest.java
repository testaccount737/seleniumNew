package org.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

public class HomeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\resource\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.google.com");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebElement searchBox =  driver.findElement(By.name("q"));
			searchBox.sendKeys("selenium");
			searchBox.sendKeys(Keys.RETURN);
			
			
			Thread.sleep(5000);
			
			
			driver.quit();
			
			
		
	}

}
