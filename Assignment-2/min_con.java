import java.lang.*;

public class min_con {
    public static void main(String[] args) {
        int minutes = 9000000;

        int totalDays = minutes / (60 * 24);
        int years = totalDays / 365;
        int days = totalDays % 365;

        System.out.println(minutes + " minutes is approximately " +
                           years + " years and " + days + " days.");

    }
}