import java.util.Scanner;
class degrees_to_fahrenheit {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int degrees = s.nextInt();
		double far = (1.8 * degrees) + 32;
		System.out.println(far);
	}
}