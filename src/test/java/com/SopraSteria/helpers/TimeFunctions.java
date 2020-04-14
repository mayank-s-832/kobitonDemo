package com.SopraSteria.helpers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeFunctions {

	public String getCurrentTimeStamp()
	{
		SimpleDateFormat	sd	=	new SimpleDateFormat("ddMMMyyyyhhmmssa");
		String date=sd.format(new Date());
		return date;
	}
}
