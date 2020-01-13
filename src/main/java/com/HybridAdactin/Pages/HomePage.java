package com.HybridAdactin.Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.HybridAdactin.DriverScript.DriverScriptTest;
import com.HybridAdactin.TestBase.CommonMethods;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class HomePage extends DriverScriptTest{
	public Workbook book;
	public Sheet sheet4;
	
	By locDD=By.id("location");
	By hotelDD=By.id("hotels");
	By roomTypeDD=By.id("room_type");
	By numberOfRoomsDD=By.id("room_nos");
	By dateIn=By.id("datepick_in");
	By dateOut=By.id("datepick_out");
	By noOfAdults=By.id("adult_room");
	By noOfKids=By.id("child_room");
	By searchBtn=By.id("Submit");
	
	   
	public void fn_search() throws BiffException, IOException  {
		String UserDirectory=System.getProperty("user.dir");
		FileInputStream file=new FileInputStream(UserDirectory+"\\src\\main\\java\\com\\HybridAdactin\\data\\AdactinHybriddatanew.xls");
		book=Workbook.getWorkbook(file);
		sheet4=book.getSheet("testdata2");
				
    	Select loc=new Select(CommonMethods.driver.findElement(locDD));
    	loc.selectByVisibleText(sheet4.getCell(0, 3).getContents().trim());
    	Select hot = new Select(CommonMethods.driver.findElement(hotelDD));
    	hot.selectByValue(sheet4.getCell(1, 3).getContents().trim());
    	Select room = new Select(CommonMethods.driver.findElement(roomTypeDD));
    	room.selectByVisibleText(sheet4.getCell(2, 3).getContents().trim());
    	Select noofroom = new Select(CommonMethods.driver.findElement(numberOfRoomsDD));
    	noofroom.selectByVisibleText(sheet4.getCell(3, 3).getContents().trim());
    	CommonMethods.driver.findElement( dateIn).clear();
    	CommonMethods.driver.findElement( dateIn).sendKeys(sheet4.getCell(4, 3).getContents().trim());
    	CommonMethods.driver.findElement(dateOut).clear();
    	CommonMethods.driver.findElement(dateOut).sendKeys(sheet4.getCell(5, 3).getContents().trim());
    	Select adultroom = new Select(CommonMethods.driver.findElement(noOfAdults));
    	adultroom.selectByVisibleText(sheet4.getCell(6, 3).getContents().trim());
    	Select childRoom = new Select(CommonMethods.driver.findElement(noOfKids));
    	childRoom.selectByVisibleText(sheet4.getCell(7, 3).getContents().trim());
		
		
    	CommonMethods.driver.findElement(searchBtn).click();
		
    }
  
}
