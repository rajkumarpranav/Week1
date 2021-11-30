package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int calculated = 0;
		int remainder;
		int original;
		while (input > 0) {
			remainder = input % 10;
			original = remainder * remainder * remainder;
			calculated = calculated + original;
			input = input / 10;
		}
		System.out.println(calculated);

	}

}
