/**
 * @author Mayank
 */
import java.util.Scanner;
/**
 * This is class to reverse String.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //Nothing happens here
    }
    /**
     * Reverses the strings and returns it.
     *
     * @param      s     Takes the input String
     *
     * @return     Reverses the String and returns it
     */
    public static String reverseString(final String s) {
        String str = "";
        for (int i = (s.length() - 1); i >= 0; i--) {
            str = str + String.valueOf(s.charAt(i));
        }
        return str;
    }
    /**
     * This is the main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
}
