package com.testing.parallelTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class NewTest {
	public  static WebDriver driver;
	
	
	
	
  @Test
  public void SampleTest() throws MalformedURLException, InterruptedException {
	  
	  String url="https://www.flipkart.com/";
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--start-maximized");
	  String Node ="http://192.168.225.46:4444/wd/hub";

	  		driver=new RemoteWebDriver(new URL(Node),option );
	  		
	  		driver.navigate().to(url);
	  		
	  		System.out.println(driver.getCurrentUrl());
	  		Thread.sleep(5000);
	  		
	  		driver.quit();
	  		
	  
  }
  
	
  @Test
	  public void SampleTest2() throws MalformedURLException,
	  InterruptedException {
	  
	  String url="https://www.flipkart.com/"; ChromeOptions option=new
	  ChromeOptions(); option.addArguments("--start-maximized"); String Node
	  ="http://192.168.225.46:4444/wd/hub";
	  
	  driver=new RemoteWebDriver(new URL(Node),option );
	  
	  driver.navigate().to(url);
	  
	  System.out.println(driver.getCurrentUrl()); Thread.sleep(5000);
	  
	  driver.quit();
	  
	  
	  }
	 
}
