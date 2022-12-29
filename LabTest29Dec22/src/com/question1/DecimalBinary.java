/*
* Program:- Write a Java program to convert a decimal number to binary number.
* @Author:- SAKSHI PRIYA
* @Date:- 29-DEC-2022
*/

//Declaring package name
package com.question1;

//import scanner
import java.util.Scanner;

//class declaration
public class DecimalBinary {

	//method to convert decimal to binary
	void decToBin(int n) {
		
		//array to store binary number
		int[] binNum = new int[30];
		int i = 0;
		while (n>0) {
			binNum[i] = n%2;
			n = n/2;
			i++;
			
		}

		
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binNum[j]);
	}

	
	//main method
	public static void main(String[] args) {

		//Object of class
		DecimalBinary obj = new DecimalBinary();

		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a decimal no.: ");
		int num = sc.nextInt();
		
		System.out.println("Decimal No: " + num);
		System.out.print("Binary No: ");

		//calling function
		obj.decToBin(num);
		sc.close();
	} 
	//end of main 

}
//end of class