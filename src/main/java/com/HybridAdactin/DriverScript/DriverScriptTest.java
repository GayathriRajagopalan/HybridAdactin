package com.HybridAdactin.DriverScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DriverScriptTest {
	 public static Workbook book;
	 public static Sheet sheet1,sheet2,sheet3;
	 static String strRunMode, classname,methodname;
	 
	public static void main(String[] args) throws BiffException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String UserDirectory=System.getProperty("user.dir");
		FileInputStream file=new FileInputStream(UserDirectory+"\\src\\main\\java\\com\\HybridAdactin\\data\\AdactinHybriddatanew.xls");
		book=Workbook.getWorkbook(file);
        sheet2=book.getSheet("testcases");
        System.out.println(sheet2.getRows());
        System.out.println(sheet2.getColumns());
        for(int i=1;i<sheet2.getRows();i++) {
        	Class<?>classObj=null;
        	Method methodObj=null;
        	Object generalobj=null;
        	strRunMode=sheet2.getCell(7, i).getContents();
        	System.out.println(strRunMode);
        	if(strRunMode.matches("yes")) {
        		classname=sheet2.getCell(5, i).getContents();
        		System.out.println("the name of the class is------->" + classname.toString());
        		classObj=Class.forName("com.HybridAdactin.Pages."+classname);
        		methodname=sheet2.getCell(6, i).getContents();
        		System.out.println("the name of the method is------->"+methodname);
        		methodObj=classObj.getMethod(methodname);
        		generalobj=classObj.newInstance();
        		methodObj.invoke(generalobj);
        	}
        	
        }
      
	}

}
