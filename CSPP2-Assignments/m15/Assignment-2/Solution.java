import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Exception for signaling invalid sub selection errors.
 */
class InvalidSubSelectionException extends Exception {
    /**
     * Constructs the object.
     *
     * @param      s     message
     */
    InvalidSubSelectionException(final String s) {
        super(s);
    }
}
/**
 * Exception for signaling emptyset errors.
 */
class EmptysetException extends Exception {
    /**
     * Constructs the object.
     *
     * @param      s     message
     */
    EmptysetException(final String s) {
        super(s);
    }
}
/**
 * Class for sorted set.
 */
class SortedSet extends Set {
    /**
     * sort function.
     *
     * @param      array  The array
     */
    public void sort(final int[] array) {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    /**
     * add function.
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (!contains(item)) {
            set[size++] = item;
        }
        sort(set);
    }
    /**
     * subset of the set from start to end element.
     *
     * @param      start                         The start
     * @param      end                           The end
     *
     * @return     returns int[] subset
     *
     * @throws     InvalidSubSelectionException  throws Exception
     */
    public int[] subSet(final int start, final int end) throws
    InvalidSubSelectionException {
        //System.out.println("hi");
        if (start > end) {
            //System.out.println("hi");
            throw new InvalidSubSelectionException(
                "Invalid Arguments to Subset Exception");
        }
        // System.out.println("hi");
        int[] result = new int[size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] >= start) {
                for (int j = i; j < size; j++) {
                    if (set[j] < end) {
                        result[k++] = set[i];
                    }
                    break;
                }
            }
        }
        return Arrays.copyOf(result, k);
    }
    /**
     * Gives a head less than element.
     *
     * @param      end                The end
     *
     * @return     returns int[] set
     *
     * @throws     EmptysetException  throws Exception
     */
    public int[] headSet(final int end) throws EmptysetException {
        int[] result = new int[size];
        int temp = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] < end) {
                result[i] = set[i];
                temp++;
            }
        }
        if (temp == 0) {
            throw new EmptysetException("Set Empty Exception");
        }
        return Arrays.copyOf(result, temp);
    }
    /**
     * Gives the last element in Set.
     *
     * @return     an integer
     *
     * @throws     EmptysetException  throws Exception
     */
    public int last() throws EmptysetException {
        if (size == 0) {
            throw new EmptysetException("Set Empty Exception");
        }
        return set[size - 1];
    }
    /**
     * Adds all.
     *
     * @param      element  The element
     */
    public void addAll(final int[] element) {
        for (int i : element) {
            this.add(i);
        }
    }
}
/**
 * Solution class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
               .mapToInt(Integer::parseInt)
               .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        SortedSet s = new SortedSet();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "size":
                System.out.println(s.size());
                break;
            case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                System.out.println(s);
                break;
            case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
            case "intersection":
                s = new SortedSet();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
            case "retainAll":
                s = new SortedSet();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
            case "cartesianProduct":
                s = new SortedSet();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
            case "subSet":
                if (tokens.length != 2) {
                    break;
                }
                int flag = 0;
                String[] arrstring3 = tokens[1].split(",");
                final int ten = 10;
                int[] object = new int[ten];
                try {
                    object = s.subSet(Integer.parseInt(arrstring3[0]),
                                    Integer.parseInt(arrstring3[1]));
                } catch (InvalidSubSelectionException e) {
                    System.out.println(e.getMessage());
                    flag = 1;
                }
                if (flag == 0) {
                    System.out.println(Arrays.toString(object).replace("[",
                        "{").replace("]", "}"));
                }
                break;
            case "headSet":
                if (tokens.length != 2) {
                    break;
                }
                int flag1 = 0;
                final int ten1 = 10;
                int[] obj = new int[ten1];
                try {
                    obj = s.headSet(Integer.parseInt(tokens[1]));
                } catch (EmptysetException e) {
                    System.out.println(e.getMessage());
                    flag1 = 1;
                }
                if (flag1 == 0) {
                    System.out.println(Arrays.toString(obj).replace("[",
                        "{").replace("]", "}"));
                }
                break;
            case "last":
                int flag2 = 0;
                if (tokens.length != 1) {
                    break;
                }
                int temp = 0;
                try {
                    temp = s.last();
                } catch (EmptysetException e) {
                    System.out.println(e.getMessage());
                    flag2 = 1;
                }
                if (flag2 == 0) {
                    System.out.println(temp);
                }
                break;
            case "addAll":
                int[] intArr = intArray(tokens[1]);
                if (intArr.length == 1) {
                    s.add(intArr[0]);
                } else {
                    s.add(intArr);
                }
                break;
            default:
                break;
            }
        }
    }
}





