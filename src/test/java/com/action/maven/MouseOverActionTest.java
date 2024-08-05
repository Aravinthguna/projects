package com.action.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverActionTest {
	@Test
	public  void mouseOverAction() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\SOFT TEST NOV 2023\\Pratices _Selenium_Automation\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000L);
	Actions act=new Actions(driver);
		WebElement mouseOver=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		act.moveToElement(mouseOver).build().perform();
		}

}
