import java.util.Scanner;
class Concatinate {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = s.nextLine();
		System.out.println("Hello ".concat(name) + "!");
	}
}