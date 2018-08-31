/**
 * @author Mayank
 */
import java.util.Scanner;
/**
 * Class for Counting 7's upto n.
 */
final class Solution {
/**
 * { This class counts the 7 repeated upto
 * 		n   
 * }
 *
 * @param      args  The arguments
 */
/**
 * .
 */
    private Solution() {
        //Nothing happens here.
    }
    /**
     * This is the main function.
     * It takes the input n and returns 
     * the count of 7 upto n.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String number = Integer.toString(i);
            boolean isFound = number.contains("7");
            if (isFound) {
                char[] numArr = number.toCharArray();
                int count7 = 0;
                for (char num : numArr) {
                    if (num == '7') {
                        count7 += 1;
                    }
                }
                count += count7;
            }
        }
        System.out.println(count);
    }
}
