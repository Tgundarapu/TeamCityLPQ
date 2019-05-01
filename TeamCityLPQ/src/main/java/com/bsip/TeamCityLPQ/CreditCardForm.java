package com.bsip.TeamCityLPQ;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreditCardForm{
	
	public static WebDriver driver;
	
	@Test
	public void openBrowser() throws InterruptedException{
		String meredianURL = "https://beta.loanspq.com/login.aspx?enc2=lqc_NUOh2_sZoFnhMuzKAiuDjxZG8O04St2Hlzvvbvs";
		File file = new File("D:\\Thiru\\IEDriverServer32.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		
		//Setting capabilities 
		DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
		ieCaps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, meredianURL);
		driver = new InternetExplorerDriver(ieCaps);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "LansPQ & Xpress Accounts Login");
		System.out.println("Meridian login page is displayed");
		System.out.println("Passed");
		Thread.sleep(3000);
	}
	
	
	/*public void login(){	
		driver.findElement(By.id("ctl00_bc_LoginMain_txtLogin")).sendKeys("ALOKA_QA_BH");
		driver.findElement(By.id("ctl00_bc_LoginMain_btnLogin")).click();
		driver.findElement(By.id("ctl00_bc_MFLQuestions_Answer1")).sendKeys("jhansi");
		driver.findElement(By.id("ctl00_bc_MFLQuestions_Answer2")).sendKeys("jhansi");
		driver.findElement(By.id("ctl00_bc_MFLQuestions_btnContinue")).click();
		driver.findElement(By.id("ctl00_bc_MFLPasswordPrompt_Password")).sendKeys("password@2");
		driver.findElement(By.id("ctl00_bc_MFLPasswordPrompt_btnSignIn")).click();
		WebElement welcomeId= driver.findElement(By.id("ctl00_MainContent_lblWelcome"));
		String welcomeText  = welcomeId.getText();
		Assert.assertTrue(welcomeText.contains("Welcome,"));
		System.out.println("User successfully logged in");
	}
	
	public void selectCreditCard() {
		driver.findElement(By.linkText("Start New App")).click();
		WebElement iframe = driver.findElement(By.id("TB_iframeContent"));
		driver.switchTo().frame(iframe);
		WebElement creditCard = driver.findElement(By.linkText("Credit Card"));
		creditCard.click();
		System.out.println("Credit card page is displayed");
	}
	
	public void formFilling() {
		Select purposeDropdown = new Select(driver.findElement(By.id("RequestType_RequestType")));
		purposeDropdown.selectByIndex(1);
		driver.findElement(By.id("sa_SSN")).sendKeys("000-00-0005");
		driver.findElement(By.id("sa_FName")).sendKeys("Alok");
		driver.findElement(By.id("sa_LName")).sendKeys("Agarwal");
		driver.findElement(By.id("sa_ForeignHomePhone_tbPhoneNumber")).sendKeys("2843894839");
		driver.findElement(By.id("sa_DOB")).sendKeys("843894839");
		Select citizenshipDropdown = new Select(driver.findElement(By.id("sa_Citizenship")));
		citizenshipDropdown.selectByIndex(1);
		driver.findElement(By.id("sa_curradd_Address")).sendKeys("Test");
		driver.findElement(By.id("sa_curradd_Zip")).sendKeys("90001");
		driver.findElement(By.id("sa_curradd_City")).sendKeys("Los Angeles");
		Select stateDropdown = new Select(driver.findElement(By.id("sa_curradd_State")));
		stateDropdown.selectByIndex(1);
		Select occupancyDropdown = new Select(driver.findElement(By.id("sa_OccupancyStatus")));
		occupancyDropdown.selectByValue("RENT");
		WebElement housingPayment = driver.findElement(By.id("sa_MonthlyHousingCost"));
		housingPayment.clear();
		housingPayment.sendKeys("500");
		Select employeeStatus = new Select(driver.findElement(By.id("sa_EmploymentStatus")));
		employeeStatus.selectByIndex(2);
		driver.findElement(By.id("sa_Occupation_tbOccupation")).sendKeys("Test Engineer");
		WebElement grossMonthlyIncome = driver.findElement(By.id("sa_MonthlyIncomeBaseSalary"));
		grossMonthlyIncome.clear();
		grossMonthlyIncome.sendKeys("5000");
		driver.findElement(By.id("sa_IncomeVerifyMethod_IncomeVerify")).sendKeys("Yes");
		driver.findElement(By.id("sa_IsTaxExemptBaseSalary")).click();
		driver.findElement(By.id("CQuest_rpt_ctl01_SingleCustomQuestion_chkAnswer_1")).click();	
		driver.findElement(By.id("runCreditbtn_btnSavePullCredit")).click();	
		}
	@Test
	public void closeBrowser() {
		driver.close();
	}*/
}
