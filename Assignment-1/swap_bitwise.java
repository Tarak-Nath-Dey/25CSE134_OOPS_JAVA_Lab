import java.lang.*;
class swap_bitwise {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("Value before swap: ");
        System.out.println("a: "+a+"\n"+"b :"+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Value after swap: ");
        System.out.println("a: "+a+"\n"+"b :"+b);
    }

}
