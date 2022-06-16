/**
 * Assessment Question: Dog Genetics
 * Steven Kwok
 */

// import required function
import java.util.*;
// If do not have enough memory, un-commend two following code
// import java.util.Scanner;
// import java.util.Random;


public class DogGenetics {
    // main method: entry point of the program
    public static void main(String[] args) {
        // use scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---");
        // obtain the user input of dog name
        System.out.print("What is your dog's name? ");
        String dogName = sc.nextLine();

        // Print out the message that will generate a report, with a separate line
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println();

        // Heading before generating report, with line separator
        System.out.println(dogName + " is: ");
        System.out.println();

        // generate dog DNA report, with separator
        generateDNA();
        System.out.println();

        // Print the final message
        System.out.println("Wow, that's QUITE the dog!    ");
    }

    // method for generating fake DNA report

    public static void generateDNA(){

        // List of DAN components
        String[] listDNA = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        // random generator
        Random random = new Random();
        // set upper bound
        int max = 101;

        for (int i = 0; i < listDNA.length; i++) {
            // generate random number
            int randomNum = random.nextInt(max);
            // show the percentage of one component
            System.out.println(randomNum + "% " + listDNA[i]);
            // reduce the upper bound for next generation
            max -= randomNum;
        }
        // thus, we can ensure that the percentage sum of all components is equal to 100%
    }

}
