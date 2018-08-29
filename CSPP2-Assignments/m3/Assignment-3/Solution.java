
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1,n2));
    }
    public static int gcd(int n1,int n2) {
        int gcdVa = 1;
        for (int i = 2; i <= n2; i++) {
            if(n1%i == 0 && n2%i == 0) {
                gcdVa = i;
            }
        }
        return gcdVa;
    }
}
