package Develop.mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base{
	
	protected static AndroidDriver driver;
	
	
	@BeforeSuite
	public void setup() throws MalformedURLException, InterruptedException {
		
		System.out.print("I am in Base class fro driver");
		AppiumDriverLocalService service;
	 service =new AppiumServiceBuilder().withAppiumJS(new File ("C:\\Users\\Administrator\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options =new UiAutomator2Options();
		options.setDeviceName("Test");
		//options.setApp("C:\\Users\\Administrator\\eclipse-workspace3\\mobile\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		driver =new AndroidDriver((new URL("http://127.0.0.1:4723")), options);
//		driver.findElement(By.xpath("//android.widget.TextView[@text='API Demos']")).click();
//		Thread.sleep(1000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		driver.findElement(By.xpath("//android.widget.TextView[@text='App']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Service']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Messenger Service']")).click();
//		Thread.sleep(1000);
//		String title=driver.findElement(By.xpath("(//android.widget.TextView)[1]")).getText();
//		System.out.println(title);
//		driver.findElement(By.xpath("//android.widget.Button[@text='Bind Service']")).isDisplayed();
//		driver.findElement(By.xpath("//android.widget.Button[@text='Unbind Service']")).isDisplayed();
//		driver.findElement(By.xpath("//android.widget.Button[@text='Bind Service']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//android.widget.Button[@text='Unbind Service']")).click();
//		service.stop();
	}

}