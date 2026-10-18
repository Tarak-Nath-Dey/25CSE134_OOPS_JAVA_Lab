import java.lang.*;
import java.util.*;
class electricity_bill {
    public static void main(String[] args) {
        int pr,cr;
        double amt;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Previous Reading:");
        pr=sc.nextInt();
        System.out.print("Enter Current Reading:");
        cr=sc.nextInt(); 
        int total=cr-pr;
        if(total<=100){
            amt=total*3.00;
        }
        else if(total>100 && total<=500){
            amt=(100*3.00)+((total-100)*4.00);
        }
        else{
            amt=(100*3.00)+((400)*4.00)+((total-500)*6.00);
        }
        System.out.println("Electricity bill: "+amt);
    }
}
