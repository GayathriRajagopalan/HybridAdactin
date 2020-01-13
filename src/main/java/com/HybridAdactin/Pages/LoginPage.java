package com.HybridAdactin.Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HybridAdactin.DriverScript.DriverScriptTest;
import com.HybridAdactin.TestBase.CommonMethods;
import com.HybridAdactin.TestBase.Variables;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginPage extends DriverScriptTest  {
	public static String subj;
	public static Workbook book1;
	//String UserDirectory=System.getProperty("user.dir");
	//FileInputStream file=new FileInputStream(UserDirectory+"\\src\\main\\java\\com\\HybridAdactin\\data\\AdactinHybriddatanew.xls");
	//book1=Workbook.getWorkbook(file);
	 //static public Sheet sheet3=book1.getSheet("testdata3");
	
	/*
	 * @FindBy(xpath="//strong[contains(text(),'Go to Build 2')]") WebElement
	 * Build2;
	 */
	
	/*
	 * @FindBy(id="username") WebElement userName;
	 * 
	 * @FindBy(id="password") WebElement Pass;
	 * 
	 * @FindBy(id="login") WebElement LoginBtn;
	 * 
	 * @FindBy(linkText="New User Register Here") WebElement RegistrationLink;
	 * 
	 * @FindBy(linkText="Forgot Password?") WebElement ForgotpwdLink;
	 * 
	 * @FindBy(xpath="//img[@class='logo']") WebElement logoimg;
	 */
	By userName = By.id("username");
	By Pass = By.id("password");
	By LoginBtn    = By.id("login");

	/*
	 * public LoginPage() { //this.driver=driver;
	 * PageFactory.initElements(CommonMethods.driver, this); }
	 */
  public static void fn_LauchApp() throws BiffException, IOException {
	  CommonMethods.getBrowser();
	  getSheet("url");
	  Variables.actualUrl=sheet1.getCell(1,1).getContents();
	  System.out.println(Variables.actualUrl);
	  CommonMethods.driver.get(Variables.actualUrl);
	  
	}
  
  public void fn_loginApp() throws BiffException, IOException {
	  String UserDirectory=System.getProperty("user.dir");
		FileInputStream file=new FileInputStream(UserDirectory+"\\src\\main\\java\\com\\HybridAdactin\\data\\AdactinHybriddatanew.xls");
		book1=Workbook.getWorkbook(file);
		sheet3=book1.getSheet("testdata");
		System.out.println(sheet3.getCell(0, 2).getContents().trim());
		System.out.println(sheet3.getCell(1, 2).getContents().trim());
	  CommonMethods.driver.findElement(userName).sendKeys(sheet3.getCell(0, 2).getContents().trim());
	  CommonMethods.driver.findElement(Pass).sendKeys(sheet3.getCell(1, 2).getContents().trim());
	  CommonMethods.driver.findElement(LoginBtn).click();
  }
	
private static void getSheet(String SheetName1) throws BiffException, IOException {
	String UserDirectory=System.getProperty("user.dir");
	FileInputStream file=new FileInputStream(UserDirectory+"\\src\\main\\java\\com\\HybridAdactin\\data\\AdactinHybriddatanew.xls");
	book1=Workbook.getWorkbook(file);
	sheet1=book1.getSheet("url");
	
}
	/*
	 * private static void getSheet(String SheetName2, String SheetName3, String
	 * SheetName4, String SheetName5) throws BiffException, IOException { String
	 * UserDirectory=System.getProperty("user.dir"); FileInputStream file=new
	 * FileInputStream(UserDirectory+
	 * "\\src\\main\\java\\com\\HybridAdactin\\data\\AdactinHybridData.xlsx");
	 * book1=Workbook.getWorkbook(file); sheet2=book1.getSheet(SheetName2);
	 * sheet3=book1.getSheet(SheetName3); sheet4=book1.getSheet(SheetName4);
	 * sheet5=book1.getSheet(SheetName5);
	 * 
	 * }
	 */
}