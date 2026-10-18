//Write a Java program to implement the static keyword and represent all its uses.

class StaticDemo {

    static int count = 0;

    static {
        System.out.println("Static block executed.");
    }

    StaticDemo() {
        count++;
    }

    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        System.out.println("Static variable count = " + StaticDemo.count);

        StaticDemo.displayCount();
    }
}
