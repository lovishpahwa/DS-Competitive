/**
 * There is a array of integer having natural numbers from 1-100, 
 * this array is unsorted and the point is that there is a number which is coming twice in this array, 
 * So you have to find that one number which is duplicated in this array. For example:- [234649] -> o/p is 4
 */
package competitive;

public class FindDuplicate {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 5, 2, 3, 4, 6 };
		int[][] check = new int[arr.length][1];
		for (int i = 0; i < arr.length - 1; i++) {
			check[arr[i]][0]++;
			if (check[arr[i]][0] > 1) {
				System.out.println("repeated element = " + arr[i]);
			}
		}

	}

}
