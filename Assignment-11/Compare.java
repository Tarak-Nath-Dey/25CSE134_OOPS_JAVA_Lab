//Write a Java Program to compare two strings lexicographically. Two strings are lexicographically equal if they are of the same length and contains the same characters in the same position.

//Sample Input:
//String 1: This is Exercise 1
//String 2: This is Exercise 2

//Sample Output:
//"This is Exercise 1" is less than "This is Exercise 2"

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();

        int result = s1.compareTo(s2);

        if (result == 0) {
            System.out.println("\"" + s1 + "\" is equal to \"" + s2 + "\"");
        } else if (result < 0) {
            System.out.println("\"" + s1 + "\" is less than \"" + s2 + "\"");
        } else {
            System.out.println("\"" + s1 + "\" is greater than \"" + s2 + "\"");
        }

        sc.close();
    }
}