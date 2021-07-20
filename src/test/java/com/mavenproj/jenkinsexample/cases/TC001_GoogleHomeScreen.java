package com.mavenproj.jenkinsexample.cases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mavenproj.jenkinsexample.pages.WindowsHandlers;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
@Test
public class TC001_GoogleHomeScreen {
	/*@QAFDataProvider(dataFile="resources/Practice.xls", sheetName="TestData", key="TC01",filter="runMode.equalsIgnoreCase('Yes')")
	@Test(description="TC_ToHandleDropDown",groups="web")*/
	
	public void validateBrowsers() throws InterruptedException {
		WindowsHandlers HndWin=new WindowsHandlers();
		 	 HndWin.LaunchURLHAndleWindow();
		 	 HndWin.ToSwitchToBroswerWindow();

	}

}
