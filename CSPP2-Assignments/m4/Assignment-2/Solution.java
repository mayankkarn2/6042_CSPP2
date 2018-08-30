import java.util.Scanner;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows of 1st Matrix");
		int rowsOne = s.nextInt();
		System.out.println("Enter Columns of 2nd Matrix");
		int colOne = s.nextInt();
		System.out.println("Enter rows of 1st Matrix");
		int rowsTwo = s.nextInt();
		System.out.println("Enter Columns of 2nd Matrix");
		int colTwo = s.nextInt();
		if (rowsOne == rowsTwo && colOne == colTwo) {
			int[][] mat1 = new int[rowsOne][colOne];
			int[][] mat2 = new int[rowsTwo][colTwo];
			int[][] mat3 = new int[rowsOne][colTwo];
			for (int i = 0; i < rowsOne; i++) {
				for(int j = 0; j < colOne; j++){
					mat1[rowsOne][colOne] = s.nextInt();
				}
			}
			for (int i = 0; i < rowsTwo; i++) {
				for(int j = 0; j < colTwo; j++){
					mat2[rowsTwo][colTwo] = s.nextInt();
				}
			}
			for (int i = 0; i < rowsOne; i++) {
				for(int j = 0; j < colOne; j++){
					mat3[rowsOne][colOne] = mat1[rowsOne][colOne] + mat3[rowsTwo][colTwo];
				}
			}
			for (int i = 0; i < rowsOne; i++) {
				for(int j = 0; j < colOne; j++){
					System.out.print(mat3[rowsOne][colOne]);
				}
				System.out.println();
			}
		}
	}
}