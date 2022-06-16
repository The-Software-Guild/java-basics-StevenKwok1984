/**
 * This is my answer of Summative Sums Exercise
 */

public class SummativeSums {

    public static void main(String[] args) {
        // Assign result
        int[][] intArray = {{ 1, 90, -33, -55, 67, -16, 28, -55, 15 },
                { 999, -60, -77, 14, 160, 301 }, { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 } };

        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---");
        for (int i = 0; i < intArray.length; i++) {
            // sum element in each array
            int sum = 0;
            sum = sumResult(intArray, i);
            System.out.println("#" + i+1 + " Array Sum: " + sum + "");
        }
    }

    // Function for return total number of each array
    public static int sumResult(int[][] Array, int i) {

        int total = 0;
        for (int j = 0; j < Array[i].length; j++) {
            total += Array[i][j];
        }
        return total;

    }

}
