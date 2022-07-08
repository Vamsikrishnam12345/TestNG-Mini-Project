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

public class userlogin {
	WebDriver d;
  @Test
  
  public void userloginvalid() throws InterruptedException {
	  d.findElement(By.className("loginbtn")).click();
		d.findElement(By.className("login-page"));
		d.findElement(By.className("toggle-btn1"));
      d.findElement(By.id("e-mail")).sendKeys("aisha23@gmail.com");
		d.findElement(By.id("pass-id")).sendKeys("Aishakhan23");
		d.findElement(By.className("check-box")).isSelected();
		d.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);
  }
@Test
  
  public void userloginInvalid() throws InterruptedException {
	  d.findElement(By.className("loginbtn")).click();
		d.findElement(By.className("login-page"));
		d.findElement(By.className("toggle-btn1"));
      d.findElement(By.id("e-mail")).sendKeys("vamsigmail.com");
		d.findElement(By.id("pass-id")).sendKeys("1234567");
		d.findElement(By.className("check-box")).isSelected();
		d.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", path1);
		  d=new ChromeDriver();
		d.get("file:///C:/Practice/project/star%20book%20store/student.html");
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
