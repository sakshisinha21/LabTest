//declaring package name
package com.question2;

//declaring class name
public class Test {

	//main method
	public static void main(String[] args) {
		
		Square s1=new Square(18, 15, 9);
		
		//method to print 
		System.out.println("Area of Square =" + s1.area(7, 7));
		System.out.println("Perimeter of Square =" + s1.perimeter(7, 7));
		System.out.println("\nArea of Rectangle =" + s1.area(28, 19));
		System.out.println("Perimeter of Rectangle =" + s1.perimeter(28, 19));

	}
	//end of method

}
//end of class