package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date; //Attribute/property
	//setter method for setter injection
	public void setDate(Date date) {
		this.date=date;
	}
	//write b.method having b.logic
	public String generateWishmessage(String user) {
		int hour=0;
		//get current hour of day
		hour=date.getHours();//24 hour format
		//generate wish message
		if(hour<12)
			return"GOOD MORING::"+user;
		else if(hour<17)
			return"GOOD AFTERNOON::"+user;
		else if(hour<20)
			return"GOOD EVENING::"+user;
		else
			return"GOOD NIGHT::"+user;
			
	}

       public void m1(){
       }
	public void m2(){
	}

}
