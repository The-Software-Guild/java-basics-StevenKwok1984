package src;

/**
 * Assessment Question: Summative Sums
 * Steven Kwok
 */

public class SummativeSums {
    // main method
    public static void main(String[] args) {

        // Set up all three arrays according to the question
        int[] Array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] Array2 = { 999, -60, -77, 14, 160, 301 };
        int[] Array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        // Combine all three arrays into one
        int[][] combineArrays = { Array1, Array2, Array3 };

        // Print the heading
        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---");

        // Assign the combined array into a loop, for individual summing
        for (int i = 0; i < combineArrays.length; i++) {
            // Obtain sum elements in each array
            int sum = sumResult(combineArrays, i);
            System.out.println("#" + i+1 + " Array Sum: " + sum + "");
        }
    }

    // MEthod for return total number of each array
    public static int sumResult(int[][] Array, int i) {
        // initialise the total value
        int total = 0;
        // summing all elements inside the array
        for (int j = 0; j < Array[i].length; j++) {
            total += Array[i][j];
        }
        // return the total value
        return total;
    }
}
