package com.sdettraining.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Util {
	public static FileInputStream fs;
	public static Properties prop;
	public static Logger applog;
	/**
	 * @param propname
	 * @return
	 * @throws IOException
	 */
	public static String configReader(String propname) throws IOException {
		fs = new FileInputStream(System.getProperty("user.dir") + "//Resource//browser-config.properties");
		prop = new Properties();
		prop.load(fs);
		return prop.getProperty(propname);
	}

	/**
	 * @return
	 */
	public static Logger applog() {

		PropertyConfigurator.configure(System.getProperty("user.dir") + "//Resource//Log4j.properties");
	    applog = Logger.getLogger("devpinoyLogger");
		return applog;

	}
}
