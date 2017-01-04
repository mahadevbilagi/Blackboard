package com.bb.login;
import java.io.IOException;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import General.GeneralClass;
import excelfileIO.DataDriven;

// import excelExportAndFileIO.DataDriven;

public class Login extends GeneralClass {
	
	String sheetname; 
	
	public String getSheetname() {
		return sheetname;
	}
	public void setSheetname(String sheetname) {
		this.sheetname = sheetname;
	}
	
	public Login(WebDriver wd, int i, int j) throws InterruptedException, BiffException, IOException {
		
		wd.manage().deleteAllCookies();  			// Clear Firefox cache in Selenium IDE
		
		DataDriven DT = new DataDriven();	
		DT.setsheetname("Login");
		
		wd.get(DT.readExcel(0,1)); 	
		
		wd.findElement(By.id("user_id")).click();
		wd.findElement(By.id("user_id")).sendKeys(DT.readExcel(i,j));
		
		wd.findElement(By.id("password")).click();
		wd.findElement(By.id("password")).sendKeys(DT.readExcel(i+1,j));
		Thread.sleep(50);
		
		wd.findElement(By.className("submit")).click();
		Thread.sleep(500);
		
	}
	public void Login(WebDriver wd, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}

/*
package com.bb.login;
import java.io.IOException;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import excelfileIO.DataDriven;

// import excelExportAndFileIO.DataDriven;

public class Login  {
	
	String sheetname; 
	
	public String getSheetname() {
		return sheetname;
	}
	public void setSheetname(String sheetname) {
		this.sheetname = sheetname;
	}
	
	public void Login(WebDriver wd, int i, int j) throws InterruptedException, BiffException, IOException {
		
		wd.manage().deleteAllCookies();  			// Clear Firefox cache in Selenium IDE
		
		DataDriven DT = new DataDriven();	
		DT.setsheetname("Login");
		
		wd.get(DT.readExcel(0,1)); 	
		
		wd.findElement(By.id("user_id")).click();
		wd.findElement(By.id("user_id")).sendKeys(DT.readExcel(i,j));
		
		wd.findElement(By.id("password")).click();
		wd.findElement(By.id("password")).sendKeys(DT.readExcel(i+1,j));
		Thread.sleep(50);
		
		wd.findElement(By.className("submit")).click();
		Thread.sleep(500);
		
	}
}
	

*/