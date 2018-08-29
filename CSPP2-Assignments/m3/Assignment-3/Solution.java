
import java.util.Scanner;
/*
    Do not modify this main function.
    */
/**
 * { item_description }.
 */
final class Solution {
    /**
     * Constructs the object.
     */

    private Solution() {
        //Nothing happens here
    }
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
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }
    /**
     * { function_description }.
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { description_of_the_return_value }
     */
    public static int gcd(final int n1, final int n2) {
        int gcdVa = 1;
        for (int i = 2; i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcdVa = i;
            }
        }
        return gcdVa;
    }
}
