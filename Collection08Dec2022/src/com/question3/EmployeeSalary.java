/*Program: ABC company wants to increment the salary of employees 10% from their current salary.
*          But the MD of company set the one criteria, those the employee need to be work more than
*          3 years in this company. 
*          Help the HR of ABC company to achieve the task
* @Author:-SAKSHI PRIYA 
* @Date: 08-DEC-2022
*/


//declaring package
package com.question3;

//create class name
class Employee
{
	
	//declaring variables
	int id,year;
	float sal;
	String name;
	
	
	public Employee(int id, String name, float sal, int year) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.year = year;
	
	}
	
	public void increment()
	
	{
		if(year>3)
		{
			
			System.out.println("Congratulations!!! Your Salary is incremented.....");
			System.out.println("Your New Incremented Salary is: "+(sal+((sal*10)/100)));
		
		}
		else
			System.out.println("Sorry!!! Your Experience Is Low.....");
	
	}
}


public class EmployeeSalary {
	
	//main mathod
	public static void main(String[] args) {
		
		
		//method to print employees details
		Employee obj1 = new Employee(1, "Sakshi", 90000f, 4);
		Employee obj2 = new Employee(2, "Khushi", 60000f, 2);
        Employee obj3 = new Employee(3, "Raunak", 100000f, 8);
		Employee obj4 = new Employee(4, "Rahul", 50000f, 1);
		Employee obj5 = new Employee(5, "Shahnawaz", 90000f, 4);
		Employee obj6 = new Employee(6, "Dheeraj", 80000f, 4);
		
		System.out.println("ID: "+obj1.id);
		System.out.println("Name: "+obj1.name);
		System.out.println("Salary: "+obj1.sal);
		System.out.println("Year of Experience: "+obj1.year);
		obj1.increment();
		

		System.out.println("\n");
		System.out.println("ID: "+obj2.id);
		System.out.println("Name: "+obj2.name);
		System.out.println("Salary: "+obj2.sal);
		System.out.println("Year of Experience: "+obj2.year);
		obj2.increment();
		
		System.out.println("\n");
		System.out.println("ID: "+obj3.id);
		System.out.println("Name: "+obj3.name);
		System.out.println("Salary: "+obj3.sal);
		System.out.println("Year of Experience: "+obj3.year);
		obj3.increment();
		
		System.out.println("\n");
		System.out.println("ID: "+obj4.id);
		System.out.println("Name: "+obj4.name);
		System.out.println("Salary: "+obj4.sal);
		System.out.println("Year of Experience: "+obj4.year);
		obj4.increment();
		
		System.out.println("\n");
		System.out.println("ID: "+obj5.id);
		System.out.println("Name: "+obj5.name);
		System.out.println("Salary: "+obj5.sal);
		System.out.println("Year of Experience: "+obj5.year);
		obj5.increment();
		
		System.out.println("\n");
		System.out.println("ID: "+obj6.id);
		System.out.println("Name: "+obj6.name);
		System.out.println("Salary: "+obj6.sal);
		System.out.println("Year of Experience: "+obj6.year);
		obj6.increment();
		
	}
	//end of main mathod

}
//end of class