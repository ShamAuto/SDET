package com.sdettraining.appium;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

/**
 * @author 01983O744
 *
 */
public class Appium_02 {

	/**
	 * @param args
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

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

		AppiumDriver driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		//TouchAction touch = new TouchAction(driver);
		
		
		List<MobileElement> listElement=(List<MobileElement>)driver.findElementsById("android:id/text1");
		
		TouchAction touch1=new TouchAction(driver);
		touch1.tap(element(listElement.get(0)))
		.waitAction(waitOptions(Duration.ofSeconds(3)))
		.release()
		.waitAction(waitOptions(Duration.ofSeconds(3)));
		
		TouchAction touch2=new TouchAction(driver);
		touch2.tap(element(listElement.get(4)))
		.waitAction(waitOptions(Duration.ofSeconds(3)))
		.release()
		.waitAction(waitOptions(Duration.ofSeconds(3)));
		
		
		TouchAction touch3=new TouchAction(driver);
		touch3.tap(element(listElement.get(7)))
		.waitAction(waitOptions(Duration.ofSeconds(3)))
		.release()
		.waitAction(waitOptions(Duration.ofSeconds(3)));
		
		MultiTouchAction multi=new MultiTouchAction(driver);
		multi.add(touch1)
		.add(touch2)
		.add(touch3)
		.perform();
		Thread.sleep(2000);
		/*
		//Search for text
				driver.navigate().to("https://google.com");
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium - Appium");
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
				Thread.sleep(3000);*/


	}
}
