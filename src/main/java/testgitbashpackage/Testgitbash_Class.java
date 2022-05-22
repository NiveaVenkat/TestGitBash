package testgitbashpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testgitbash_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

				//Launch Chromedriver
				WebDriverManager.chromedriver().setup();
				
				//Handling notifications
				ChromeOptions options = new ChromeOptions();
			    options.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver(options);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//Launch Salesforce app
				driver.get("https://login.salesforce.com");
				
				//Maximize the screen
				driver.manage().window().maximize();
				
				//Entering credentials and login
			    driver.findElement(By.id("username")).sendKeys("mars@testleaf.com");
			    driver.findElement(By.id("password")).sendKeys("BootcampSel$123");
			    driver.findElement(By.id("Login")).click();
			    
		
		
	}

}
