package Test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Admin {
	WebDriver d;
	
  @Test
  public void adminvalid() throws Exception {
	  d.findElement(By.id("user")).sendKeys("admin");
	  Thread.sleep(2000);
	  d.findElement(By.id("pwd")).sendKeys("admin");
	  Thread.sleep(2000);
	  d.findElement(By.className("btn")).click();
	  Thread.sleep(2000);
	  Alert adminalert=d.switchTo().alert();
	  Thread.sleep(2000);
	  adminalert.accept();
	  Thread.sleep(2000);
	 
  }
	
  @Test
  public void adminInvalid() throws Exception {
	  d.findElement(By.id("user")).sendKeys("admin");
	  Thread.sleep(2000);
	  d.findElement(By.id("pwd")).sendKeys("123456");
	  Thread.sleep(2000);
	  d.findElement(By.className("btn")).click();
	  Thread.sleep(2000);
	  Alert adminalert=d.switchTo().alert();
	  Thread.sleep(2000);
	  adminalert.accept();
	  Thread.sleep(2000);
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path1);
	   d=new ChromeDriver();
	  d.get("file:///C:/Practice/project/star%20book%20store/Admin.html");
  }

  @AfterMethod
  public void afterMethod() {
	  d.close();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
