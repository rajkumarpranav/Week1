package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
