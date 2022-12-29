/*
* Program:- WAP to accept a number and check number is prime or not.
* @Author:- SAKSHI PRIYA
* @Date:- 22-DEC-2022
*/

//declaring package name
package com.question3;

//import scanner
import java.util.Scanner;

//creating class name
public class PrimeNumber {

	//main method
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//declaring variables
		int i, n, flag=0;
		
		System.out.println("Enter a No:-");
		n = sc.nextInt();
		
		for(i=2; i<n; i++) {
			if (n%i == 0)
			{
				flag++;
				break;
			}
		}
		
		if (i == n)
			System.out.println("It is a Prime No.....");
		else
			System.out.println("It is not a Prime No.....");

	}
	//end of method

}
//end of class