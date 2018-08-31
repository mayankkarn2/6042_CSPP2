/**
 * @author : Mayank
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
        /**
         * Constructs the object.
         */
    private Solution() {
            //Nothing happens here
    }
    /**
     * .
     *
     * @param      a     Coefficient of x square
     * @param      b     Coefficient of x
     * @param      c     Constant
     */
    public static void roots(final int a, final int b, final int c) {
        /**
         * This function gives roots of QE.
         * Input : Integer
         * Output : Double
         */
    final int four = 4;
    int dis = (b * b) - (four * a * c);
    double rootOne = (-b + (Math.sqrt(dis))) / (2 * a);
    double rootTwo = (-b - (Math.sqrt(dis))) / (2 * a);
    System.out.print(rootOne + " " + rootTwo);
}
    /**
     * This is the main function. It prints roots.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * { var_description }.
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
}




