/**
 * This class tests the everything from ArrayList, Square & PointThreeD classes
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 3 Lab)
 * Spring 2023 (03/23/2023)
 */
public class ListApp {
	public static void main(String[] args) {
		ArrayList<Square> squareList = new ArrayList<Square>();
		Square square1 = new Square(1);
		Square square2 = new Square(2);
		Square square3 = new Square(3);
		Square square4 = new Square(4);
		Square square5 = new Square(5);
		Square square6 = new Square(6);
		System.out.println(squareList.addItem(square1));
		System.out.println(squareList.addItem(square2));
		System.out.println(squareList.addItem(square3));
		System.out.println(squareList.addItem(square4));
		System.out.println(squareList.addItem(square5));
		System.out.println(squareList.addItem(square6));
		System.out.println(squareList.toString());
		ArrayList<PointThreeD> pointThreeDList = new ArrayList<PointThreeD>();
		PointThreeD point1 = new PointThreeD(1,1,1);
		PointThreeD point2 = new PointThreeD(2,2,2);
		PointThreeD point3 = new PointThreeD(3,3,3);
		PointThreeD point4 = new PointThreeD(4,4,4);
		PointThreeD point5 = new PointThreeD(5,5,5);
		PointThreeD point6 = new PointThreeD(6,6,6);
		System.out.println(pointThreeDList.addItem(point1));
		System.out.println(pointThreeDList.addItem(point2));
		System.out.println(pointThreeDList.addItem(point3));
		System.out.println(pointThreeDList.addItem(point4));
		System.out.println(pointThreeDList.addItem(point5));
		System.out.println(pointThreeDList.addItem(point6));
		System.out.println(pointThreeDList.toString());
		ArrayList<String> stringList = new ArrayList<String>();
		String string1 = "String One";
		String string2 = "String Two";
		String string3 = "String Three";
		String string4 = "String Four";
		String string5 = "String Five";
		String string6 = "String Six";
		System.out.println(stringList.addItem(string1));
		System.out.println(stringList.addItem(string2));
		System.out.println(stringList.addItem(string3));
		System.out.println(stringList.addItem(string4));
		System.out.println(stringList.addItem(string5));
		System.out.println(stringList.addItem(string6));
		System.out.println(stringList.toString());
	}//end main()
}//end ListApp class