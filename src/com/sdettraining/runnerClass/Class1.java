package com.sdettraining.runnerClass;

import java.util.HashMap;

public class Class1 {
	
	
	public static void main(String[] args) {
		
	HashMap<String, String> hasmap=new HashMap<String,String>();
	
		String str="UserIDText=null";
		String str1[]=str.split(";");
		for(int i=0;i<str1.length;i++){
			System.out.println(str1[i]);
			
		}
		
		for( String items :str.split(";")){
			  if(items.contains("=")){
				 System.out.println(items.split("=")[0]);
				 System.out.println(items.split("=")[1]);
				 hasmap.put(items.split("=")[0], items.split("=")[1]);
			  }
		}
		
		System.out.println(hasmap);
	}

}
