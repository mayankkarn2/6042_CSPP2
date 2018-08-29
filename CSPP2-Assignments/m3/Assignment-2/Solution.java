
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

	    Scanner s=new Scanner(System.in);      
	    int n = s.nextInt();
	    int count = 0;
	    for(int i = 1; i <= n; i++) {
	    	String number = Integer.toString(i);
	    	// System.out.println(number);
	    	boolean isFound = number.contains("7");
	    	// System.out.println(isFound);
	    	// System.out.println("-----------------");
	    	if(isFound == true) {
	    		char[] numb = number.toCharArray();
	    		int count7 = 0;
	    		for(char num : numb) {
	    			if(num == '7') {
	    				count7 += 1;
	    			}
	    		}
	    		count += count7;
	    	}
	   
	    }
	    System.out.println(count);
        
    }
}