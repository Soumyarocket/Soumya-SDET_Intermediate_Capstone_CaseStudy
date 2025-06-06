package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Develop.mobile.Base;
import io.appium.java_client.android.AndroidDriver;

public class LoginPageFactory extends Base{
	
	
	public LoginPageFactory() {
		
		PageFactory.initElements(driver,this);
		System.out.println("i am in constructor of pagefacotyrlogin");
	
	
	}
	
	@FindBy(xpath ="//android.widget.TextView[@text='API Demos']")
	WebElement appicon;
	
	@FindBy(xpath="//android.widget.TextView[@text='App']")
	WebElement app;
	
	@FindBy(xpath="//android.widget.TextView[@text='Service']")
	WebElement service;
	
	@FindBy(xpath="//android.widget.TextView[@text='Messenger Service']")
	WebElement messengerservice;
	
	
	public WebElement appelement() {
		return app;
	}
	public WebElement serviceelement() {
		return service;
	}
	
	public WebElement messengerserviceelement() {
		return messengerservice;
	}
	
	public void appiconclick(){
		this.appicon.click();
	}
	
	public void appclick(){
		this.app.click();
	}
	
	public void serivceclick() {
		this.service.click();
	}
	
	public void messengerservice() {
		this.messengerservice.click();
	}

}
