package src; /**
 * Assessment Question: Healthy Hearts
 * Steven Kwok
 */

// import Scanner function
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        // set up the scanner
        Scanner sc = new Scanner(System.in);

        // generate the heading
        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---");

        // Ask user input
        System.out.print("What is your age? ");
        int age = sc.nextInt();

        // Calculate the maximum heart rate
        int maxHeartRate = 220 - age;
        // print the result
        System.out.println("Your maximum heart rate should be "+ maxHeartRate +" beats per minute");

        // calculate the target HR zone
        int lowerHeartRate = maxHeartRate * 50 / 100;  // lower bound of heart rate
        int upperHeartRate = maxHeartRate * 85 / 100;  // upper bound of heart rate
        // print the result
        System.out.println("Your target HR Zone is " + lowerHeartRate + " - " + upperHeartRate + " beats per minute");
    }
}
