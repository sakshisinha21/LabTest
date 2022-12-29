/*
* Program:- Write a Java program and compute the sum of the digits of an integer.
* @Author:- SAKSHI PRIYA
* @Date:- 29-DEC-2022
*/

//declaring class name
package com.question2;

//import scanner 
import java.util.Scanner;

//creating class name
public class Sum {

    //method for add digits of number
	void integerSum(int n) {
		
		int sum = 0;
		for (int i=n; i>0; i=i/10) {
			
			sum = sum+(i % 10);
		
		}
		
		System.out.println("Sum of Digits: " + sum);
	
	}

    //main method
	public static void main(String[] args) {

		//object of class
		Sum obj = new Sum();

		//scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no..... ");
		int num = sc.nextInt();

        //calling function
		obj.integerSum(num);

	}
	//end of main method
	
}
//end of class