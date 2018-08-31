/**
 * @author Mayank
 */
import java.util.Scanner;
/**
 * Class for calculating the largest
 * number in array.
 */
final class Solution {
    /**
     * Constructor for Solution.
     */
    private Solution() {
        //Nothing happens here
    }
    /**
     * This is the main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = sc.nextInt();
        }
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}

