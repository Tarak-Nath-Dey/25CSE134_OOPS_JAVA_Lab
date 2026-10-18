//Write a Java Program to check whether two String objects contain the same data or not without using any comparison method.

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();

        if (s1 == s2) {
            System.out.println("Both strings contain the same data.");
        } else {
            if (s1.length() == s2.length()) {
                int i;
                for (i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        break;
                    }
                }

                if (i == s1.length()) {
                    System.out.println("Both strings contain the same data.");
                } else {
                    System.out.println("Both strings contain different data.");
                }
            } else {
                System.out.println("Both strings contain different data.");
            }
        }

        sc.close();
    }
}