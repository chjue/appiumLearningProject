package cheche.androidTest.a.testCase;


import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestCaculator {

	  private AndroidDriver driver;
	
	  @BeforeTest
	  public void beforeMethod() throws MalformedURLException {
		  
		   DesiredCapabilities capabilities = new DesiredCapabilities();
			//cap.setCapability("app", "C:\\software\\jrtt.apk");//安装apk,在当前工程目录里健app文件夹，把被测 apk放进去
			
	        capabilities.setCapability("deviceName", "582af7ae4159");
	        capabilities.setCapability("automationName", "Appium");
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("platformVersion", "4.4.4");
	        capabilities.setCapability("appPackage", "com.android.calculator2");
	        capabilities.setCapability("appActivity", ".Calculator");
	   //     capabilities.setCapability("browserName", "chrome");//设置HTML5的自动化，打开谷歌浏览器

	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  }

	  @AfterTest
	  public void afterMethod() {
		  driver.quit();
		  
	  }
	
	 @Test
	 public void testCalculator() throws MalformedURLException, InterruptedException {

	        driver.findElement(By.id("com.android.calculator2:id/digit1")).click();
/*	        driver.findElement(By.name("5")).click();
	        driver.findElement(By.name("9")).click();
	        driver.findElement(By.name("delete")).click();*/
	        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"加\"]")).click();
	        driver.findElement(By.id("com.android.calculator2:id/digit6")).click();
	        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"等于\"]")).click();
	        Thread.sleep(2000);
	  
	     //   String result = driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
	     //   System.out.println(result);  
	    }	 
}