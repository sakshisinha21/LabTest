//declaring package name
package com.question1;

//import scanner
import java.util.Scanner;

//declaring class name
public class Test {

	//main method
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		
		System.out.println("Enter Employee's Name: ");
		emp.name=sc.next();
		
		System.out.println("Enter Employee's Age: ");
		emp.age=sc.nextInt();
		
		System.out.println("Enter Employee's Phone Number: ");
		emp.PhoneNumber=sc.nextInt();
		
		System.out.println("Enter Employee's Address: ");
		emp.address=sc.next();
		
		System.out.println("Enter Employee's Specialization: ");
		emp.Specialization=sc.next();
		
		System.out.println("Enter Employee's Department: ");
		emp.Department=sc.next();

		
		//mathod to print details of employees
		System.out.println("*************Employee Details*************");
		System.out.println("Name: " + emp.name);
		System.out.println("Age: " + emp.age);
		System.out.println("Phone Number: " + emp.PhoneNumber);
		System.out.print("Salary: ");
		emp.printSalary(900000);
		System.out.println("Specialization: " + emp.Specialization);
		System.out.println("Department: " + emp.Department);
		System.out.println("------------------------------------------");

		
		
		Manager man = new Manager();
		
		System.out.println("Enter Manager's Name: ");
		man.name=sc.next();
		
		System.out.println("Enter Manager's Age: ");
		man.age=sc.nextInt();
		
		System.out.println("Enter Manager's Phone Number: ");
		man.PhoneNumber = sc.nextInt();
		
		System.out.println("Enter Manager's Address: ");
		man.address=sc.next();
		
		System.out.println("Enter Manager's Specialization: ");
		man.Specialization=sc.next();
		
		System.out.println("Enter Manager's Department: ");
		man.Department=sc.next();

		
		//mathod to print details of managers
		System.out.println("*************Manager Details*************");
		System.out.println("Name: " + man.name);
		System.out.println("Age: " + man.age);
		System.out.println("Phone Number: " + man.PhoneNumber);
		System.out.print("Salary: ");
		man.printSalary(1200000);
		System.out.println("Specialization: " + man.Specialization);
		System.out.println("Department: " + man.Department);
		System.out.println("------------------------------------------");

		sc.close();

	//end of method	
	}

//end of class	
}