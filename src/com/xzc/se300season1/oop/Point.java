package com.xzc.se300season1.oop;

public class Point {
	
	double x,y,z;
	
	public Point(double _x, double _y, double _z){
		x = _x;
		y = _y;
		z = _z;
	}
	
	public void setX(double _x){
		x = _x;
	}
	
	public void setY(double _y){
		y = _y;
	}
	
	public void setZ(double _z){
		z = _z;
	}
	
	public double distance(Point p){
		return Math.sqrt((x-p.x)*(x-p.x) 
				+ (y-p.y)*(y-p.y) + (z-p.z)*(z-p.z));
	}
	
}
