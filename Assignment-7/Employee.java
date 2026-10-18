import java.util.*;
class Employee{
	static String name;
	static String job;
	static double salary;
	static void input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name:");
		name=sc.nextLine();
		System.out.print("Enter the job:");
		job=sc.nextLine();
		System.out.print("Enter the salary:");
		salary=sc.nextDouble();
	}
	static void update(int days){
		salary=(days*salary)/30.0;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int working_days;
		input();
		System.out.print("Number of working days:");
		working_days=sc.nextInt();
		update(working_days);
		System.out.println("Employee Name:"+name+"\n"+"Job:"+job+"\n"+"Employee Updated Salary:"+salary);
	}
}