//Write a Java program to demonstrate multiple inheritance through default method(Using Interface).

interface Parent1 {

    int a = 5;

    default void showParent1() {
        System.out.println("This is Parent1");
        System.out.println("Value of a = " + a);
    }
}

interface Parent2 {

    int b = 6;

    default void showParent2() {
        System.out.println("This is Parent2");
        System.out.println("Value of b = " + b);
    }
}

class Child implements Parent1, Parent2 {

    int c = 10;

    void display() {

        System.out.println("Value from Parent1 = " + a);
        System.out.println("Value from Parent2 = " + b);
        System.out.println("Value from Child = " + c);

        System.out.println();

        showParent1();
        showParent2();
    }

    public static void main(String args[]) {

        Child obj = new Child();

        obj.display();
    }
}