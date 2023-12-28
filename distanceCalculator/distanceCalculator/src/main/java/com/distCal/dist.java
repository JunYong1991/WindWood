package com.distCal;
public class dist 
{

private double length;
private String unit;
public dist()
{
	
}
//constructor using fields
public dist(double length,String unit) 
{
super();
this.length = length;
this.unit = unit;
}
//getters and setters
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public String getUnit() {
	return unit;
}
public void setUnit(String unit) {
	this.unit = unit;
}

}