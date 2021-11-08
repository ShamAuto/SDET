package com.sdettraining.basetest;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("javadoc")
public class BaseTest{
	
	public static Logger applog=Logger.getLogger("devpinoyLogger");
	public static ObjectMapper obj = new ObjectMapper();

}
