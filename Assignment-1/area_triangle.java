import java.lang.*;
class area_triangle {
    public static void main(String[] args) {
        int a=10,b=15,c=20;
        double s=(a+b+c)/2.0;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle: "+area);
    }
}
