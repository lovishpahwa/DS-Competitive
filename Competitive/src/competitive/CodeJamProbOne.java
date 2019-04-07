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
