package com.sdettraining.appium;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

/**
 * @author 01983O744
 *
 */
public class Appium_01 {

	/**
	 * @param args
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
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
		TouchAction touch = new TouchAction(driver);
		@SuppressWarnings("unchecked")
		List<MobileElement> listElement = (List<MobileElement>) driver.findElementsById("android:id/text1");
		touch.tap(tapOptions().withElement(element(listElement.get(4)))).perform();
		Thread.sleep(2000);

		touch.tap(point(544, 2242)).waitAction(waitOptions(Duration.ofSeconds(10))).perform();

		// x=112
		// y=1566
		Thread.sleep(2000);

		/// Long Tap/Press
		touch.press(element(listElement.get(4))).waitAction(waitOptions(Duration.ofSeconds(10))).release().perform();

		// Horizontal swipe
		touch.press(point(6, 648)).waitAction(waitOptions(Duration.ofSeconds(5))).moveTo(point(860, 648)).release()
				.perform();

		// Vertical swipe
		touch.press(point(6, 648)).waitAction(waitOptions(Duration.ofSeconds(5))).moveTo(point(6, 1572)).release()
				.perform();

	}
}
