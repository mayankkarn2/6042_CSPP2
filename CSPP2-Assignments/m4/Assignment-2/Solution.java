import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * { item_description }.
     */
    /**
     * Constructs the object.
     */
    private Solution() {
        //Nothing happens here
    }
    /* Fill the main function to print resultant of addition of matrices*/
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * { var_description }.
         */
        Scanner s = new Scanner(System.in);
        int rowsOne = s.nextInt();
        // System.out.println(rowsOne);
        int colOne = s.nextInt();
        // System.out.println(colOne);
        int[][] mat1 = new int[rowsOne][colOne];
        for (int i = 0; i < rowsOne; i++) {
            for (int j = 0; j < colOne; j++) {
                mat1[i][j] = s.nextInt();
            }
            // System.out.println();
        }
        int rowsTwo = s.nextInt();
        int colTwo = s.nextInt();
        int[][] mat2 = new int[rowsTwo][colTwo];
        for (int i = 0; i < rowsTwo; i++) {
            for (int j = 0; j < colTwo; j++) {
                mat2[i][j] = s.nextInt();
            }
            // System.out.println();
        }
        int[][] mat3 = new int[rowsOne][colTwo];
        if (rowsOne == rowsTwo && colOne == colTwo) {
            for (int i = 0; i < rowsOne; i++) {
                for (int j = 0; j < colOne; j++) {
                    mat3[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            for (int i = 0; i < rowsOne; i++) {
                for (int j = 0; j < colOne; j++) {
                    System.out.print(mat3[i][j]);
                    if (j != colOne - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                }
            } else {
                System.out.println("not possible");
            }
    }
}
