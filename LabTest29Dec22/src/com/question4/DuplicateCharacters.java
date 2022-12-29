/*
* Program:- wap to to print duplicate characters in a given string.
* @Author:- SAKSHI PRIYA
* @Date:- 29-DEC-2022
*/

//declaring package name
package com.question4;

//import class
import java.util.Scanner;

//creating class name
public class DuplicateCharacters {

	void duplicate(String string) {
		String dup = "";
		for (int i = 0; i < string.length(); i++) {

			for (int j = 0; j < string.length(); j++) {
				
				if (string.charAt(i) == string.charAt(j)) {
					dup = dup+string.charAt(i);
				}

			}
		
		}
	   	
		System.out.print("Duplicate Characters: " + dup);

	}

	//main method
	public static void main(String[] args) {
        
		//scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();

        //class object
		DuplicateCharacters obj = new DuplicateCharacters();

        //function calling
		obj.duplicate(str);
		sc.close();

	}
    //end of main method
	
}
//end of class