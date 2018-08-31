
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
	Do not modify this main function.
	*/
	public static String binaryToDecimal(String s) {
		// char[] num = s.toCharArray();
		// System.out.println(num[0]);
		// System.out.println(num[1]);
		// System.out.println(num[2]);
		// System.out.println(num[3]);
		double sum = 0;
		for (int i = 0; i < s.length() ; i++) {
			char c = s.charAt(i);
			int numAti = Character.getNumericValue(c);
			sum = sum + numAti * Math.pow(2,(s.length()-1)-i );
		}
		int temp = (int) sum;
		String res = Integer.toString(temp);
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			String s=sc.nextLine();
			String res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}

}
