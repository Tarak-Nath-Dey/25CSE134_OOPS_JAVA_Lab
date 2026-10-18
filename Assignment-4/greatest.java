import java.lang.*;
import java.util.*;
class greatest {
    public static void main(String[] args) {
        int a,b,c,greatest;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        a=sc.nextInt();
        System.out.print("Enter 2nd number:");
        b=sc.nextInt();
        System.out.print("Enter 3rd number:");
        c=sc.nextInt();
        greatest=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Greatest Number: "+greatest);
        sc.close();
    }
}
