import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
        /**
         * Constructs the object.
         */
    private Solution() {
            //Hi
    }
    /**
     * { function_description }.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    public static void roots(final int a, final int b, final int c) {
        /**
         * { var_description }.
         */
    final int four = 4;
    int dis = (b * b) - (four * a * c);
    double rootOne = (-b + (Math.sqrt(dis))) / (2 * a);
    double rootTwo = (-b - (Math.sqrt(dis))) / (2 * a);
    System.out.print(rootOne + " " + rootTwo);
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
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}




