package com.sdettraining.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogDemo_01 {
	
	
public static Logger applog() {
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"//Resource//Log4j.properties");
		Logger applog=Logger.getLogger("devpinoyLogger");      
		return applog;
		
	}
	
public static void main(String[] args) {
	new LogDemo_01();
	LogDemo_01.applog().debug("Hello Thi is my first logi for restAssured1111");
}	

}
