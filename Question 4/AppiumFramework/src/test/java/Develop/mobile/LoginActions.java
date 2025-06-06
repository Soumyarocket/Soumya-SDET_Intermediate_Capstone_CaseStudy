package Develop.mobile;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Develop.mobile.Base;
import Pages.LoginPageFactory;
import Pages.ServicePageFactory;

public class LoginActions extends Base{
	LoginPageFactory loginpage;
	ServicePageFactory sp;
	 
		@BeforeTest
		public void intitate() {
			 loginpage = new LoginPageFactory();
			 sp= new ServicePageFactory();
		}

	@Test(priority=1)
	public void setupapp() throws InterruptedException {
		 
		 	
		System.out.println("i am in the logintest first test case");
		loginpage.appiconclick();
		Thread.sleep(2000);
	}

	@Test(priority=2)
	public void checkcappopen() throws InterruptedException {
		

		Boolean checklogin = loginpage.appelement().isDisplayed();
		assertTrue(checklogin);
	}

	@Test(priority=3)
	public void navigatetomessageservice() throws InterruptedException {
		
		loginpage.appclick();
		Thread.sleep(1000);
		loginpage.serivceclick();
		Thread.sleep(1000);
		loginpage.messengerservice();
		
		assertTrue(sp.servicepageheadingelement().isDisplayed());
	}

	@Test(priority=4)
	public void bindservicetest() throws InterruptedException {
	
		
		
		sp.bindserviceclick();

	}
	
	@Test(priority=5)
	public void unbindservicetest() throws InterruptedException {
		
		
		
		sp.unbindserviceclick();

	}
	
	

}
