package Test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class register {
	
	 
	  WebDriver d;
  @Test
  public void registervalid() {
	  d.findElement(By.className("loginbtn")).click();
		d.findElement(By.className("toggle-btn2")).click();
		d.findElement(By.id("fname")).sendKeys("Vamsi");
		d.findElement(By.id("laname")).sendKeys("Krishna");
		d.findElement(By.id("email")).sendKeys("vamsispy988@gmail.com");
		d.findElement(By.id("pass")).sendKeys("Vamsikrishna1");
		d.findElement(By.id("con")).sendKeys("Vamsikrishna1");
		d.findElement(By.id("gender1")).click();
		d.findElement(By.id("check")).click();
		WebElement selected= d.findElement(By.id("check"));
		boolean a= selected.isSelected();
	d.findElement(By.id("res")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  String path1="C:\\Users\\itctesting18\\Downloads\\chromedriver_win32\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path1);
	  d=new ChromeDriver();
    //d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.get("file:///C:/Practice/project/star%20book%20store/student.html");
  }

  @AfterMethod
  public void afterMethod() {
	  
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
