package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str = "feeling good";
		String strtemp ="";
		
		for (int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			strtemp = c+strtemp;
		}
		 System.out.println(strtemp);
	}

}
