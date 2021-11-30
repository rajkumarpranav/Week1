package week1.day1;

//8 output: 0, 1, 1, 2, 3, 5, 8, 13
public class FibonacciSeries {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 1; i < 7; i++) {
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;

		}
	}
}
