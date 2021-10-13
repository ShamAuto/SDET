package com.sdettraining.setpdefination;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public WebDriver wd;


	public static WebDriver driver;
	public static Properties prop;


	public BaseTest() {
		prop = new Properties();
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//Resource//browser-config.properties");
			prop.load(fs);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	/*
	public void startUp() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver",
			"./Drivers/chromedriver.exe");
	wd = new ChromeDriver();
	wd.manage().window().maximize();
	Thread.sleep(2000);
	}*/
}
