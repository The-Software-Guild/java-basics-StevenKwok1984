/**
 * Assessment Question: Rock, Paper, Scissors
 * Steven Kwok
 */

// for importing Random and Scanner
import java.util.*;
// If do not have enough memory, un-commend two following code
// import java.util.Scanner;
// import java.util.Random;

public class RockPaperScissors {

    // Main method for starting the game
    public static void main(String[] args) {

        //initialise the scanner
        Scanner scanner = new Scanner(System.in);

        // set replay equals true to ensure that the loop runs properly
        boolean replay = true;
        // Heading
        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---");


            // For preventing unexpected error,
            // use do while to assume that the game start at least once
        do {
            /*
            Before the game start
             */
            //get how many rounds with input validation
            int rounds;
            System.out.print("How many rounds would you like to play? ");

            // Check did user enter an input or not
            if(!scanner.hasNextInt()) {
                System.out.println("Error, your input is not number");
                break;  // If enter the incorrect data type, stop the game
            }

            // take user input
            rounds = scanner.nextInt();
            // check if user enter the round numbers between 1 and 10
            if (rounds < 1 || rounds > 10) {
                System.out.println("Error: your input is not between 1 and 10");
                break;      // exit the game with out-of-range number
            }


            /*
            Game Start
             */

            //store game history
            ArrayList<String> gameRecord = new ArrayList<>();

            // initialize the storage of three statistics
            int playerWins = 0;
            int computerWins = 0;
            int ties = 0;


            // Start the playing, according to the rounds decided by player
            for (int i = 1; i <= rounds; i++) {

                // separator and round number
                System.out.println();
                System.out.println("Round: " + i);

                // Player start moving
                int playerChoice = playerPlay();

                // Computer Start Moving
                int computerChoice = computerPlay();

                // result processing
                String result = roundOutcome(playerChoice, computerChoice);

                // Announcing the result outcome of each round and increment statistics
                switch (result) {
                    case "Tie":
                        ties++;
                        gameRecord.add("Tie");
                        printRoundSummary(playerChoice, computerChoice);
                        System.out.println("Its a tie");
                        break;
                    case "Player Win":
                        playerWins++;
                        gameRecord.add("Player Win");
                        printRoundSummary(playerChoice, computerChoice);
                        System.out.println("You win");
                        break;
                    case "Computer Win":
                        computerWins++;
                        gameRecord.add("Computer Win");
                        printRoundSummary(playerChoice, computerChoice);
                        System.out.println("Computer wins");
                        break;
                }
            }


            //print game summary
            printGameSummary(gameRecord, playerWins, computerWins, ties);

            // check who win the entire match
            overallWinner(playerWins, computerWins);

            // ask player that is he want to play again?
            do {
                System.out.println("Would you like to play again? [yes/no]");
                String userInput = scanner.next();
                if (userInput.equals("yes")) { // player wants to play again
                    // continue the loop
                    break;
                } else if (userInput.equals("no")) {  // Player wants to stop
                    System.out.println("Thank you for playing!"); // stop the loop
                    replay = false;
                    break;
                } else {
                    System.out.println("invalid input, try again");
                }
            } while (true);

        } while (replay);

    }

    // method for obtaining player input
    public static int playerPlay() {
        // user scan
        Scanner scan = new Scanner(System.in);
        // initial the player choice
        int playerChoice;
        // player start choosing
        while (true) {
            System.out.println("Choose your move:\n" +
                    "1) Rock\n" +
                    "2) Paper\n" +
                    "3) Scissors");
            // Check that user input a number
            if (!scan.hasNextInt()){
                System.out.println("Error: Please input an integer between 1 and 3");
            }
            int selectedMove = scan.nextInt();
            // check is the number between 1 and 3 or not
            if (selectedMove > 3 || selectedMove < 1) {
                System.out.println("Error: Please input an integer between 1 and 3");
            } else {
                playerChoice = selectedMove;
                break;
            }
        }
        return playerChoice;
    }

    // method to randomly generate computer move
    public static int computerPlay() {
        Random rng = new Random();
        return rng.nextInt(2) + 1;
    }

    /*
        Round Summary
     */

    //method to output the summary of the round
    public static void printRoundSummary(int playerMove, int computerMove) {
        System.out.println("You played: " + getMoveName(playerMove) + "\nComputer Played: " + getMoveName(computerMove));
    }

    // method for converting "play ids" to the string counterpart
    // for user observing the computer's move easier
    public static String getMoveName(int play) {
        switch (play) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Error";
        }
    }

    // logic of rock, paper, scissors
    // check who wins, or a tie result
    public static String roundOutcome(int player, int computer) {
        if (player == computer) {
            return "Tie";
        } else if (player == 1 && computer == 3) {
            return "Player Win";
        } else if (player == 2 && computer == 1) {
            return "Player Win";
        } else if (player == 3 && computer == 2) {
            return "Player Win";
        } else {
            return "Computer Win";
        }
    }

    /*
        Methods: overall result
     */
    // Print game history, with counting of computer winning times, player winning times and ties
    public static void printGameSummary(ArrayList<String> gameRecord, int playerWins, int computerWins, int ties) {
        System.out.println();
        System.out.println("Game History: ");
        System.out.println(gameRecord);
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + ties);
    }

    // Method for judging the overall game winner
    public static void overallWinner(int playerWins, int computerWins) {
        if (playerWins > computerWins) {
            System.out.println("You are the overall winner!");
        } else if (computerWins > playerWins) {
            System.out.println("The computer is the overall winner!");
        } else {
            System.out.println("The game has ended in a draw");
        }
    }


}
