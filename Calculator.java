package week1.day2;

public class Calculator {
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int sub(int a, int b) {
		int sum = a - b;
		return sum;
	}

	public int mul(int a, int b) {
		int sum = a * b;
		return sum;
	}

	public int div(int a, int b) {
		int sum = a / b;
		return sum;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(10, 10));
		System.out.println(calc.sub(10, 10));
		System.out.println(calc.mul(10, 10));
		System.out.println(calc.div(10, 10));
	}
}
