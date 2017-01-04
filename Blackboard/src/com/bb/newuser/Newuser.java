package com.bb.newuser;
import java.io.IOException;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import excelfileIO.DataDriven;

// import excelExportAndFileIO.DataDriven;

public class Newuser {
	
	String sheetname; 
	
	public String getSheetname() {
		return sheetname;
	}
	public void setSheetname(String sheetname) {
		this.sheetname = sheetname;
	}
	
	public void Newuser(WebDriver wd, int i, int j) throws InterruptedException, BiffException, IOException {
		
		wd.manage().deleteAllCookies();  			// Clear Firefox cache in Selenium IDE
		
		@test
		
		DataDriven DT = new DataDriven();	
		DT.setsheetname("Login");	
		
		wd.switchTo().frame(0);	
		Thread.sleep(1500);
		wd.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td/div/div[2]/table/tbody/tr/td[6]/a/span[1]")).click();		// Click on System Admin link
		
		// wd.findElement(By.xpath("//a[@target='_top']//span[text()='System Admin']")).click();								// Click on System Admin link		
		wd.switchTo().defaultContent();
		
		Thread.sleep(1500);		
		wd.switchTo().frame(0);	
		wd.findElement(By.xpath(".//*[@id='nav_list_users']")).click(); 						// Click on Users link
		wd.switchTo().defaultContent();
		
		wd.findElement(By.partialLinkText("Create User")).click();				// Click on System Admin link
		Thread.sleep(500);
		
		// Enter user information
		wd.findElement(By.id("firstName")).click();								// Click on firstName
		wd.findElement(By.id("firstName")).sendKeys("DT.readExcel(1,5)");
	
		wd.findElement(By.id("lastName")).click();								// Click on lastName
		wd.findElement(By.id("lastName")).sendKeys("DT.readExcel(1,6)");
		
		wd.findElement(By.id("userName")).click();								// Click on userName
		wd.findElement(By.id("userName")).sendKeys("DT.readExcel(1,8)");
		
		wd.findElement(By.id("password_input")).click();								// Click on password_input
		wd.findElement(By.id("password_input")).sendKeys("DT.readExcel(1,9)");
		
		wd.findElement(By.id("verifyPassword")).click();								// Click on verifyPassword
		wd.findElement(By.id("verifyPassword")).sendKeys("DT.readExcel(1,9)");
		
		wd.findElement(By.className("submit")).click();				// Click on System Admin link		
		
/*		wd.findElement(By.id("user_id")).click();
		wd.findElement(By.id("user_id")).sendKeys(DT.readExcel(i,j));*/
		
		Thread.sleep(500);
		
		
	}
}
	
