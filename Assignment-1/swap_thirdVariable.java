import java.lang.*;
class swap_thirdVariable {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Value before swap: ");
        System.out.println("a: "+a+"\n"+"b :"+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("Value after swap: ");
        System.out.println("a: "+a+"\n"+"b :"+b);
    }
}
