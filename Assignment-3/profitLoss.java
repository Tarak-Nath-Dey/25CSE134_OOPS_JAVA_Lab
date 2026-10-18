import java.lang.*;
import java.util.*;
class profitLoss {
    public static void main(String[] args) {
        float cp,sp,p;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cost price:");
        cp=sc.nextFloat();
        System.out.print("Enter selling price:");
        sp=sc.nextFloat();
        sc.close();
        if(sp==cp){
            System.out.println("No profit/loss");
        }
        else if(sp>cp){
            p=((sp-cp)/cp)*100.0f;
            System.out.println("Profit percentage:"+p);
        }else{
            p=((cp-sp)/cp)*100.0f;
            System.out.println("Loss percentage:"+p);
        }
    }
}
