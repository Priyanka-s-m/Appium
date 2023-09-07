package Appium.FISA_B;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
//	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public Properties prop;
	
	  protected static AppiumDriver driver;
	
	@BeforeSuite
	public void ConfigureAppium() throws MalformedURLException
	{
		service=new AppiumServiceBuilder().withAppiumJS(new File("C://Users//priyankasm//AppData//Roaming//npm//node_modules//appium//build//lib"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("FISA");
		options.setApp("C://Users//priyankasm//eclipse-workspace//FISA-B//src//test//java//Utils//app-release.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		
	}
//	@BeforeTest
//	public void Base()
//	{
//		try
//		{
//			prop = new Properties();
//			FileInputStream ip=new FileInputStream("C:\\Users\\priyankasm\\eclipse-workspace\\FISA-B\\src\\main\\java\\com\\Fisab\\config\\config.properties");
//			prop.load(ip);
//		}
//		catch(FileNotFoundException e) 
//		{
//			e.printStackTrace();
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();	
//		}
//	}
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//		service.stop();
//	}
	
	

}
