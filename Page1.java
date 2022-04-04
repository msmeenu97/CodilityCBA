package com.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.warrier.Assertion;
import com.warrier.Base;

import io.appium.java_client.TouchAction;

public class Page1 extends Base{

	
	TouchAction touch = new TouchAction(driver);
	 Actions act;
	 By Loginbtn = By.id("login");
	By name = By.id("worrior_username");
	 
	 
	 public void clickAccess()
	 {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(Loginbtn).click();
	 }
	 public void Entername()
	 {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(name).click();
	 }
}
