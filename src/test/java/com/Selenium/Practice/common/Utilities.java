package com.Selenium.Practice.common;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	
//##############################################################################################
//	Author: Malini Elumalai
//	Function: Functiion wait To load
//	##############################################################################################
	public void waitToLoad(int wait) throws InterruptedException{
		try {
			Thread.sleep(wait);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void ClickElement(WebElement ObjtoClick, String objdesc) {
		if(ObjtoClick.isDisplayed()) {
			ObjtoClick.click();
			System.out.println("Clicked on "+objdesc+"successfully");
		}
		else {
			System.out.println("Clicked on"+objdesc+"Unsuccessfully");
		}
	}
	//##############################################################################################
//	Author: Malini Elumalai
//	Function: To select from drop down
//	##############################################################################################
	public void HandleMultipleDropdown(WebElement ele, String value) throws InterruptedException{
	Select drpDwnValue=new Select(ele);
	List<WebElement> AllValues=drpDwnValue.getOptions();
	for(WebElement drpVal:AllValues) {
		if(drpVal.getText().equalsIgnoreCase(value)) {
			drpVal.click();
			System.out.println("Dropdown value sucessfully selected");
			break;
		}
	}
	}
}
