package week1.day2;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "madam";
		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // extracts each character
			temp = ch + temp;
		}
		System.out.println("Original Value :" + str);
		System.out.println("Reversed Value :" + temp);

		if (temp.equals(str)) {
			System.out.println("It is Palindrome ");
		} else {
			System.out.println("It is Not a Palindrome ");
		}
	}
}