package Appium.FISA_B;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


public class Fisasignup extends BaseTest
{
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.xpath("((//android.widget.TextView[@index='0'])[7])")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.EditText[@index='2'])[1])")).sendKeys("priyanka");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.EditText[@index='2'])[2])")).sendKeys("priyankasm388@gmail.com");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.EditText[@index='3'])[1])")).sendKeys("Priya@23");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.EditText[@index='3'])[2])")).sendKeys("Priya@23");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.EditText[@index='2'])[3])")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.EditText[@index='2'])[4])")).sendKeys("Indian");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.EditText[@index='2'])[5])")).sendKeys("VTU");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.EditText[@index='2'])[6])")).sendKeys("CSE");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.EditText[@index='2'])[7])")).sendKeys("2022");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Register")).click();
		Thread.sleep(2000);
	}

}
