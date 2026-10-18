//Write a Java program to get the index of all the characters of the alphabet in a given string.

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.toLowerCase(str.charAt(i)) == ch) {
                    System.out.println(ch + " = " + i);
                }
            }
        }

        sc.close();
    }
}