package com.sdettraining.basetest;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class BaseTest{
	
	public static Logger applog=Logger.getLogger("devpinoyLogger");
	public static ObjectMapper obj = new ObjectMapper();

	public AppiumDriver<MobileElement> driver;
	@SuppressWarnings("rawtypes")
	public TouchAction touch;
	
@BeforeMethod	
public void startAndriod() throws InterruptedException, MalformedURLException{
	
	String sFile = "C:\\Users\\ShameemAkther\\Desktop\\DM_Mar_01\\API Testing\\SDET_Training_Oct_04_2021\\ApiDemos-debug.apk";
	System.out.println("");
	DesiredCapabilities capability = new DesiredCapabilities();

	capability.setCapability("device", "Android");
	capability.setCapability(CapabilityType.BROWSER_NAME, "");

	capability.setCapability(CapabilityType.VERSION, "22.0");
	capability.setCapability("app", sFile);

	capability.setCapability("deviceName", "Pixel 2 API 30 2");
	capability.setCapability("platformName", "Android");

	capability.setCapability("app-package", "io.appium.android.apis");

	capability.setCapability("app-activity", ".ApiDemos");

	driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),
			capability);
	 @SuppressWarnings("rawtypes")
	TouchAction touch = new TouchAction(driver);

	List<MobileElement> listElement = (List<MobileElement>) driver.findElementsById("android:id/text1");
	for (MobileElement li : listElement) {
		System.out.println(li.getText());

	}
	MobileElement views = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='Views']"));

	touch.tap(tapOptions().withElement(element(views))).perform();
	Thread.sleep(2000);
	

}

   @Test
   public void testcase1() throws InterruptedException{
	MobileElement chronometer = (MobileElement)
			  driver.findElement(MobileBy.xpath("//*[@text='Chronometer']"));
			 touch.tap(tapOptions().withElement(element(chronometer))).perform();
			  Thread.sleep(2000);
			    
			  MobileElement start = (MobileElement)
			  driver.findElement(MobileBy.xpath("//*[@text='START']"));
			  touch.tap(tapOptions().withElement(element(start))).perform();
			  Thread.sleep(7000);
			  
			  MobileElement stop = (MobileElement)
			  driver.findElement(MobileBy.xpath("//*[@text='STOP']"));
			  touch.tap(tapOptions().withElement(element(stop))).perform();
			  Thread.sleep(2000);
			  
			  MobileElement gettime = (MobileElement) driver
			  .findElement(MobileBy.
			  xpath("//*[starts-with(@text,'Initial format:')]"));
			 touch.tap(tapOptions().withElement(element(gettime))).perform();
			 Thread.sleep(2000); System.out.println("time:-" + gettime.getText());
			   
			 MobileElement reset = (MobileElement)
			  driver.findElement(MobileBy.xpath("//*[@text='RESET']"));
			  touch.tap(tapOptions().withElement(element(reset))).perform();
			 Thread.sleep(2000);
			 
}

}
