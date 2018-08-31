/**
 * @author Mayank
 */
import java.util.Scanner;
/**
 * Class for calculating a power b.
 */
final class Solution {
    /**
     * This is the constructor for Solution.
     */
    private Solution() {
        /**
         * Does nothing.
         */
    }
    /**
     * This method returns the value of 
     * a power b.
     *
     * @param      base      The base
     * @param      exponent  The exponent
     *
     * @return      a power b.
     */
    public static long power(final int base, final int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * power(base, exponent - 1);
        }
    }
    /**
     * This function reads the input and prints
     * the output.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
}


