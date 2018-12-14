package cheche.androidTest.a.utils;

public class Constants {
	
	//IE驱动文件
	public static final String IE_DRIVER = "C:\\selenium\\driver\\IEDriverServer.exe";
	//Chrome驱动文件
	public static final String CHROME_DRIVER = "C:\\selenium\\driver\\chromedriver.exe";
	//隐式等待默认超时时间
	public static final long IMPLICITLY_WAIT=60;
	
	//显式等待默认超时时间
	public static final int EXPLICIT_WAIT = 60;
	//截图文件路径
	//public static final String SCREENSHOT = System.getProperty("user.dir")+ "\\screenshots";
	public static final String SCREENSHOT = "C:\\autoTest\\AndroidScreenshot\\";
	
	
	
	
	
	
	
	
	
	/*三云测试数据及配置信息*/
	
	//三云 A 端地址
	public static final String YUN3_ADDRESS="http://dev2.cheche365.com/a/index.html"; //3云主页面地址
	public static final String YUN3_A_MY_WELLET="http://dev2.cheche365.com/a/index.html#wallet"; //我的钱包页面
	public static final String YUN3_MAIN_ADDRESS = "http://dev2.cheche365.com/a/index.html#home";  //主页面

}
