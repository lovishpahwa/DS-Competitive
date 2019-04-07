/**
 * Problem
 *Someone just won the Code Jam lottery, and we owe them N jamcoins! However, when we tried to print out an oversized check, we encountered a problem. The value of N, which is an integer, includes at least one digit that is a 4... and the 4 key on the keyboard of our oversized check printer is broken.

 *Fortunately, we have a workaround: we will send our winner two checks for positive integer amounts A and B, such that neither A nor B contains any digit that is a 4, and A + B = N. Please help us find any pair of values A and B that satisfy these conditions.

 *Input
 *The first line of the input gives the number of test cases, T. T test cases follow; each consists of one line with an integer N.

 *Output
 *For each test case, output one line containing Case #x: A B, where x is the test case number (starting from 1), and A and B are positive integers as described above.

 *It is guaranteed that at least one solution exists. If there are multiple solutions, you may output any one of them. (See "What if a test case has multiple correct solutions?" in the Competing section of the FAQ. This information about multiple solutions will not be explicitly stated in the remainder of the 2019 contest.)

 *Limits
 *1 <= T <= 100.
 *Time limit: 10 seconds per test set.
 *Memory limit: 1GB.
 *At least one of the digits of N is a 4.

 *Test set 1 (Visible)
 *1 < N < 10 power 5.

 *Test set 2 (Visible)
 *1 < N < 10 power 9.

 *Solving the first two test sets for this problem should get you a long way toward advancing. The third test set is worth only 1 extra point, for extra fun and bragging rights!

 *Test set 3 (Hidden)
 *1 < N < power 100.

 *Sample

 *Input 
 	
 *Output 
 
 *3
 *4
 *940
 *4444

  
 *Case #1: 2 2
 *Case #2: 852 88
 *Case #3: 667 3777

  
 *In Sample Case #1, notice that A and B can be the same. The only other possible answers are 1 3 and 3 1.
 */
package competitive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeJamProbOne {

	public static void main(String[] args) {
		List<Long> N_List = new ArrayList<Long>();
		Scanner sc = new Scanner(System.in);
		Long noOfTestCases = sc.nextLong();
		for (Long i = 0L; i < noOfTestCases; i++) {
			Long input = sc.nextLong();
			if (input >= 0) {
				N_List.add(input);
			} else {
				N_List.add(0L);
			}
		}
		sc.close();
		Long a = 0L, b = 0L;
		for (int i = 0; i < noOfTestCases; i++) {
			if(N_List.get(i) > 0) {
				a = N_List.get(i) - 1;
				b = 1L;
			}
			Long[] result = adjust(a, b);
			System.out.println("Case #"+(i+1)+": " + result[0] + " " + result[1]);
		}
		System.exit(0);
	}

	private static Long[] adjust(Long x, Long y) {
		String xStr = String.valueOf(x);
		int indexForX = xStr.indexOf("4");
		Long[] result = { x, y };
		if (indexForX >= 0) {
			Double offset = Math.pow(10, xStr.length() - indexForX - 1);
			x = x - offset.longValue();
			y = y + offset.longValue();
		}
		String yStr = String.valueOf(y);
		int indexForY = yStr.indexOf("4");
		if (indexForY >= 0) {
			Double offset = Math.pow(10, xStr.length() - indexForY - 1);
			x = x + offset.longValue();
			y = y - offset.longValue();
		}
		if (indexForX >= 0 || indexForY >= 0) {
			return adjust(x, y);
		} else {
			result[0] = x;
			result[1] = y;
			return result;
		}
	}
}
