/**Write a Java program to create a class called "Rectangle" with width and height attributes. 
Calculate the area and perimeter of the rectangle using 2 different methods.**/

import java.util.*;
class Rectangle {
    double width;
    double height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    void calculateArea() {
        double area=width*height;
	System.out.println("Area="+area);
    }

    void calculatePerimeter() {
        double peri=2*(width+height);
	System.out.println("Perimeter="+peri);
    }

    public static void main(String[] args) {
	double w,h;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the width of rectangle : ");
	w=sc.nextDouble();
	System.out.print("Enter the height of rectangle : ");
	h=sc.nextDouble();
	
        Rectangle rect = new Rectangle(w,h);

        rect.calculateArea();
        rect.calculatePerimeter();
    }
}
