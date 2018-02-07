package com.automation.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.Zahra.Library.BasePage;

public class ParkingCalculaterPage extends BasePage {

	final static Logger logger = Logger.getLogger(BasePage.class);
 // Leaving on different day Scenario Economy Parking TestCase 1
	public ParkingCalculaterPage ChooseALot() throws Exception {
		library.clickOnButton(By.id("Lot"));
		System.out.println("clicking");
		return this;
	}

	public ParkingCalculaterPage selectOption() throws Exception {
		library.WaitUntilVisiable(By.cssSelector("#Lot > option:nth-child(2)"));
		library.clickOnButton(By.cssSelector("#Lot > option:nth-child(2)"));
		System.out.println("selecting economy");
		return this;
	}

	// Choose Entry Date and Time

	public ParkingCalculaterPage time() throws Exception {
		library.clickOnButton(By.id("EntryTime"));
		library.clearTextBox(By.id("EntryTime"), "8:00");
		library.clickOnButton(By.cssSelector(
				"body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > font > input[type=\"radio\"]:nth-child(3)"));
		return this;
	}

	// choose a date
	public ParkingCalculaterPage calender() throws Exception {
		library.clickOnButton(By.cssSelector("#EntryDate"));
		library.clearTextBox(By.cssSelector("#EntryDate"), "01/08/2018");
		return this;
	}
	
/*	public ParkingCalculaterPage calender() throws Exception {
		library.clickOnButton(
				By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > font > a > img"));
		library.switchtoWindowHandle(
				By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > font > a > img"));
		library.clickOnButton(By.xpath("/html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td[1]/select"));
		library.clickOnButton(By.xpath("/html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td[1]/select/option[1]"));
		library.clickOnButton(By.cssSelector(
				"body > form > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(2) > a:nth-child(3) > b > font"));
		library.clickOnButton(By.cssSelector("body > form > table > tbody > tr:nth-child(4) > td:nth-child(7)"));
		// library.switchtodefaultWindowHandle();
		return this;
	}*/

	// Choosing leaving Date and Time
	public ParkingCalculaterPage leavingTime() throws Exception {
		library.fluentWait(By.cssSelector("#ExitTime"));
		library.clickOnButton(By.xpath("//*[@id=\"ExitTime\"]"));
		library.clearTextBox(By.cssSelector("#ExitTime"), "5:00");
		library.clickOnButton(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/font/input[3]"));
		library.clickOnButton(By.cssSelector("#ExitDate"));
		library.clearTextBox(By.cssSelector("#ExitDate"), "01/08/2018");
		return this;

	}
           public ParkingCalculaterPage calculateBtn() throws Exception {
        	   
         library.clickOnButton(By.xpath("/html/body/form/input[2]"));  
			return this;
        	   
           }
}
