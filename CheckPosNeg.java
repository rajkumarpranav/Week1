package week1.day2;

public class CheckPosNeg {

	public static void main(String[] args) {
		int num = -45;
		if (num < 0) {
			System.out.println(num + " = Number is Negative");
		} else if (num > 0) {
			System.out.println(num + " = Number is Positive");
		} else if (num == 0) {
			System.out.println(num + " = Number is Neither Positive nor Negative");
		}

	}

}
