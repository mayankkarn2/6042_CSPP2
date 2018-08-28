import java.util.Scanner;

public class Solution {
	public static int power(int base,int exponent) {
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
        int result=power(base,exponent);
        System.out.println(result);
	}
}
