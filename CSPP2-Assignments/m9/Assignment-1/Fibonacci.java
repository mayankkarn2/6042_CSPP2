import java.util.Scanner;

/*
 * In the previous module you have created List ADT.
 * ADTs are developed as reusable libraries
 * i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT
 * The client typically instantiates an object of the ADT
 * and invokes the public methods on the ADT object.
 *
 * This assignment is to practice the idea of client to the ADT.
 * Client class is Fibonacci and the client needs to use the List ADT
 * to store fibonacci numbers in the List ADT.
 * So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list
 * by invoking the add method provided in the List ADT.
 *
 */
/**
 * Class for creating Fibonacci numbers.
 */
final class Fibonacci {
    /**
     * Constructs the object of Fibonacci.
     */
    private Fibonacci() {
        /**
         * Nothing happens here
         */

    }
    /*
     * fib is a static method takes a argument n
     * n is the count of the fibonacci numbers to be generated.
     * The method returns a List with the n fibonacci numbers.
     *
     * Look for the hint.txt if some of the testcases fail.
     */
    /**
     * Returns the list of Fibonacci Numbers.
     *
     * @param      n     the value upto which we want Numbers
     *
     * @return          Returns the list of Fibonacci Numbers
     */
    public static List fib(final int n) {
        // todo - complete this method
        List l = new List(n);
        // index = l.size();
        l.add(0);
        l.add(1);
        for (int i = 1; i <= n - 2; i++) {
            int index = l.size();
            int third = l.get(index - 1) + l.get(index - 2);
            l.add(third);
        }
        return l;
    }
    /**
     * This is the main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}
