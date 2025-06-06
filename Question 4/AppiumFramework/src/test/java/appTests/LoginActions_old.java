//package appTests;
//
//import static org.testng.Assert.assertTrue;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import Develop.mobile.Base;
//import Pages.LoginPageFactory;
//import Pages.ServicePageFactory;
//
//public class LoginActions extends Base {
//	
//		
//		
//	
//
//	@Test()
//	public void setup() throws InterruptedException {
//		LoginPageFactory loginpage = new LoginPageFactory(driver);
//		
//		System.out.println("i am in the logintest first test case");
//		loginpage.appiconclick();
//		Thread.sleep(2000);
//	}
//
//	@Test
//	public void checkcappopen() throws InterruptedException {
//		LoginPageFactory loginpage = new LoginPageFactory(driver);
//
//		Boolean checklogin = loginpage.appelement().isDisplayed();
//		assertTrue(checklogin);
//	}
//
//	@Test
//	public void navigatetomessageservice() throws InterruptedException {
//		LoginPageFactory loginpage = new LoginPageFactory(driver);
//		loginpage.appclick();
//		Thread.sleep(1000);
//		loginpage.serivceclick();
//		Thread.sleep(1000);
//		loginpage.messengerservice();
//		ServicePageFactory sp= new ServicePageFactory(driver);
//		assertTrue(sp.servicepageheadingelement().isDisplayed());
//	}
//@Test
//	public void bindservicetest() throws InterruptedException {
//	LoginPageFactory loginpage = new LoginPageFactory(driver);
//		loginpage.appclick();
//		Thread.sleep(1000);
//		loginpage.serivceclick();
//		Thread.sleep(1000);
//		loginpage.messengerservice();
//		ServicePageFactory sp= new ServicePageFactory(driver);
//		sp.bindserviceclick();
//
//	}
//	@Test
//	public void unbindservicetest() throws InterruptedException {
//		LoginPageFactory loginpage = new LoginPageFactory(driver);
//		loginpage.appclick();
//		Thread.sleep(1000);
//		loginpage.serivceclick();
//		Thread.sleep(1000);
//		loginpage.messengerservice();
//		ServicePageFactory sp= new ServicePageFactory(driver);
//		sp.unbindserviceclick();
//
//	}
//	
//	
//
//}
package appTests;


