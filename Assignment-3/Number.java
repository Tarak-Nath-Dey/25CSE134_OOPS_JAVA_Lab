import java.lang.*;
import java.util.*;
class Number {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        if(n>0){
            System.out.println("Positive");
        }else if(n<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
