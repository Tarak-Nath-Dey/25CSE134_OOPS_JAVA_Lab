/**Write a Java program to create a class called "Employee" with a name, salary and hire date attribute, and a method to calculate years of service.**/

import java.util.*;
class Employee{
	String name;
	double salary;
	int hireDate;

	Employee(String n, double s, int date) {
        	name = n;
        	salary = s;
        	hireDate = date;
    	}

	public int calculateYearsOfService() {
        	int currentYear = 2026;
        	return currentYear - hireDate;
    	}

	public void displayDetails() {
        	System.out.println("Name: " + name);
        	System.out.println("Salary: " + salary);
        	System.out.println("Hire Date: " + hireDate);
        	System.out.println("Years of Service: " + calculateYearsOfService());
    	}

	
	public static void main(String args[]){

		String n;
		double s;
		int date;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		n=sc.nextLine();
		System.out.print("Enter salary: ");
		s=sc.nextDouble();
		System.out.print("Enter hire date: ");
		date=sc.nextInt();

		Employee employee = new Employee(n,s,date);
        	employee.displayDetails();
	}
}
