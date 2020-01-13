package com.HybridAdactin.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HybridAdactin.DriverScript.DriverScriptTest;
import com.HybridAdactin.TestBase.CommonMethods;


public class SelectPage extends DriverScriptTest {
	By radioBtn=By.id("radiobutton_0");
	By ContinueBtn=By.id("continue");
	
	public void fn_Select() {
		 CommonMethods.driver.findElement(radioBtn).click();
		 CommonMethods.driver.findElement(ContinueBtn).click();
		
	}

}
