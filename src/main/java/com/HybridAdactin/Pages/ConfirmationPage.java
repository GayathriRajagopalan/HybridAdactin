package com.HybridAdactin.Pages;

import java.io.FileInputStream;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HybridAdactin.DriverScript.DriverScriptTest;
import com.HybridAdactin.TestBase.CommonMethods;

import jxl.Sheet;
import jxl.Workbook;


public class ConfirmationPage extends DriverScriptTest {
	public Sheet sheet6;
  By hotelNameValue=By.id("hotel_name");
  By LocationValue=By.id("location");
  By firstNameValue=By.id("first_name");
  By lastNameValue=By.id("last_name");
  By orderNoValue=By.id("order_no");
  By myItinerary=By.id("my_itinerary");
	
	public void fn_confirmation() {
		CommonMethods.driver.findElement(hotelNameValue).getAttribute("value");
		CommonMethods.driver.findElement(hotelNameValue).getAttribute("value");
		CommonMethods.driver.findElement(hotelNameValue).getAttribute("value");
		CommonMethods.driver.findElement(hotelNameValue).getAttribute("value");
		CommonMethods.driver.findElement(hotelNameValue).getAttribute("value");
		FileInputStream file=new FileInputStream(UserDirectory+"\\src\\main\\java\\com\\HybridAdactin\\data\\AdactinHybriddatanew.xls");
		book=Workbook.getWorkbook(file);
		
		book.createWorkbook(")
		sheet6=book.getSheet("testdata3");
		CommonMethods.driver.findElement(myItinerary).click();
	}

	}