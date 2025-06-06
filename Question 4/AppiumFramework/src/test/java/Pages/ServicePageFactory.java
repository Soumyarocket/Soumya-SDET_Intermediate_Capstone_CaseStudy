package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Develop.mobile.Base;
import io.appium.java_client.android.AndroidDriver;

public class ServicePageFactory extends Base{
	
	
	
	public ServicePageFactory(){
		
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="(//android.widget.TextView)[1]")
	WebElement servicepageheading;
	
	@FindBy(xpath="//android.widget.Button[@text='Bind Service']")
	WebElement bind_service;
	
	@FindBy(xpath="//android.widget.Button[@text='Unbind Service']")
	WebElement unbind_service;
	
	public WebElement servicepageheadingelement() {
		return servicepageheading;
	}
	public WebElement bind_serviceelement() {
		return bind_service;
	}
	public WebElement unbind_serviceelement() {
		return unbind_service;
	}
	public String servicepageheading() {
		String heading=this.servicepageheading.getText();
		return heading;
	}
	public void bindserviceclick() {
		
		this.bind_service.click();
	}
	
	public void unbindserviceclick() {
		this.unbind_service.click();
	}
		
		
		
	}


