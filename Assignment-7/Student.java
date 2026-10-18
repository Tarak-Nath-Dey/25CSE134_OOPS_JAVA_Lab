import java.util.*;
class Student{
	static String name;
	static int rollno;
	static String course;
	static void courseChoice(){
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.nextLine();
		System.out.print("Enter roll no:");
		rollno=sc.nextInt();
		System.out.println("Given choices:\n" +
            "1. Java Programming\n" +
			"2. C++ Programming\n" +
			"3. C Programming\n" +
			"4. Python Programming");
		System.out.print("Enter your choice:");
		ch=sc.nextInt();
		switch(ch){
			case 1:
				course="Java Programming";
				break;
			case 2:
				course="C++ Programming";
				break;
			case 3:
				course="C Programming";
				break;
			case 4:
				course="Python Programming";
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}
	static void display(){
		System.out.println("Name: "+name);
		System.out.println("Roll No.: "+rollno);
		System.out.println("Course selected: "+course);

	}
	public static void main(String args[]){
		courseChoice();
		display();
	}
}