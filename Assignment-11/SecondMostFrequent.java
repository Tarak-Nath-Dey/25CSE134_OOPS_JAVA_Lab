//Write a Java program to find the second most frequent character in a given string.

import java.util.Scanner;

public class SecondMostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int max1 = 0, max2 = 0;
        char ch1 = ' ', ch2 = ' ';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > max1) {
                max2 = max1;
                ch2 = ch1;

                max1 = count;
                ch1 = str.charAt(i);
            } else if (count > max2 && str.charAt(i) != ch1) {
                max2 = count;
                ch2 = str.charAt(i);
            }
        }

        if (max2 == 0) {
            System.out.println("No second most frequent character.");
        } else {
            System.out.println("Second most frequent character: " + ch2);
            System.out.println("Frequency: " + max2);
        }

        sc.close();
    }
}