/*Program:-Anna wants to create a Contact book of friends.
           She needs name,contact number and email of her friends.
           She don't want duplicates.
           Help Anna achieve the task.
*@Author:-SAKSHI PRIYA
*Date:-08-DEC-2022
*/


//declaring package 
package com.question1;

//import the ArrayList class
import java.util.ArrayList;

//create class 
public class FriendsContactBook {
	
	//main method
	public static void main(String[] args)
	{
		
		//define ArratList integers
		ArrayList<String> name=new ArrayList<>();			
		ArrayList<String> c_no=new ArrayList<>();			
		ArrayList<String> email=new ArrayList<>();				
	
		//method to print
		name.add("Kushi");
		c_no.add("9064576380");
		email.add("khushi1@gmail.com");
		
		name.add("Raunak");
		c_no.add("8064578880");
		email.add("raunak2@@gmail.com");
		
		name.add("Shahnawaz");
		c_no.add("7064576000");
		email.add("shahnawaz3@gmail.com");
				
		name.add("Dheerj");
		c_no.add("9906457380");
		email.add("dheeraj4@gmail.com");
		
		name.add("Sujata");
		c_no.add("8884576380");
		email.add("sujata5@gmail.com");
		
		System.out.println(name);
		System.out.println(c_no);
		System.out.println(email);
		
		
	//end of method	
	}
	
//end of class
}
