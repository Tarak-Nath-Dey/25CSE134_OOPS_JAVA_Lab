//Write a Java program to implement Polymorphism.(Note: Consider a scenario Bank is a class that provides methods to get the rate of interest. But rate of interest may differ according to banks. For example, SBI, ICICI, and AXIS are providing 8.4%, 7.3%, and 9.7% rate of interest.)

class Bank {
    float roi;

    float getROI() {
        return roi;
    }
}

class SBI extends Bank {
    SBI() {
        roi = 8.4f;
    }
}

class ICICI extends Bank {
    ICICI() {
        roi = 7.3f;
    }
}

class AXIS extends Bank {
    AXIS() {
        roi = 9.7f;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getROI() + "%");

        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getROI() + "%");

        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getROI() + "%");
    }
}