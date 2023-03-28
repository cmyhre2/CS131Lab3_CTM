/**
 * This class creates and manages Square objects.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 3 Lab)
 * Spring 2023 (03/23/2023)
 */
public class Square {
	private double side;//double variable for a square's side length
	
	
	/*
	 * Default constructor for Square() creates Square objects with side length 0
	 */
	public Square() {
		side = 0.0;
	}//end default Square() constructor
	
	
	/**
	 * Preferred constructor for Square() creates Square object with side length s
	 * @param s
	 */
	public Square(double s) {
		side = s;
	}//end preferred Square() constructor
	
	
	/**
	 * Area calculator & area getter for Square objects.
	 * @return side*side
	 */
	public double getArea() {
		return side*side;
	}//end getArea()
	
	
	/**
	 * toString() method puts all Square instance variables in one string & returns it
	 * @return str
	 */
	public String toString() {
		String str = "Square Side Length: " + side + ", Area: " + getArea();
		return str;
	}//end toString() method
}//end Square class
