import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * { item_description }.
     */
    private Solution() {
        /**
         * Does nothing.
         */
    }
    /**
     * { function_description }.
     *
     * @param      base      The base
     * @param      exponent  The exponent
     *
     * @return     { description_of_the_return_value }.
     */
    public static long power(final int base, final int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        else {
            return base * power(base, exponent - 1);
        }
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base,exponent);
        System.out.println(result);
    }
}
