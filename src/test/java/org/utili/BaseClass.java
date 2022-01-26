package org.utili;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	
	
	public static WebDriver launchChrome() {
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	
	public static void fullScreen() {
		driver.manage().window().maximize();
	}
	 public static void getUrl(String url) {
		driver.get(url);
	}
	 
	 public static void fill(WebElement ele ,String text) {
		ele.sendKeys(text);

	}
	
	 public static void btnlogin(WebElement ele) {
			ele.click();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
