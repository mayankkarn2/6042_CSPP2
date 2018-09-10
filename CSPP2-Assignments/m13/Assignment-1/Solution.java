import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : Mayank Karn
 */
/**
 * Class for set.
 */
class Set {
    /**
     * set is array
     */
    public int[] set;
    public int size;
    public Set() {
    	final int ten = 10;
    	set = new int[ten];
    	size = 0;
    }
    /**
     * Constructs the object.
     *
     * @param      capacity  The capacity
     */
    public Set(final int capacity) {
    	size = 0;
    	set = new int[capacity];
    }
    /**
     * returns the size
     *
     * @return     size
     */
    public int size() {
    	return size;
    }
    /**
     * Resizes the array
     *
     * @param      item  The item
     */
    public void resize(final int item) {
        set = Arrays.copyOf(set, size * 2);
        set[size++] = item;
    }
    /**
     * add item to set
     *
     * @param      item  The item
     */
    public void add(final int item) {
        // System.out.println(item);
        int flag = 0;
        for(int i = 0; i < size; i++) {
            if(set[i] == item) {
                flag = 1;
            }
        }
        if(flag == 0) {
            // System.out.println("Hi");
            if(set.length > size-1) {
                // System.out.println("Hi");
                set[size++] = item;
                // System.out.println(size);
                // System.out.println(set[size-1]);
            }
            else {
                resize(item);
            }
        }
    }

    public int getIndex(int item) {
        // System.out.println(item);
        // for(int a: set) {
        //     System.out.println(a);
        // }
        for(int i = 0; i < size; i++) {
            if(set[i] == item) {
                return i;
            }
        }
        return -1;
    }
    /**
     * checks if present or not
     *
     * @param      item  The item
     *
     * @return     true or false
     */
    public boolean contains(int item) {
    	for (int i = 0; i < size; i++) {
    		if(set[i] == item) {
    			return true;
    		}
    	}
    	return false;
    }
    /**
     * Prints the set
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size == 0) {
            return "{}";
        }
        else {
            String str = "{";
            for (int i = 0; i < size; i++) {
                if(i == size-1) {
                    str = str + set[i];
                } else {
                    str = str + set[i] + ", ";
                }  
            }
            str = str + "}";
            return str;
        }
    }
    /**
     * Adds an array
     *
     * @param      items  The items
     */
    public void add(int[] items) {
        for (int i = 0; i < items.length; i++) {
            add(items[i]);
        }
    }
    /**
     * 
     *
     * @param      index  The index
     *
     * @return     { description_of_the_return_value }
     */
    public int get(final int index) {
        // Replace the code below to write the code for get
        if (index < 0 || index >= size) {
            return -1;
        } else {
            return set[index];
        }
    }
    public Set intersection(Set t) {
        Set ret = new Set();
        // System.out.println(this.toString());
        // System.out.println(this.size());
        for(int i = 0; i < this.size(); i++) {
            int search = this.get(i);
            // System.out.println(search);
            // System.out.println(search);
            for(int j = 0; j < t.size(); j++) {
                if(t.get(j)==(search)) {
                    ret.add(search);
                }
            }
        }
        return ret;
    }
    public Set retainAll(int[] items) {
        Set ret1 = new Set();
        String st = "";
        for(int i = 0; i < size; i++) {
            int search = set[i];
            for(int j = 0; j < items.length; j++) {
                if(search == items[j]) {
                    if(st.contains(Integer.toString(set[j]))) {

                    }
                    else {
                        ret1.add(search);
                        st = st + Integer.toString(set[j]);
                    }
                }
            }
        }
        return ret1;
    }
    public int[][] cartesianProduct(Set s) {
        // int length = s.size();
        // if(length == 0 || size == 0) {
        //     return null;
        // }
        // else {
        //     int rows = length * size;
        //     int col = 2;
        //     int[][] res = new int[rows][col];
        //     for(int i = 0; i < rows; i++) {
        //         int[] a = new int[2];
        //         for (int j = 0; j < size; j++) {
        //             for(int k = 0; k < s.size(); k++) {
        //                 a[0] = set[j];
        //                 a[1] = s.get(k);
        //             }
        //         }
        //     }
        //     res[i] = a;
        //     return res;
        // }
        int [][] result = new int[this.size() * s.size()][2];
        int k = -1;
        if (this.size() == 0 || s.size() == 0) {
            return null;
        }
        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < s.size(); j++) {
                result[++k][0] = this.get(i);
                result[k][1] = s.get(j);
            }
        }
        return result;
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
