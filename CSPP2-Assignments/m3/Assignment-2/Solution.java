
import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
/**
 * { function_description }
 *
 * @param      args  The arguments
 */
/**
 * { item_description }.
 */
    private Solution() {
        //Nothing happens here.
    }
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);  
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String number = Integer.toString(i);
            boolean isFound = number.contains("7");
            if (isFound == true) {
                char[] num_arr = number.toCharArray();
                int count7 = 0;
                for (char num : num_arr) {
                    if(num == '7') {
                        count7 += 1;
                    }
                }
                count += count7;
            }
       
        }
        System.out.println(count);
        
    }
}