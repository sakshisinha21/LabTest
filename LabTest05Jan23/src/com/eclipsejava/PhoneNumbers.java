/*
* Program:-Write a java program that loads names and phone numbers from a text file where the data is
*          organized as one line per record and each field in a record are separated by tab(\t).It takes
*          a name or phone number as input and prints the corresponding other value from the hash table
*          (hint: use hash tables) 
* @Author:- SAKSHI PRIYA
* Date:- 05-JAN-2023 
*/


//declaring package name
package com.eclipsejava;

//importing.....
import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Scanner;

//create class name
public class PhoneNumbers {
	
	//main method
	public static void main(String args[]) {
		try {
			
			FileInputStream fis = new FileInputStream("D://newfile.txt");
			Scanner sc = new Scanner(fis).useDelimiter("\t");
			Hashtable<String, String> ht = new Hashtable<String, String>();
			
			//declaring varibales
			String[] strarray;
			String a, str;
			
			//using while.....
			while (sc.hasNext()) {
				a = sc.nextLine();
				strarray = a.split("\t");
				ht.put(strarray[0], strarray[1]);
				
				//method to print
				System.out.println("hash table values are" + strarray[0] + ":" + strarray[1]);
			
			}
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the name as given in the phone book");
			str = s.next();
			
			if (ht.containsKey(str)) {
			    System.out.println("Phone Number is" + ht.get(str));
			
			} else {
				
				System.out.println("Name is not Matched.....");
			
			}
		
		} catch (Exception e) {
			System.out.println(e);
		
		}
	
	}
	//end of main method
	
}
//end of class