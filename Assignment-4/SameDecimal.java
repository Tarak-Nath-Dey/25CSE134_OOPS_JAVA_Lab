import java.lang.*;
import java.util.*;

class SameDecimal {
    public static void main(String[] args) {
        float a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        a=sc.nextFloat();
        System.out.print("Enter 2nd number:");
        b=sc.nextFloat();
        if((int)(a*1000)==(int)(b*1000)){
            System.out.println("Floating-point numbers same up to three decimal places.");
        }else{
            System.out.println("Floating-point numbers not same.");
        }
        sc.close();
    }
}
