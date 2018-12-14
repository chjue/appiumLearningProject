package cheche.androidTest.a.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;



public class LoginPage {

	AndroidDriver driver;
	
	
    //手机号输入框
	@FindBy(how=How.ID,using="com.cheche365.a.chebaoyi:id/et_login_phone")    
	@CacheLookup                              
	WebElement phoneNumber;    
	
    //验证码输入框
	@FindBy(how=How.ID,using="com.cheche365.a.chebaoyi:id/et_login_validationcode")
	@CacheLookup                              
	WebElement codeNumber;    

    //登录按钮
	@FindBy(how=How.ID,using="com.cheche365.a.chebaoyi:id/btn_login_dologin")    
	@CacheLookup                              
	WebElement loginButton;    

	
	
	
	public LoginPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	

	//登录系统
	public void login(String phonenumber2, String checkcode) throws InterruptedException {
		//Utils.sentPostForLogin(phonenumber2,checkcode);
		phoneNumber.sendKeys(phonenumber2);
		codeNumber.sendKeys(checkcode);
		Thread.sleep(1000);
		loginButton.click();
		
		
	}


	

}
