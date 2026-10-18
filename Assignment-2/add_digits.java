import java.lang.*;

public class add_digits {
    public static void main(String[] args) {
        int n=134,s=0;
        if(n>100 && n<999){
            while(n!=0){
                int d=n%10;
                s+=d;
                n/=10;
            }
            System.out.println("Sum of digits is: "+s);
        }
        else{
            System.out.println("Number is not a three-digit number");
        }
    }
}