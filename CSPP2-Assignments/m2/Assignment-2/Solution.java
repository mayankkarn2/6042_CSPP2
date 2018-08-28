import java.util.Scanner;
//import java.lang.Math;

public class Solution {
    /*
        This finds the roots of function
    */
    public static void rootsOfQuadraticEquation(final int a, final int b, final int c) {
    int dis = (b*b) - (4 * a * c);
    double rootOne = (-b + (Math.sqrt(dis)))/(2 * a);
    double rootTwo = (-b - (Math.sqrt(dis)))/(2 * a);
    System.out.print(rootOne + " " + rootTwo);
}
    public static void main(String[] args) {
        /*
            Do not modify this main function.
        */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}

