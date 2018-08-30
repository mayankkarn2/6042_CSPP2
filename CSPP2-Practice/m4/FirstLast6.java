import java.util.Scanner;
class FirstLast6 {
	public static boolean check(int arr[], int size) {
		if (arr[0] == 6 || arr[size-1] == 6) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of inputs");
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element");
			arr[i] = s.nextInt();
		}
		boolean ret = check(arr,size);
		System.out.println(ret);	
	}
}