package Test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Addbook {
	WebDriver d;
  @Test
  public void Addbookvalid() throws InterruptedException {
	  d.findElement(By.id("bookname")).sendKeys("Clean Code");
	  d.findElement(By.id("price")).sendKeys("200");
	  Thread.sleep(2000);
	  d.findElement(By.id("img")).sendKeys("C:\\Practice\\project\\star book store");
	  Thread.sleep(2000);
	  d.findElement(By.id("add-btn")).click();

  }
  @Test
  public void AddbookInvalid() throws InterruptedException {
	  d.findElement(By.id("bookname")).sendKeys("200");
	  d.findElement(By.id("price")).sendKeys("Clean Code");
	  Thread.sleep(2000);
	  d.findElement(By.id("img")).sendKeys("C:\\Practice\\project\\star book store");
	  Thread.sleep(2000);
	  d.findElement(By.id("add-btn")).click();

  }
  
  @BeforeMethod
  public void beforeMethod() {
	  String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path1);
	  d=new ChromeDriver();
	  d.get("file:///C:/Practice/project/star%20book%20store/addbooks.html");
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
