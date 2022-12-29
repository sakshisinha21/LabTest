/*
* Program:- Write a Java program to reverse a string without using StringBuffer and StringBuilder
* @Author:- SAKSHI PRIYA
* @Date:- 29-DEC-2022
*/

//CREATING PACKAGE NAME
package com.question3;

//import scanner 
import java.util.Scanner;

//declaring class name
public class Reverse {

	void revString(String string) {
		
		System.out.print("Reversed String: ");
		for (int i = string.length() - 1; i>=0; i--) {
			System.out.print(string.charAt(i));
		
		}
	}

    //main method
	public static void main(String[] args) {

        //scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();

        //class object
		Reverse ob = new Reverse();

        //function calling
		ob.revString(str);
		sc.close();
	}
	//end of main method
	
}
//end of class