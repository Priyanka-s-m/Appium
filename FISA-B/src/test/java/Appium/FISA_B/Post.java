package Appium.FISA_B;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


public class Post extends BaseTest 
{
	
	 Login log;
	@Test
public void posting() throws InterruptedException
{
		
		log=new Login();
		log.FisaLogin();
	Thread.sleep(6000);
	driver.findElement(AppiumBy.xpath("((//android.view.ViewGroup[@class='android.view.ViewGroup'])[23])")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@index='3']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("((//android.widget.ImageView[@class='android.widget.ImageView'])[2])")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("Post")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.id("android:id/button1")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("(//android.view.View[@index='2'])[1]")).click(); // setting
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("((//android.widget.TextView[@class='android.widget.TextView'])[4])")).click();
//	Thread.sleep(2000);
	
}

}
