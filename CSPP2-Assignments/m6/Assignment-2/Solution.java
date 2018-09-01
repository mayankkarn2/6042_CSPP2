import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author : Mayank
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      r     Number of rows
     * @param      c    Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a, final int r, final int c) {
        int[][] returnMat = new int[r][c];
        for (int i = 0; i < r; i++) {
            int b = 0;
            int temp = 0;
            int ones = 0;
            final int fifty = 50;
            final int hundred = 100;
            for (int j = 0; j < c; j++) {
                b = a[i][j];
                temp = b;
                ones = temp % hundred;
                if (ones >= fifty) {
                    returnMat[i][j] = b + (hundred - ones);
                } else {
                    returnMat[i][j] = b - ones;
                }
            }
        }
        return returnMat;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}


