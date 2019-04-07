/**
 * There is a list (type of integer) and of n length 
 * And that list is sorted  but if there is any number or sequence number 
 * which are breaking sequence then you have to calculate the number of values which are breaking sorting
 * 
 * Condition:-
 * First element of array will contain the total number of elements to be considered
 * 
 * Like:- array = [41232] here 4 is showing total number of elements to be considers and after first element you will have the inputs
 * 
 * So design a method which takes a array as input and return int value of count of numbers which are breaking sorting
 * 
 * Use case
 * Input :- 6123654
 * Here is 654 is not in sorting so output will be 3
 */

package competitive;

public class FindUnSortedElemsNo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 8, 3, 7, 3 };
		int count = 0;
		int breakIndex = -1;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (breakIndex < 0 && arr[i] > arr[i + 1]) {
				breakIndex = i + 1;
			} else if (breakIndex >= 0 && arr[breakIndex] > arr[i]) {
				System.out.println("break = " + breakIndex);
				breakIndex = i;
			}
		}
		if (breakIndex >= 0) {
			count = arr.length;
			for (int i = breakIndex; i > 0; i--) {
				if (arr[breakIndex] > arr[i - 1]) {
					count = arr.length - i - 1;
					break;
				} 
			}
		}
		System.out.println("here is the answer = " + count);
	}

}
