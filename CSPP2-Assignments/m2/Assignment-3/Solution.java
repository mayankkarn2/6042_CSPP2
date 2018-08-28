import java.util.Scanner;

public class Solution {
	public static long power(int base,int exponent) {
		if(exponent==0) {
			return 1;
		}
		if(exponent == 1) {
			return base;
		}
		else {
			return base * power(base,exponent-1);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result=power(base,exponent);
        System.out.println(result);
	}
}
