import java.util.Scanner;
//import java.lang.Math;
/**
 * Class for solution.
 */
public class Solution {
    public static void rootsOfQuadraticEquation(final int a, final int b, final int c) {
    final int four = 4;
    int dis = (b * b) - (four * a * c);
    double rootOne = (-b + (Math.sqrt(dis))) / (2 * a);
    double rootTwo = (-b - (Math.sqrt(dis))) / (2 * a);
    System.out.print(rootOne + " " + rootTwo);
}
    public static void main(String[] args) {
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




