package com.sdettraining.appium;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

/**
 * @author 01983O744
 *
 */
public class Appium_3 {

	/**
	 * @param args
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public static AppiumDriver<MobileElement> driver;
	public static DesiredCapabilities capability;
	@SuppressWarnings("rawtypes")
	public static TouchAction touch;

	@SuppressWarnings("rawtypes")
	@BeforeMethod
	public static void startAppium() throws MalformedURLException, InterruptedException {
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

		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),
				capability);
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
	public static void checkTimerMethod() throws MalformedURLException, InterruptedException {
		/*@SuppressWarnings("rawtypes")
		TouchAction touch = new TouchAction(driver);*/
		// Case1:Views>>ChronometerStart,check timer, stop and reset

		 // Click on Chronometer 
		MobileElement chronometer = (MobileElement)
		  driver.findElement(MobileBy.xpath("//*[@text='Chronometer']"));
		  touch.tap(tapOptions().withElement(element(chronometer))).perform();
		  Thread.sleep(2000);
		  
		  
		  // click on START 
		  MobileElement start = (MobileElement)
		  driver.findElement(MobileBy.xpath("//*[@text='START']"));
		  touch.tap(tapOptions().withElement(element(start))).perform();
		  Thread.sleep(7000);
		  
		  // click on STOP 
		  MobileElement stop = (MobileElement)
		  driver.findElement(MobileBy.xpath("//*[@text='STOP']"));
		  touch.tap(tapOptions().withElement(element(stop))).perform();
		  Thread.sleep(2000);
		  
		  // Capture time 
		  MobileElement gettime = (MobileElement) driver
		  .findElement(MobileBy.
		  xpath("//*[starts-with(@text,'Initial format:')]"));
		  touch.tap(tapOptions().withElement(element(gettime))).perform();
		  Thread.sleep(2000); System.out.println("time:-" + gettime.getText());
		
