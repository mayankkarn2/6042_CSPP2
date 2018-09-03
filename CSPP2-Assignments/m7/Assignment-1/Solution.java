import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    /**
     * Data is data from input
     * Length is length of String.
     */
    private String data;
    /**
     * Input data.
     */
    private int length;
    /**
     * Constructs the object for class.
     *
     * @param      input  The input String
     */
    InputValidator(final String input) {
        data = input;
        length = data.length();
    }
    /**
     * Returns true if string is >= 6
     * Else returns false.
     *
     * @return     true if length > 6, else false
     */
    public boolean validateData() {
        final int six = 6;
        if (length < six) {
            return false;
        }
        return true;
    }
}
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Class for solution.
     */
    /**
     * Constructor for Solution.
     */
    private Solution() {

    }
    /**
     * This is main method.
     * @param args this returns nothing
     */
    public static void main(final String[] args) {
        Scanner s =   new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}

