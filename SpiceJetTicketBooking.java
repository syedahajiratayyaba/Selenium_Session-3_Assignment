package com.ibm.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJetTicketBooking {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 60);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		
		WebElement roundTripEle=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		roundTripEle.click();
		
		WebElement fromDesEleDd=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		fromDesEleDd.click();
		WebElement fromDesEle=driver.findElement(By.linkText("Chennai (MAA)"));
		fromDesEle.click();
		
		Thread.sleep(3000);
		
		WebElement toDesEle=driver.findElement(By.linkText("Bengaluru (BLR)"));
		toDesEle.click();
		
		WebElement fromDate=driver.findElement(By.linkText("8"));
		fromDate.click();
		
		Thread.sleep(3000);
		
		WebElement toDateCal=driver.findElement(By.cssSelector("#Div1 > button.ui-datepicker-trigger"));
		toDateCal.click();
		
		WebElement toDate=driver.findElement(By.linkText("9"));
		toDate.click();
		
		Thread.sleep(3000);
		
		WebElement adultSelEle=driver.findElement(By.id("divpaxinfo"));
		adultSelEle.click();
		
		WebElement noAdultSelEle=driver.findElement(By.id("hrefIncAdt"));
		noAdultSelEle.click();
		
		WebElement doneEle=driver.findElement(By.id("btnclosepaxoption"));
		doneEle.click();
		
		WebElement currencyEle=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		currencyEle.click();
		
		Select select=new Select(currencyEle);
		select.selectByVisibleText("USD");
		
		WebElement searchEle=driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		searchEle.click();

	}

}
