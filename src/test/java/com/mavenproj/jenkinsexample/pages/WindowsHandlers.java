package com.mavenproj.jenkinsexample.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Selenium.Practice.common.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlers {
	WebDriver driver;
	Utilities util = new Utilities();
	String URL = "https://opensource-demo.orangehrmlive.com";

	// ##################################################################################
	// Author: Malini Elumalai
	// Functions: To launch URL for Window Hamdle
	// ##################################################################################
	public void LaunchURLHAndleWindow() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		// To get IDs of browser Window
		// getWindowHandle()- ID of the browser window for 1
		/*
		 * String SingleWindowID=driver.getWindowHandle();
		 * System.out.println("ID of single window is: "+SingleWindowID);
		 */
		WebElement lnkOrangeHRM = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		util.ClickElement(lnkOrangeHRM, "Click on OrangeHRM link ");
	}
	// getWindowHandles()- ID for multiple browser window
	/*
	 * Set<String> MultipleWindowsID=driver.getWindowHandles();
	 * System.out.println("IDs of multipel browser windows"+MultipleWindowsID);
	 * //First Method- Using iterator Iterator<String>
	 * it=MultipleWindowsID.iterator(); String ParentID=it.next(); String
	 * ChildID=it.next(); System.out.println("The parent ID is: "+ParentID);
	 * System.out.println("The child ID is: "+ChildID);
	 */

	// Author: Malini Elumalai
	// Functions: To Switch to different browser window
	// ##################################################################################
	public void ToSwitchToBroswerWindow() throws InterruptedException {

		Set<String> MultipleWindowsID = driver.getWindowHandles();
		System.out.println("IDs of multipel browser windows" + MultipleWindowsID);
		// Second Method- Using list collection/ArrayList
		List<String> WindowsIDList = new ArrayList(MultipleWindowsID);// Converting set to List
		// List is a Interface and ArrayList is a class
		// Set duplicates are not allowed but in List duplicates are allowed
		/*String ParentID = WindowsIDList.get(0);
		String ChildID = WindowsIDList.get(1);
		System.out.println("The parent ID is: " + ParentID);
		System.out.println("The child ID is: " + ChildID);
		
		//To Use these IDs to swicth to browser window
		driver.switchTo().window(ParentID);
		System.out.println("To get the title of parent window" +driver.getTitle());
		
		driver.switchTo().window(ChildID);
		System.out.println("To get the title of Child window" +driver.getTitle());*/
		
		//To Do all in one shot USINF FOR EACH LOOP
		/*for(String WinID:MultipleWindowsID) {
			String multipleID=driver.switchTo().window(WinID).getTitle();
			System.out.println("Switching and getting multiple wondow browser ID: "+multipleID);
		}
		driver.quit();*/
		 //TO CLOSE SPECIFIC WINDOW TAB
		for(String WinID:MultipleWindowsID) {
			String multipleID=driver.switchTo().window(WinID).getTitle();
			if(multipleID.equalsIgnoreCase("OrangeHRM")) {
				driver.close();
			}
		}
		driver.quit();
	}

}
