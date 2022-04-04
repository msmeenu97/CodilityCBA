package com.testsite;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.pages.Page1;
import com.warrier.Base;


public class Test1 extends Base{
		@Test()	
		public void TestCase01() throws Exception
		{
				
				Page1 log = new Page1();
				try {
					log.clickAccess();
					log.Entername();
					File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile2, new File("./screenshots//mirror"+timestamp()+"png"));
					System.out.println("verified the user is on the creation page");
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}}
	public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }}