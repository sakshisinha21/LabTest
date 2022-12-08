/*Program:-Identify the student(name) with the help of thier id(unique) from the generic list of students
*@Author:-SAKSHI PRIYA
*Date:-08-DEC-2022
*/


//declaring package name
package com.question2;

//import the ArrayList class
import java.util.ArrayList;
import java.util.List;

//creating class name
public class Student {
	
	//main merthod
	public static void main(String[] args) {
		
		//define ArratList integers
		List<String> id = new ArrayList<>();
		List<String> name = new ArrayList<>();
		
		//method to print
		id.add("19MCR1001");
		name.add("Sakshi");
		
		id.add("19MCR1002");
		name.add("Khushi");
		
		id.add("19MCR1003");
		name.add("Raunk");
		
		id.add("19MCR1004");
		name.add("Shahnawaz");
		
		id.add("19MCR1005");
		name.add("Dhiraj");
		
		id.add("19MCR1006");
		name.add("Sujata");
		
		
		System.out.println("ID's: "+id);
        System.out.println("Name: "+name);
	
	//end of main method	
	}

//end of class	
}