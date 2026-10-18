import java.util.*;
import java.lang.*;

class Quadratic {
    public static void main(String[] args) {
        double a, b, c, D, x1, x2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a, b and c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Not a quadratic equation");
        } else {
            D = b * b - 4 * a * c;

            if (D < 0) {
                System.out.println("Roots are imaginary.");
            } else if (D == 0) {
                x1 = -b / (2 * a);
                System.out.println("Root: " + x1);
            } else {
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);

                System.out.println("Roots are: " + x1 + " " + x2);
            }
        }

        sc.close();
    }
}