import java.util.*;

public class DogGenetics {
    public static void main(String[] args) {
        // use scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---");
        // get the user input of dog name
        System.out.print("What is your dog's name? ");
        String dogName = sc.nextLine();

        // Print out the message that will generate a report
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");

        System.out.println();
        System.out.println(dogName + " is: ");
        System.out.println();

        // generate dog DNA report
        generateDNA();

        System.out.println();
        System.out.println("Wow, that's QUITE the dog!    ");
    }



    public static void generateDNA(){

        // List of DAN components
        String[] listDNA = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        // random generator
        Random random = new Random();
        // set max number
        int max = 101;

        for (int i = 0; i < listDNA.length; i++) {
            int randomNum = random.nextInt(max);
            System.out.println(randomNum + "% " + listDNA[i]);
            max -= randomNum;
        }
    }

}
