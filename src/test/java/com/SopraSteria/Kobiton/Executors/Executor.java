package com.SopraSteria.Kobiton.Executors;

import com.SopraSteria.helpers.TimeFunctions;

public class Executor {
	
	public static String kobitonServerUrl = "https://samridhisrivastava:0e30b134-805d-44c8-9a5b-1bac74ffda8b@api.kobiton.com/wd/hub";
	
	public static String fileTimestamp;
	
	public static void main(String[] args) {
		try {
			fileTimestamp=new TimeFunctions().getCurrentTimeStamp();
			System.out.println("Starting Execution");
//			new Controller().execute(kobitonServerUrl);
			new Controller().appExecute(kobitonServerUrl);
			new Controller().appExecuteiOS(kobitonServerUrl);
			System.out.println("********************Execution Completed******************");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
}
