package com.HybridAdactin.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonMethods {
	
	public static WebDriver driver;
	public static void getBrowser() {
		String UserDirectory=System.getProperty("user.dir");
		if(Variables.browser.contentEquals("chrome")) {
			System.setProperty("webdriver.chrome.driver", UserDirectory+"\\src\\main\\java\\com\\HybridAdactin\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(Variables.browser.contentEquals("Firefox")){
			System.setProperty("webdriver.gecko.driver", UserDirectory+"\\src\\main\\java\\com\\HybridAdactin\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.setProperty("webdriver.edge.driver", UserDirectory+"\\src\\main\\java\\com\\HybridAdactin\\Drivers\\edgedriver.exe");
			driver=new InternetExplorerDriver();
		}
	}
	

}
