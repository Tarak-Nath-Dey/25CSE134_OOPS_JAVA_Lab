/** Write a program to create a class called "Person" with a name and age attribute.
 Create two instances of the "Person" class, set their attributes using the constructor and print their name and age. **/

import java.util.*;
class Person{
	String name;
	int age;
		
	Person(String name, int age) {
        	this.name = name;
        	this.age = age;
    	}
	
	public static void main(String args[]){

		String n1,n2;
		int age1,age2;

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the name of Person 1:");
		n1=sc.nextLine();
		System.out.print("Enter the age of Person 1:");	
		age1=sc.nextInt();
		sc.nextLine();

		System.out.print("Enter the name of Person 2:");
		n2=sc.nextLine();
		System.out.print("Enter the age of Person 2:");	
		age2=sc.nextInt();
		
		Person p1=new Person(n1,age1);
		Person p2=new Person(n2,age2);
		
		System.out.println("Name:"+p1.name + " Age:"+p1.age);
		System.out.println("Name:"+p2.name + " Age:"+p2.age);
	}
}

