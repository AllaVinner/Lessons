package lesson20_WebServices;

import java.util.Date;

public class Quake {

	
	//fields for quake: information
	private Date date;
	private String details;
	private String location;
	private double magnitude;
	private String link;
	
	//constructor 
	public Quake(Date date, String details, String location, double magnitude, String link){
		this.date=date;
		this.details = details;
		this.location = location;
		this.magnitude = magnitude;
		this.link = link;
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public String getDetails(){
		return this.details;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	public double getmagnitude(){
		return this.magnitude;
	}
	
	public String getLink(){
		return this.link;
	}
	
}
