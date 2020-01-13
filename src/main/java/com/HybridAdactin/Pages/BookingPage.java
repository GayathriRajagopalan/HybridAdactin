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

public class BookingPage extends DriverScriptTest{
	
	public Workbook book;
	public Sheet sheet5;
	
	By FirstNameInputbox=By.id("first_name");
	By LastNameInputbox=By.id("last_name");
	By AddressInputbox=By.id("address");
	By creditCard=By.id("cc_num");
	By creditCardType=By.id("cc_type");
	By expiryMonth=By.id("cc_exp_month");
	By expiryYear=By.id("cc_exp_year");
	By CVV=By.id("cc_cvv");
	By bookNowBtn=By.xpath("//input[@id='book_now']");
	
	
	public void fn_Booking() throws BiffException, IOException {
		 String UserDirectory=System.getProperty("user.dir");
			FileInputStream file=new FileInputStream(UserDirectory+"\\src\\main\\java\\com\\HybridAdactin\\data\\AdactinHybriddatanew.xls");
			book=Workbook.getWorkbook(file);
			sheet5=book.getSheet("testdata3");
		//book=Workbook.getWorkbook(file);
		CommonMethods.driver.findElement(FirstNameInputbox).sendKeys(sheet5.getCell(0, 1).getContents().trim());
		CommonMethods.driver.findElement(LastNameInputbox).sendKeys(sheet5.getCell(1, 1).getContents().trim());
		CommonMethods.driver.findElement(AddressInputbox).sendKeys(sheet5.getCell(2, 1).getContents().trim());
		CommonMethods.driver.findElement(creditCard).sendKeys(sheet5.getCell(3, 1).getContents().trim());
		Select type=new Select(CommonMethods.driver.findElement(creditCardType));
		type.selectByVisibleText(sheet5.getCell(4, 1).getContents().trim());
		Select month=new Select(CommonMethods.driver.findElement(expiryMonth));
		month.selectByVisibleText(sheet5.getCell(5, 1).getContents().trim());
		Select year=new Select(CommonMethods.driver.findElement(expiryYear));
		year.selectByVisibleText(sheet5.getCell(6, 1).getContents().trim());
		CommonMethods.driver.findElement(CVV).sendKeys(sheet5.getCell(7, 1).getContents().trim());
		CommonMethods.driver.findElement(bookNowBtn).click();
		
	}

/*public ConfirmationPage ConfirmationPage() {
		FirstNameInputbox.sendKeys("Rhea");
		LastNameInputbox.sendKeys("Peter");
		AddressInputbox.sendKeys("9090 Fremont Blvd");
		creditCard.sendKeys("1234567899876543");
		Select type=new Select(creditCardType);
		type.selectByVisibleText("American Express");
		Select month=new Select(expiryMonth);
		month.selectByValue("9");
		Select year=new Select(expiryYear);
		year.selectByValue("2022");
		CVV.sendKeys("323");
		 bookNowBtn.click();
		 return new ConfirmationPage();
	}
*/
}
