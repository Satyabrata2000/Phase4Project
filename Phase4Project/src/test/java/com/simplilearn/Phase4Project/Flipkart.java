package com.simplilearn.Phase4Project;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart {

	private AndroidDriver<MobileElement> driver;
	TouchAction touchAction;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:platformVersion", "7.1.1");
		desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
		desiredCapabilities.setCapability("appium:app", "C:\\Users\\bhumika.dureja\\Downloads\\Flipkart-7.18(1).apk");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);

		touchAction = new TouchAction(driver); 

		//	System.out.println(driver.getSessionId());

		

	}

	
	@Test
	public void searchLaptopBags() throws Throwable  {
		Thread.sleep(20000);
		MobileElement EnglishLang = driver.findElementByXPath("//android.widget.RelativeLayout[4]");
		EnglishLang.click();
		
		MobileElement ContBtn = driver.findElementById("com.flipkart.android:id/select_btn");
		//other way to find location of ContBtn is by xpath, below can also be used
		//MobileElement ContBtn = driver.findElementByXPath("//android.widget.Button[@text='CONTINUE']");
		ContBtn.click(); 
	
		MobileElement XIcon = driver.findElementById("com.flipkart.android:id/custom_back_icon");
		XIcon.click();
		
		MobileElement SearchBox = driver.findElementById("com.flipkart.android:id/search_widget_textbox");
		SearchBox.click();
		
		MobileElement SearchBox1 = driver.findElementById("com.flipkart.android:id/search_autoCompleteTextView");
		SearchBox1.sendKeys("Laptop Bags");
		
		driver.findElementById("com.flipkart.android:id/root_titles").click();
		
	//	Actions action=new Actions(driver);
	//	action.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		
	}

	
	@Test
	public void AddBagToCart() throws Throwable  {
		Thread.sleep(20000);
		MobileElement EnglishLang = driver.findElementByXPath("//android.widget.RelativeLayout[4]");
		EnglishLang.click();
		
		MobileElement ContBtn = driver.findElementById("com.flipkart.android:id/select_btn");
		//other way to find location of ContBtn is by xpath, below can also be used
		//MobileElement ContBtn = driver.findElementByXPath("//android.widget.Button[@text='CONTINUE']");
		ContBtn.click(); 
	
		MobileElement XIcon = driver.findElementById("com.flipkart.android:id/custom_back_icon");
		XIcon.click();
		
		MobileElement SearchBox = driver.findElementById("com.flipkart.android:id/search_widget_textbox");
		SearchBox.click();
		
		MobileElement SearchBox1 = driver.findElementById("com.flipkart.android:id/search_autoCompleteTextView");
		SearchBox1.sendKeys("Laptop Bags");
		
		driver.findElementById("com.flipkart.android:id/root_titles").click();
		
		Thread.sleep(3000);
	  // driver.switchTo().frame(0);
	   driver.findElementById("com.flipkart.android:id/not_now_button").click();
	  
		Thread.sleep(3000);
		
		touchAction.tap(PointOption.point(128, 338)).perform();
		Thread.sleep(2000);
		
	//	String BagName = driver.findElementByXPath("//android.widget.TextView[@text = 'DUTY FREE']").getText();
	//	System.out.println("BagName : " + BagName);
		
		MobileElement AddToCartBtn = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
		AddToCartBtn.click();
		
		Thread.sleep(2000);
		
	}
	
	

	@Test
	public void ViewCart() throws Throwable  {
		Thread.sleep(20000);
		MobileElement EnglishLang = driver.findElementByXPath("//android.widget.RelativeLayout[4]");
		EnglishLang.click();
		
		MobileElement ContBtn = driver.findElementById("com.flipkart.android:id/select_btn");
		//other way to find location of ContBtn is by xpath, below can also be used
		//MobileElement ContBtn = driver.findElementByXPath("//android.widget.Button[@text='CONTINUE']");
		ContBtn.click(); 
	
		MobileElement XIcon = driver.findElementById("com.flipkart.android:id/custom_back_icon");
		XIcon.click();
		
		MobileElement SearchBox = driver.findElementById("com.flipkart.android:id/search_widget_textbox");
		SearchBox.click();
		
		MobileElement SearchBox1 = driver.findElementById("com.flipkart.android:id/search_autoCompleteTextView");
		SearchBox1.sendKeys("Laptop Bags");
		
		driver.findElementById("com.flipkart.android:id/root_titles").click();
		
		Thread.sleep(3000);
	 
	   driver.findElementById("com.flipkart.android:id/not_now_button").click();
	  
		Thread.sleep(3000);
		
		touchAction.tap(PointOption.point(128, 338)).perform();
		Thread.sleep(2000);
		
	//	String BagName = driver.findElementByXPath("//android.widget.TextView[@text = 'DUTY FREE']").getText();
	//	String BagName = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]").getText();
		
	//	System.out.println("BagName : " + BagName);
		
		MobileElement AddToCartBtn = driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
		AddToCartBtn.click();
		
		Thread.sleep(2000);
		
		MobileElement GoToCartBtn = driver.findElementByXPath("//android.widget.TextView[@text='GO TO CART']");
		GoToCartBtn.click();
		
		String CartScreen =  driver.findElementByXPath("//android.widget.TextView[@text='My Cart']").getText();
		
		Assert.assertEquals("My Cart", CartScreen);
		System.out.println("My Cart screen is displayed");
		
	//	String BagNameOnMyCart = driver.findElementByXPath("//android.widget.TextView[@text='DUTY FREE 032-Laptop Backpack 40 L Laptop Backpack'").getText();
	//	String BagNameOnMyCart = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]").getText();
	//	System.out.println("BagName on My Cart screen : " + BagNameOnMyCart);
		
	//	Assert.assertEquals(BagNameOnMyCart.contains(BagName), true);
	}

	

	
	@AfterTest
	public void tearDown() {
		driver.quit();
	} 
}


//CTRL +A, CTRL+I (for indentation)
