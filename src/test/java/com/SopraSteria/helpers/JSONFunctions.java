package com.SopraSteria.helpers;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONFunctions {
	
	String jsonFilePath;
	
	public JSONFunctions() {
		
		jsonFilePath	=	System.getProperty("user.dir")+File.separator+"TestData"+File.separator+"Config.json";
	}
	
	public JSONFunctions(String filePath) {
		
		jsonFilePath	=	filePath;
	}

	public JSONArray getJSONObject()
	{
		JSONParser jsonparser = new JSONParser();
		try(FileReader reader = new FileReader(jsonFilePath))
		{
			JSONArray configlist = (JSONArray) jsonparser.parse(reader);
			return configlist;
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int getNumberOfThreads()
	{
		try{
			
			JSONObject jOb = (JSONObject) getJSONObject().get(0);
			for(int i=0;i<jOb.keySet().size();i++)
			{
				if(jOb.keySet().toArray()[i].equals("numberOfThreads"))
				{
					return Integer.parseInt(jOb.values().toArray()[i].toString());
				}
			}
		}
		catch (Exception e) {
			return -1;
		}
		return -1;
	}
	
	
	public String getValueOfLabel(String label,int threadName)
	{
		try {
			JSONArray configList = getJSONObject();
			JSONObject obj	=(JSONObject) configList.get(threadName);
			JSONObject obj2=(JSONObject) obj.get("Thread_"+threadName);
			return (String) obj2.get(label);
			
		} catch (Exception e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}
		
		return null;
	}
	

}
