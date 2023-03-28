/**
 * This class creates & manages PointThreeD objects
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 3 Lab)
 * Spring 2023 (03/23/2023)
 */
public class PointThreeD {
	private double xPoint;//variable for a PointThreeD's x coord
	private double yPoint;//variable for a PointThreeD's y coord
	private double zPoint;//variable for a PointThreeD's z coord
	
	
	/*
	 * Default PointThreeD() constructor, creates PointThreeD objects with x, y & z coords 0.0
	 */
	public PointThreeD() {
		xPoint = 0.0;
		yPoint = 0.0;
		zPoint = 0.0;
	}//end PointThreeD default constructor
	
	
	/**
	 * Preferred PointThreeD() constructor that sets all coords to the parameters passed in
	 * @param x, y, z
	 */
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end PointThreeD preferred constructor
	
	
	/**
	 * toString method puts all PointThreeD object's instance variables in a string & returns it
	 * @return str
	 */
	public String toString() {
		String str = "PointThreeD Coordinates: (" + xPoint + ", " + yPoint + ", " + zPoint + ")";
		return str;
	}//end toString()
}//end PointThreeD class
