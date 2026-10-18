//Write a program to enter the length, breadth and height. Calculate and print the volume of rectangle, square and cone.

import java.lang.*;
class volume{
    public static void main(String[] args) {
        int length=5, breadth=2, height=3, side=4, radius=6;
        double vol_rec, vol_sq, vol_cn;

        vol_rec=length*breadth*height;
        vol_sq=side*side*side;
        vol_cn=3.14*radius*radius*(height/3.0);

        System.out.println("Volume of rectangle: "+vol_rec);
        System.out.println("Volume of square: "+vol_sq);
        System.out.println("Volume of cone: "+vol_cn);

    }
}