package cheche.androidTest.a.testCase;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import cheche.androidTest.a.page.LoginPage;
import cheche.androidTest.a.utils.Log;
import cheche.androidTest.a.utils.Utils;





public class TestLoginForNewUser extends Case{
	 

		/*
		 * 用于测试新用户登录，注册
		 * */
		

		  private static final String phoneNumber="18310162222";   //没有注册过得手机号
		  private static final String checkCode="888888";
		  private LoginPage loginPage;

		  

		  @Test(description="测试我的车车-登录系统-新用户登录时，提示需要先注册") //测试登录系统
		  public void testLoginForNewUser() throws InterruptedException {
			//测试登录功能
			  try {
				  Log.info("");
				  Log.info("测试登录模块=============================");
				  Log.info("当前登录-新用户登录时，提示需要先注册");
				  Reporter.log("当前登录-新用户登录时，提示需要先注册<br>");

				  loginPage=new LoginPage(driver);
				  loginPage.login(phoneNumber, checkCode); 
			//	  Thread.sleep(3000);

					 
				  

					 
					// String key = "验证码";
					 WebDriverWait wait = new WebDriverWait(driver, 1);
					 // 点击上一个按钮
			//		 driver.findElementById("com.example.quizactivity:id/prev_button").click();
					 WebElement target = wait.until(
					 	     ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text,'验证码')]")));
					 System.out.println(target.getText());
					 
					 
					 Thread.sleep(3000);
		         	
					 
				  
				  
				  
				  screenshotPath=Utils.takeScreenshot("测试登录","新用户登录时提示需要先注册");
			//	  assertTrue(check.contains("还不是注册用户"));
				
				  
			  }catch(Exception e){
				  Log.error("测试失败");
				  Log.error(e.toString());
				  screenshotPath=Utils.takeScreenshot("测试登录","新用户登录时提示需要先注册");
				
				  throw e;
			  }finally {
				  Log.info("测试结束");
			  }
		    }
		  
		  
		
	 
	 
	
	
}
