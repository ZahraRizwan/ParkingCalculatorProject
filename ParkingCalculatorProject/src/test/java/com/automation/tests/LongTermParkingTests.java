package com.automation.tests;

//import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.Zahra.Library.BasePage;
import com.automation.pages.ParkingCalculaterPage;
import com.automation.pages.LongTermParkingPage;
import com.automation.pages.LTTestCasePage2;
import com.automation.pages.LTTestCasePage3;
import com.automation.pages.LTTestCasePage4;
import com.automation.pages.LTTestCasePage5;
import com.automation.pages.PCTestCasePage2;

public class LongTermParkingTests extends BasePage {

	//final static Logger logger = Logger.getLogger(BasePage.class);

	@Test(priority = 1, enabled = true)
	public void selectALot() throws Exception {
		LongTermParkingPage longTermParkingPage = new LongTermParkingPage();
		longTermParkingPage.ChooseALot();
		longTermParkingPage.selectOption();
	}

	@Test(priority = 2, enabled = true)
	public void selectTime() throws Exception {
		LongTermParkingPage longTermParkingPage = new LongTermParkingPage();
		longTermParkingPage.time();
		longTermParkingPage.calender();
	}

	@Test(priority = 3, enabled = true)
	public void leavingTime() throws Exception {
		LongTermParkingPage longTermParkingPage = new LongTermParkingPage();
		longTermParkingPage.leavingTime();
	}

	@Test(priority = 4, enabled = true)
	public void Calculate() throws Exception {
		LongTermParkingPage longTermParkingPage = new LongTermParkingPage();
		longTermParkingPage.calculateBtn();
	}

	@Test(priority = 5, enabled = true)
	public void selectALot2() throws Exception {
		LTTestCasePage2 testCasePage = new LTTestCasePage2();
		testCasePage.ChooseALot();
		testCasePage.selectOption();
	}

	@Test(priority = 6, enabled = true)
	public void selectTime2() throws Exception {
		LTTestCasePage2 testCasePage2 = new LTTestCasePage2();
		testCasePage2.time();
		testCasePage2.calender();
	}

	@Test(priority = 7, enabled = true)
	public void leavingTime2() throws Exception {
		LTTestCasePage2 testCasePage2 = new LTTestCasePage2();
		testCasePage2.leavingTime();
	}

	@Test(priority = 8, enabled = true)
	public void Calculate2() throws Exception {
		LTTestCasePage2 testCasePage2 = new LTTestCasePage2();
		testCasePage2.calculateBtn();
	}

	@Test(priority = 9, enabled = true)
	public void selectALot3() throws Exception {
		LTTestCasePage3 testCasePage3 = new LTTestCasePage3();
		testCasePage3.ChooseALot();
		testCasePage3.selectOption();
	}

	@Test(priority = 10, enabled = true)
	public void selectTime3() throws Exception {
		LTTestCasePage3 testCasePage3 = new LTTestCasePage3();
		testCasePage3.time();
		testCasePage3.calender();
	}

	@Test(priority = 11, enabled = true)
	public void leavingTime3() throws Exception {
		LTTestCasePage3 testCasePage3 = new LTTestCasePage3();
		testCasePage3.leavingTime();
	}

	@Test(priority = 12, enabled = true)
	public void Calculate3() throws Exception {
		LTTestCasePage3 testCasePage3 = new LTTestCasePage3();
		testCasePage3.calculateBtn();
	}

	@Test(priority = 13, enabled = true)
	public void selectALot4() throws Exception {
		LTTestCasePage4 testCasePage4 = new LTTestCasePage4();
		testCasePage4.ChooseALot();
		testCasePage4.selectOption();
	}

	@Test(priority = 14, enabled = true)
	public void selectTime4() throws Exception {
		LTTestCasePage4 testCasePage4 = new LTTestCasePage4();
		testCasePage4.time();
		testCasePage4.calender();
	}

	@Test(priority = 15, enabled = true)
	public void leavingTime4() throws Exception {
		LTTestCasePage4 testCasePage4 = new LTTestCasePage4();
		testCasePage4.leavingTime();
	}

	@Test(priority = 16, enabled = true)
	public void Calculate4() throws Exception {
		LTTestCasePage4 testCasePage4 = new LTTestCasePage4();
		testCasePage4.calculateBtn();
	}

	@Test(priority = 17, enabled = true)
	public void selectALot5() throws Exception {
		LTTestCasePage5 testCasePage5 = new LTTestCasePage5();
		testCasePage5.ChooseALot();
		testCasePage5.selectOption();
	}

	@Test(priority = 18, enabled = true)
	public void selectTime5() throws Exception {
		LTTestCasePage5 testCasePage5 = new LTTestCasePage5();
		testCasePage5.time();
		testCasePage5.calender();
	}

	@Test(priority = 19, enabled = true)
	public void leavingTime5() throws Exception {
		LTTestCasePage5 testCasePage5 = new LTTestCasePage5();
		testCasePage5.leavingTime();
	}

	@Test(priority = 20, enabled = true)
	public void Calculate5() throws Exception {
		LTTestCasePage5 testCasePage5 = new LTTestCasePage5();
		testCasePage5.calculateBtn();
	}

}
