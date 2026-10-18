import java.util.*;
class Area {

    static int rectangleArea(int length, int breadth) {
        return length * breadth;
    }

    int squareArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {

        int length,breadth,side;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length : ");
        length=sc.nextInt();
        System.out.print("Enter breadth : ");
        breadth=sc.nextInt();
        System.out.print("Enter side : ");
        side=sc.nextInt();

        int rectangle = Area.rectangleArea(length,breadth);

        Area obj = new Area();
        int square = obj.squareArea(side);

        System.out.println("Area of Rectangle = " + rectangle);
        System.out.println("Area of Square = " + square);
    }
}