//Write a Java program to create a class called shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.

class Shape {
    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println("Perimeter of Circle: " + c.getPerimeter());
        System.out.println("Area of Circle: " + c.getArea());
    }
}