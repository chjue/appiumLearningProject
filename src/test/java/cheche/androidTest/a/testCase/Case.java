package cheche.androidTest.a.testCase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cheche.androidTest.a.utils.Log;
import cheche.androidTest.a.utils.Utils;
import io.appium.java_client.android.AndroidDriver;

public class Case {
	
	AndroidDriver driver;
	String screenshotPath;
	
	@BeforeTest
	  public void beforeMethod() throws MalformedURLException {
		  driver=Utils.openActivity("com.cheche365.a.chebaoyi","com.cheche365.a.chebaoyi.ui.LogoActivity");
		
	  }
	

	  @AfterMethod(alwaysRun = true)   //测试截图输出到report里面
		public void afterMethod(ITestResult result) throws Exception {

	      if(!result.isSuccess()) {
	    	Reporter.log("失败了:");
	      }
	      else {
	      	Reporter.log("测试成功了!<br>");
	      }
	      Utils.catchExceptions2(result,screenshotPath);
	   }
	  
	  

	  @AfterClass
	  public void afterMethod() {
		  Log.info("");
		  Log.info("测试结束，关闭浏览器");
		//  driver.quit();
		  
	  }

	 
}
