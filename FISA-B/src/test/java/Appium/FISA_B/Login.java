package Appium.FISA_B;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Login extends BaseTest
{
	@Test
	public  void FisaLogin() throws InterruptedException
	{
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='2']")).sendKeys("priyankasm388@gmail.com");
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='3']"));
		pwd.sendKeys("Priya@23");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.TextView[@class='android.widget.TextView'])[4])")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("((//android.widget.TextView[@class='android.widget.TextView'])[4])")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		driver.findElement(AppiumBy.accessibilityId("Sign In")).click();
	}

}