		  // click on RESET 
		  MobileElement reset = (MobileElement)
		 driver.findElement(MobileBy.xpath("//*[@text='RESET']"));
		  touch.tap(tapOptions().withElement(element(reset))).perform();
		  Thread.sleep(2000);
		 
	}
		
	     /*  Case2:Views>>Controls>>Hold or Old Them check box selection and radio button */   
	     @Test
		 public static void checkBocAndRadioButtonMethod() throws InterruptedException{
			 MobileElement controls =
		  (MobileElement)
		  driver.findElement(MobileBy.xpath("//*[@text='Controls']"));
		 touch.tap(tapOptions().withElement(element(controls))).perform();
		  Thread.sleep(2000);
		  
		 // Click on Controls
		  MobileElement holdOldTheme = (MobileElement)
		 driver.findElement(MobileBy.xpath("//*[@text='6. Holo or Old Theme']"
		  ));
		  touch.tap(tapOptions().withElement(element(holdOldTheme))).perform();
		 Thread.sleep(2000);
		  
		  MobileElement checkbox1 = (MobileElement)
		  driver.findElement(MobileBy.xpath("//*[@text='Checkbox 1']"));
		  touch.tap(tapOptions().withElement(element(checkbox1))).perform();
		  Thread.sleep(2000);
		  
		  checkbox1.click();
		  System.out.println(checkbox1.getAttribute("checked"));
		  
		  MobileElement radioButton2 = (MobileElement)
		  driver.findElement(MobileBy.xpath("//*[@text='RadioButton 2']"));
		  touch.tap(tapOptions().withElement(element(radioButton2))).perform();
		  Thread.sleep(2000);
		  
		 radioButton2.click();
		 System.out.println(radioButton2.getAttribute("checked"));
	}

	
		 /*
		Case3:Views>>Date Widgets>>1.Dialog Change Date to +1, validate updated date
		  */ 
	    @Test  
		public static void updateddDateMethod() throws InterruptedException{
		MobileElement dateWidgets = (MobileElement)
		  driver.findElement(MobileBy.xpath("//*[@text='Date Widgets']"));
		  touch.tap(tapOptions().withElement(element(dateWidgets))).perform();
		 Thread.sleep(2000);
		 
		  //Click on 1.Dialog 
		 MobileElement dialog1 = (MobileElement)
		  driver.findElement(MobileBy.xpath("//*[@text='1. Dialog']"));
		 touch.tap(tapOptions().withElement(element(dialog1))).perform();
		 Thread.sleep(2000);
		
		// Click on CHANGE THE DATE
		  MobileElement captureDateBeforeChange=(MobileElement)
		  driver.findElement(MobileBy.xpath(
		 "//[@resource-id='io.appium.android.apis:id/dateDisplay']"));
		  touch.tap(tapOptions().withElement(element(captureDateBeforeChange)))
		 .perform(); Thread.sleep(2000);
		  System.out.println(captureDateBeforeChange.getAttribute("text"));
	      }

		// touch.tap(point(235,308)).waitAction(waitOptions(Duration.ofSeconds(10))).perform();

		/*
		 * List<?> textView=driver.findElements(MobileBy.className(
		 * "android.widget.TextView")); System.out.println(textView.size());
		 * for(Object tview:textView){ System.out.println(tview); }
		 */
		// captureDateBeforeChange.click();
		// System.out.println("captureDateBeforeChange"+captureDateBeforeChange.getAttribute("text"));
		/*
		 * // Click on CHANGE THE DATE MobileElement changeTheDate=
		 * (MobileElement)
		 * driver.findElement(MobileBy.xpath("//*[@text='CHANGE THE DATE']"));
		 * touch.tap(tapOptions().withElement(element(changeTheDate))).perform()
		 * ; Thread.sleep(2000);
		 * 
		 * // Click on date 12 MobileElement selectedDate= (MobileElement)
		 * driver.findElement(MobileBy.xpath("//*[@text='12']"));
		 * touch.tap(tapOptions().withElement(element(selectedDate))).perform();
		 * Thread.sleep(2000);
		 * 
		 * // Click on ok button MobileElement clickOnOk= (MobileElement)
		 * driver.findElement(MobileBy.xpath("//*[@text='OK']"));
		 * touch.tap(tapOptions().withElement(element(clickOnOk))).perform();
		 * Thread.sleep(2000);
		 * 
		 * // Click on CHANGE THE DATE MobileElement captureDateAfterChange=
		 * (MobileElement)
		 * driver.findElement(MobileBy.className("android.widget.TextView"));
		 * touch.tap(tapOptions().withElement(element(captureDateAfterChange))).
		 * perform(); Thread.sleep(2000); captureDateAfterChange.click();
		 * System.out.println("captureDateBAfterChange"+captureDateAfterChange.
		 * getAttribute("text"));
		 */
		
	    /*
	      Case4:Views>>Expandable List>>1.Custom Adapter Check expanded items and validate them
	    */
	     @Test 
	    public static void checkItemsMethod() throws InterruptedException{
		  MobileElement expandableLists = (MobileElement)
		  driver.findElement(MobileBy.xpath("//*[@text='Expandable Lists']"));
		  touch.tap(tapOptions().withElement(element(expandableLists))).perform(); 
		  Thread.sleep(2000);
		 
		  // click on 1. Custom Adapter
		 MobileElement customAdapter =(MobileElement)driver.findElement(MobileBy.xpath("//*[@text='1. Custom Adapter']"));
		 touch.tap(tapOptions().withElement(element(customAdapter))).perform(); 
		  Thread.sleep(7000);
		  
		  // People Names
		  MobileElement peopleNames = (MobileElement)
		  driver.findElement(MobileBy.xpath("//*[@text='People Names']"));
		  touch.tap(tapOptions().withElement(element(peopleNames))).perform();
		  Thread.sleep(7000);
		  System.out.println("___________list______________");
		  
		  List<MobileElement> listElement1 = (List<MobileElement>)
		  driver.findElementsByClassName("android.widget.TextView"); 
		  for(MobileElement li1 : listElement1) {
		  System.out.println(li1.getAttribute("text"));
		  
		  }
		 

	}

	@Test
	public static void tabChangingTextMethod() throws InterruptedException {
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().textContains(\"Tabs\"))"));
		element.click();
		Thread.sleep(5000);

		// Click on Expandable Lists
		MobileElement contentByFactory = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[@text='2. Content By Factory']"));
		touch.tap(tapOptions().withElement(element(contentByFactory))).perform();
		Thread.sleep(2000);

		// click on TAB1
		MobileElement tab1 = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='TAB1']"));
		touch.tap(tapOptions().withElement(element(tab1))).perform();
		Thread.sleep(2000);

		MobileElement tab1Text = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[@text='Content for tab with tag tab1']"));
		touch.tap(tapOptions().withElement(element(tab1Text))).perform();
		Thread.sleep(2000);
		System.out.println(tab1Text.getAttribute("text"));
		
		// click on TAB2
		MobileElement tab2 = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='TAB2']"));
		touch.tap(tapOptions().withElement(element(tab2))).perform();
		Thread.sleep(2000);

		MobileElement tab2Text = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[@text='Content for tab with tag tab2']"));
		touch.tap(tapOptions().withElement(element(tab2Text))).perform();
		Thread.sleep(5000);
		System.out.println(tab2Text.getAttribute("text"));

		// click on TAB3
		MobileElement tab3 = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='TAB3']"));
		touch.tap(tapOptions().withElement(element(tab3))).perform();
		Thread.sleep(5000);

		MobileElement tab3Text = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[@text='Content for tab with tag tab3']"));
		touch.tap(tapOptions().withElement(element(tab3Text))).perform();
		Thread.sleep(2000);
		System.out.println(tab3Text.getAttribute("text"));

	}

}
