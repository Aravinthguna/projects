package com.action.maven3;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action3Test {
@Test
	public  void action3 () throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\SOFT TEST NOV 2023\\Pratices _Selenium_Automation\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000L);
	Actions act=new Actions(driver);
	WebElement mouseOver=driver.findElement(By.id("twotabsearchtextbox"));
	act.moveToElement(mouseOver).click().keyDown(Keys.SHIFT).sendKeys("iphone").doubleClick().build().perform();

	}

}
