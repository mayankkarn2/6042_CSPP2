public class Swap {
	public static void main(String args[]) {
		int a = 5;
		int b = 4;
		System.out.println("Before swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}