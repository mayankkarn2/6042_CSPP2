import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : Mayank Karn
 */
class Set {
    
    private int[] set;
    private int size;
    public Set() {
    	final int ten = 10;
    	set = new int[ten];
    	size = 0;
    }
    public Set(final int capacity) {
    	size = 0;
    	set = new int[capacity];
    }
    public int size() {
    	return size;
    }
    public void resize(final int item) {
        set = Arrays.copyOf(set, size * 2);
        set[size++] = item;
    }
    public void add(final int item) {
    	if(size < set.length) {
    		for(int i = 0; i < size; i++) {
    			if(set[i] == item) {

    			}
    			else {
    				set[size] = item;
                    size++;
    			}
    		}
    	}
    	else {
    		resize(item);
    	}
    }
    public boolean contains(int item) {
    	for (int i = 0; i < size; i++) {
    		if(set[i] == item) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public String toString() {
        if (size == 0) {
            return "{ }";
        }
        else {
            String str = "{";
            for (int i = 0; i < size -1; i++) {
                str = str + set[i] + ", ";   
            }
            str = str + "}";
            return str;
        }
    }
    public void add(int[] items) {
        for (int i = 0; i < items.length; i++) {
            int search = items[i];
            for (int j = 0; j < size; j++) {
                if(set[j] == search) {

                }
                else {
                    add(search);
                }
            }
        }
    }
    public int get(final int index) {
        // Replace the code below to write the code for get
        if (index < 0 || index >= size) {
            return -1;
        } else {
            return set[index];
        }
    }
    public Set intersection(Set s) {
        Set ret = new Set();
        for(int i = 0; i < size; i++) {
            if(!(s.contains(set[i]))){
                ret.add(set[i]);
            }
        }
        return ret;
    }
    public Set retainAll(int[] items) {
        Set ret1 = new Set();
        String st = "";
        for(int i = 0; i < items.length; i++) {
            int search = items[i];
            for(int j = 0; j < size; j++) {
                if(search == set[i]) {
                    if(st.contains(Integer.toString(set[i]))) {

                    }
                    else {
                        ret1.add(set[i]);
                        st = st + Integer.toString(set[i]);
                    }
                }
            }
        }
        return ret1;
    }
    public int[][] cartesianProduct(Set s) {
        int length = s.size();
        if(length == 0 || size == 0) {
            return null;
        }
        else {
            int rows = length * size;
            int col = 2;
            int[][] res = new int[rows][col];
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < col; j++) {
                    String str_set = Integer.toString(set[j]);
                    String str_s = Integer.toString(s.get(j));
                    res[i][j] = Integer.parseInt(str_set + str_s);
                }
            }
            return res;
        }
    }
}
/**
 * Solution class for code-eval.
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
        Set s = new Set();
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
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
