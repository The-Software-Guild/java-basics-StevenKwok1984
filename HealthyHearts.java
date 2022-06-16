import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = sc.nextInt();

        int maxHeartRate = 220 - age;
        System.out.println("Your maximum heart rate should be "+ maxHeartRate +" beats per minute");

        int lowerHR = maxHeartRate * 50 / 100;
        int upperHR = maxHeartRate * 85 / 100;
        System.out.println("Your target HR Zone is " + lowerHR + " - " + upperHR + " beats per minute");
    }
}
