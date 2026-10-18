import java.lang.*;
class add_digits_forLoop {
    public static void main(String[] args) {
        int n = 135;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
