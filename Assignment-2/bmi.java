public class bmi {
    public static void main(String[] args) {
        double weight = 72.0; // in kilograms
        double height = 1.78; // in meters
        double bmi = weight / (height * height);
        System.out.println("BMI is: " + bmi);
    }
}
