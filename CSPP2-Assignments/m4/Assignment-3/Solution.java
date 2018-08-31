/**
 * @author Mayank
 */
import java.util.Scanner;
/**
 * Class for calculating binary to decimal.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //Nothing happens here
    }
    /**
     * Calculates the Decimal Value of Binary.
     *
     * @param      s     Decimal value in String
     *
     * @return     returns res
     */
    public static String binaryToDecimal(final String s) {
        double sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int numAti = Character.getNumericValue(c);
            sum = sum + numAti * Math.pow(2, (s.length() - 1) - i);
        }
        int temp = (int) sum;
        String res = Integer.toString(temp);
        return res;
    }
    /**
     * This is main functions. It prints the Decimal
     * Value of binary.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }

}
