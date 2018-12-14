package cheche.androidTest.a.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;

import io.appium.java_client.android.AndroidDriver;

public class Utils {

	public static AndroidDriver driver;
	
	public static AndroidDriver openActivity(String packageName,String activityName) throws MalformedURLException {
		   DesiredCapabilities capabilities = new DesiredCapabilities();
			 //  capabilities.setCapability("app", "C:\\Test\\apps\\chebaoyi.apk");//安装apk,在当前工程目录里健app文件夹，把被测 apk放进去
				
		        capabilities.setCapability("deviceName", "emulator-5554");  
		        capabilities.setCapability("automationName", "Appium");
		        capabilities.setCapability("platformName", "Android");
		        capabilities.setCapability("platformVersion", "5.0.2");
		        capabilities.setCapability("appPackage", packageName);
		        capabilities.setCapability("appActivity", activityName);
		  //      capabilities.setCapability("automationName", "uiautomator2");  //捕捉toast
		   //     capabilities.setCapability("browserName", "chrome");//设置HTML5的自动化，打开谷歌浏览器

		        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        
				return driver;
		        
	}
	
	
	//2、元素断言失败时截图
		public static String takeScreenshot(String caseFolder,String sTestCaseName) {
			DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd_hh_mm_ss");
			Date date = new Date();
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File(Constants.SCREENSHOT + caseFolder + "/" + sTestCaseName + "" +

						dateformat.format(date) + ".png"));
			} catch (Exception e) {
			//	Log.error("Issue in Taking Screenshot");
				e.printStackTrace();
			}
			return Constants.SCREENSHOT + caseFolder + "/" + sTestCaseName + "" +dateformat.format(date) + ".png";
		}
		

	 	//40,在reportng的页面上显示截图 --自己修改的版本--实现显示自己的截图
	 	public static void catchExceptions2(ITestResult result,String screenShotPath) {


	 	        Reporter.setCurrentTestResult(result);
	 	        Reporter.log("截图如下：<br>");
//	 	        filePath2  = filePath2.replace("/opt/apache-tomcat-7.0.64/webapps","http://172.18.44.114:8080");
	 	        Reporter.log("<img src='"+screenShotPath+"' hight='300' width='300'/>");
	 	        Reporter.log("<BR>");
	 	    }
	 	
}
