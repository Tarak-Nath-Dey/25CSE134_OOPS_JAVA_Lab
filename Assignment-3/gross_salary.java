import java.lang.*;
import java.util.*;
class gross_salary {
    public static void main(String[] args) {
        float BS;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter basic salary:");
        BS=sc.nextFloat();
        double HRA=0.10*BS;
        double DA=0.60*BS;
        float GS=(float)(BS+HRA+DA);
        System.out.println("Gross Salary: "+GS);
    }
}
