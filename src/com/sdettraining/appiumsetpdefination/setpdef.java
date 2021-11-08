package com.sdettraining.appiumsetpdefination;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class setpdef extends BaseTest {
	public DesiredCapabilities capability;
	@SuppressWarnings("rawtypes")
	public AppiumDriver driver;
	@SuppressWarnings("rawtypes")
	public TouchAction touch;

	@SuppressWarnings("rawtypes")
	@Given("^user navigate to apidemo application and click on views$")
	public void user_navigate_to_apidemo_application_and_click_on_views() throws Throwable {

		String sFile = "C:\\Users\\ShameemAkther\\Desktop\\DM_Mar_01\\API Testing\\SDET_Training_Oct_04_2021\\ApiDemos-debug.apk";
		System.out.println("*************** APiDemos Aplication started  ************************");
		capability = new DesiredCapabilities();

		capability.setCapability("device", "Android");
		capability.setCapability(CapabilityType.BROWSER_NAME, "");

		capability.setCapability(CapabilityType.VERSION, "22.0");
		capability.setCapability("app", sFile);

		capability.setCapability("deviceName", "Pixel 2 API 30 2");
		capability.setCapability("platformName", "Android");

		capability.setCapability("app-package", "io.appium.android.apis");

		capability.setCapability("app-activity", ".ApiDemos");

		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);

		@SuppressWarnings("unchecked")
		List<MobileElement> listElement = (List<MobileElement>) driver.findElementsById("android:id/text1");
		for (MobileElement li : listElement) {
			System.out.println(li.getText());
		}
		touch = new TouchAction(driver);
		MobileElement views = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='Views']"));
		touch.tap(tapOptions().withElement(element(views))).perform();
		Thread.sleep(2000);
	}

	@Given("^user click on chronometer$")
	public void user_click_on_chronometer() throws Throwable {

		// Click on Chronometer
		MobileElement chronometer = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='Chronometer']"));
		touch.tap(tapOptions().withElement(element(chronometer))).perform();
		Thread.sleep(2000);
	}

	@When("^user click on start buttom$")
	public void user_click_on_start_buttom() throws Throwable {
		// click on START
		MobileElement start = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='START']"));
		touch.tap(tapOptions().withElement(element(start))).perform();
		Thread.sleep(7000);
	}

	@When("^user caputre the time$")
	public void user_caputre_the_time() throws Throwable {
		// Capture time
		MobileElement gettime = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[starts-with(@text,'Initial format:')]"));
		touch.tap(tapOptions().withElement(element(gettime))).perform();
		Thread.sleep(2000);
		System.out.println("time:-" + gettime.getText());
	}

	@When("^user click on stop buttom$")
	public void user_click_on_stop_buttom() throws Throwable {
		// click on STOP
		MobileElement stop = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='STOP']"));
		touch.tap(tapOptions().withElement(element(stop))).perform();
		Thread.sleep(2000);

	}

	@When("^user click on reset buttom$")
	public void user_click_on_reset_buttom() throws Throwable {
		// click on RESET
		MobileElement reset = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='RESET']"));
		touch.tap(tapOptions().withElement(element(reset))).perform();
		Thread.sleep(2000);
	}

	@Then("^user validate  time$")
	public void user_validate_time() throws Throwable {
		MobileElement gettime = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[starts-with(@text,'Initial format:')]"));
		touch.tap(tapOptions().withElement(element(gettime))).perform();
		Thread.sleep(2000);
		System.out.println("time:-" + gettime.getText());
	}

	/*
	 * @Then("^user close the apiDemos$") public void
	 * user_close_the_apiDemos(Data data) throws Throwable { driver.closeApp();
	 * }
	 */

	@Given("^user click on Controls$")
	public void user_click_on_Controls() throws Throwable {
		// Click on Controls
		MobileElement controls = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='Controls']"));
		touch.tap(tapOptions().withElement(element(controls))).perform();
		Thread.sleep(2000);
	}

	@When("^user click on Hold or Old Theme$")
	public void user_click_on_Hold_or_Old_Theme() throws Throwable {
		// Click on Controls
		MobileElement holdOldTheme = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[@text='6. Holo or Old Theme']"));
		touch.tap(tapOptions().withElement(element(holdOldTheme))).perform();
		Thread.sleep(2000);

	}

	@Then("^user close the application$")
	public void user_close_the_application(DataTable arg1) throws Throwable {

		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	@Given("^user click on Date Widgets$")
	public void user_click_on_Date_Widgets() throws Throwable {
		// Click on Date Widgets
		MobileElement dateWidgets = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='Date Widgets']"));
		touch.tap(tapOptions().withElement(element(dateWidgets))).perform();
		Thread.sleep(2000);

	}

	@When("^user click on Dialog$")
	public void user_click_on_Dialog() throws Throwable {
		// Click on 1.Dialog
		MobileElement dialog1 = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='1 Dialog')]"));
		touch.tap(tapOptions().withElement(element(dialog1))).perform();
		Thread.sleep(2000);
	}

	@When("^user click on Change the date$")
	public void user_click_on_Change_the_date() throws Throwable {
		// Click on CHANGE THE DATE
		MobileElement changeTheDate = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[@text='CHANGE THE DATE']"));
		touch.tap(tapOptions().withElement(element(changeTheDate))).perform();
		Thread.sleep(2000);
	}

	@Then("^user click on date$")
	public void user_click_on_date() throws Throwable {
		// Click on date 12
		MobileElement selectedDate = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='12']"));
		touch.tap(tapOptions().withElement(element(selectedDate))).perform();
		Thread.sleep(2000);
	}

	@Then("^user click on ok$")
	public void user_click_on_ok() throws Throwable {
		// Click on ok button
		MobileElement clickOnOk = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='OK']"));
		touch.tap(tapOptions().withElement(element(clickOnOk))).perform();
		Thread.sleep(2000);
	}

	@Then("^user validate updated date$")
	public void user_validate_updated_date() throws Throwable {

	}

	@Given("^user click on Tabs$")
	public void user_click_on_Tabs() throws Throwable {
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Tabs\"))"));
		element.click();
		Thread.sleep(5000);
	}

	@When("^user click on content by factory$")
	public void user_click_on_content_by_factory() throws Throwable {
		MobileElement contentByFactory = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[@text='2. Content By Factory']"));
		touch.tap(tapOptions().withElement(element(contentByFactory))).perform();
		Thread.sleep(2000);
	}

	@When("^user click on tabOne$")
	public void user_click_on_tabOne() throws Throwable {
		MobileElement tab1 = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='TAB1']"));
		touch.tap(tapOptions().withElement(element(tab1))).perform();
		Thread.sleep(5000);
	}

	@Then("^user validate the tabOne text$")
	public void user_validate_the_tabOne_text() throws Throwable {
		MobileElement tab1Text = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='Content for tab with tag tab1']"));
		touch.tap(tapOptions().withElement(element(tab1Text))).perform();
		Thread.sleep(5000);
		System.out.println(tab1Text.getAttribute("text"));
		Assert.assertEquals("Content for tab with tag tab1", tab1Text.getAttribute("text"), "Actual and Expected text are same.");
	}

	@Then("^user click on tabTwo$")
	public void user_click_on_tabTwo() throws Throwable {
		MobileElement tab2 = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='TAB2']"));
		touch.tap(tapOptions().withElement(element(tab2))).perform();
		Thread.sleep(5000);
	}

	@Then("^user validate the tabTwo text$")
	public void user_validate_the_tabTwo_text() throws Throwable {

		MobileElement tab2Text = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='Content for tab with tag tab2']"));
		touch.tap(tapOptions().withElement(element(tab2Text))).perform();
		Thread.sleep(5000);
		System.out.println(tab2Text.getAttribute("text"));
		Assert.assertEquals("Content for tab with tag tab2", tab2Text.getAttribute("text"), "Actual and Expected text are same.");

	}

	@Then("^user click on tabThree$")
	public void user_click_on_tabThree() throws Throwable {
		MobileElement tab3 = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='TAB3']"));
		touch.tap(tapOptions().withElement(element(tab3))).perform();
		Thread.sleep(5000);
	}

	@Then("^user validate the tabThree text$")
	public void user_validate_the_tabThree_text() throws Throwable {

		MobileElement tab3Text = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='Content for tab with tag tab3']"));
		touch.tap(tapOptions().withElement(element(tab3Text))).perform();
		Thread.sleep(5000);
		System.out.println(tab3Text.getAttribute("text"));
		Assert.assertEquals("Content for tab with tag tab3", tab3Text.getAttribute("text"), "Actual and Expected text are same.");
	}

	@When("^user click on RadioButtonSecond and validate$")
	public void user_click_on_RadioButtonSecond_and_validate() throws Throwable {
		MobileElement radioButton2 = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='RadioButton 2']"));
		touch.tap(tapOptions().withElement(element(radioButton2))).perform();
		Thread.sleep(5000);

		radioButton2.click();
		System.out.println("Radio button is selected:-" + radioButton2.isSelected());
	}

	@When("^user click on CheckboxFirst and  validate$")
	public void user_click_on_CheckboxFirst_and_validate() throws Throwable {
		MobileElement checkbox1 = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='Checkbox 1']"));
		touch.tap(tapOptions().withElement(element(checkbox1))).perform();
		Thread.sleep(5000);

		checkbox1.click();
		System.out.println("Checkbox is checked:-" + checkbox1.isSelected());
	}

	@Given("^user click on expandableLists$")
	public void user_click_on_expandableLists() throws Throwable {
		MobileElement expandableLists = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[@text='Expandable Lists']"));
		touch.tap(tapOptions().withElement(element(expandableLists))).perform();
		Thread.sleep(5000);
	}

	@When("^user click on custom Adapter$")
	public void user_click_on_custom_Adapter() throws Throwable {
		MobileElement customAdapter = (MobileElement) driver
				.findElement(MobileBy.xpath("//*[@text='1. Custom Adapter']"));
		touch.tap(tapOptions().withElement(element(customAdapter))).perform();
		Thread.sleep(7000);
	}

	@When("^user click on peopleNames and validate them$")
	public void user_click_on_peopleNames_and_validate_them() throws Throwable {
		MobileElement peopleNames = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='People Names']"));
		touch.tap(tapOptions().withElement(element(peopleNames))).perform();
		Thread.sleep(7000);
		System.out.println("___________list______________");

		@SuppressWarnings("unchecked")
		List<MobileElement> listElement1 = (List<MobileElement>) driver
				.findElementsByClassName("android.widget.TextView");
		for (MobileElement li1 : listElement1) {
			System.out.println(li1.getAttribute("text"));

		}
	}
}