package com.automation.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.Zahra.Library.BasePage;
import com.automation.pages.PCTestCasePage2;

public class PCTestCasePage3 extends BasePage{

//	final static Logger logger = Logger.getLogger(BasePage.class);
	   
	// leaving in a week scenario Economy Parking Test case 3 
	
	public PCTestCasePage3 ChooseALot() throws Exception {
		library.clickOnButton(By.id("Lot"));
		System.out.println("clicking");
		return this;
	}

	public PCTestCasePage3 selectOption() throws Exception {
		library.WaitUntilVisiable(By.cssSelector("#Lot > option:nth-child(2)"));
		library.clickOnButton(By.cssSelector("#Lot > option:nth-child(2)"));
		System.out.println("selecting economy");
		return this;
	}

	// Choose Entry Date and Time

	public PCTestCasePage3 time() throws Exception {
		library.clickOnButton(By.id("EntryTime"));
		library.clearTextBox(By.id("EntryTime"), "6:00");
		library.clickOnButton(By.cssSelector(
				"body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > font > input[type=\"radio\"]:nth-child(3)"));
		return this;
	}

	// choose a date
	public PCTestCasePage3 calender() throws Exception {
		library.clickOnButton(By.cssSelector("#EntryDate"));
		library.clearTextBox(By.cssSelector("#EntryDate"), "01/10/2018");
		return this;
	}
	/*	library.clickOnButton(
				By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > font > a > img"));
		library.switchtoWindowHandle(
				By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > font > a > img"));
		library.clickOnButton(By.xpath("/html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td[1]/select"));
		library.clickOnButton(By.xpath("/html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td[1]/select/option[1]"));
		library.clickOnButton(By.cssSelector(
				"body > form > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(2) > a:nth-child(3) > b > font"));
		library.clickOnButton(By.cssSelector("body > form > table > tbody > tr:nth-child(4) > td:nth-child(7)"));
         
		return this;
	}*/

	// Choosing leaving Date and Time
	public PCTestCasePage3 leavingTime() throws Exception {
		// library.switchtodefaultWindowHandle();
		library.fluentWait(By.cssSelector("#ExitTime"));
		library.clickOnButton(By.xpath("//*[@id=\"ExitTime\"]"));
		library.clearTextBox(By.cssSelector("#ExitTime"), "2:00");
		library.clickOnButton(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/font/input[3]"));
		library.clickOnButton(By.cssSelector("#ExitDate"));
		library.clearTextBox(By.cssSelector("#ExitDate"), "01/16/2018");
		return this;

	}
           public PCTestCasePage3 calculateBtn() throws Exception {
        	   
         library.clickOnButton(By.xpath("/html/body/form/input[2]"));  
			return this;
        	   
           }
	
}
