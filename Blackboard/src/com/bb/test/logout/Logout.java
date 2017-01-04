package com.bb.test.logout;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import General.GeneralClass;

public class Logout extends GeneralClass {

	public Logout(WebDriver wd) throws InterruptedException {
				
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);     // Implicit wait 60 Sec 		
		
		Thread.sleep(500);		
		wd.findElement(By.id("topframe.logout.label")).click();
		Thread.sleep(500);		
	
	}

	public void Logout(WebDriver wd) {
		// TODO Auto-generated method stub
		
	}
	
}
