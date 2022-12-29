/*
* Program:- WAP to accept a number and check number is palindrome or not.
* @Author:- SAKSHI PRIYA
* @Date:- 22-DEC-2022 
*/

//declaring package name
package com.question4;

//import scanner
import java.util.Scanner;

//creating class name
public class Palindrome {

	//main method
	public static void main(String[] args) {
		
		//declaring variables
		int i, s = 0, n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:-");
		n = sc.nextInt();
		
		for (i=n; i>0; i=i/10) {
			s=s*10+(i%10);
			
		}
		if (s == n)
			System.out.println("It is a Palindrome No.....");
		else
			System.out.println("It is not a Palindrome No.....");
		sc.close();

	}

}