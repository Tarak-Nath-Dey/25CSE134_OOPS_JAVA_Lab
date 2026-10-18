//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

import java.util.*;
class Circle{
	int radius;
	void update(int r){
		radius=r;
	}
	void calculate(){
		double area = 3.14*radius*radius;
		double circumference = 2*3.14*radius;
		System.out.println("Area of Circle: "+area);
		System.out.println("Circumference of Circle: "+circumference);
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the new value of radius: ");
		int r=scn.nextInt();
		Circle obj = new Circle();
		obj.update(r);
		obj.calculate();
		scn.close();
	}
}