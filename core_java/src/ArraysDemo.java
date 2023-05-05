public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] ar = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		for (int i : ar) {
			System.out.println(i);
		}
		
		int[][] jag = { {1,2}, {3,4,5}, {6,7,8,9} };
		// Print elements row-wise
		for (int[] row : jag) {
			for (int n : row) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
		
		int[] sort = {3, 5, 2, 1, 4};
		// Sort and print with logic
		
	}
}
