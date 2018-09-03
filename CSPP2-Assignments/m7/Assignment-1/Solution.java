import java.util.*;
class InputValidator
{
	private String data;
	private int length;
	/*Write the atrributes and methods for InputValidator*/
	public InputValidator(String input) {
		data = input;
		length = data.length();
	}
	public boolean validateData() {
		int six = 6;
		if(length < six) {
			return false;
		}
		return true;
	}
}
public class Solution
{
	public static void main(String args[])
    {
    	Scanner s =   new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);    	
    	System.out.println(i.validateData());

    }

}
