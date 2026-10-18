import java.lang.*;
import java.util.Scanner;
class subjects{
    public static void main(String[] args) {
        int Eng, Maths, ES, DS, COA;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks in English: ");
        Eng=sc.nextInt();
        System.out.print("Enter marks in Mathematics: ");
        Maths=sc.nextInt();
        System.out.print("Enter marks in Environmental Sciences: ");
        ES=sc.nextInt();
        System.out.print("Enter marks in Data Structures: ");
        DS=sc.nextInt();
        System.out.print("Enter marks in COA: ");
        COA=sc.nextInt();
        int total=Eng+Maths+ES+DS+COA;
        float percent=(float)((total/500.0)*100.0);
        System.out.println("Total marks secured: "+total);
        System.out.println("Percentage secured: "+percent);
    }
}