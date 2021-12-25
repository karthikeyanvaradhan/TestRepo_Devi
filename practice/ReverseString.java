package practice;

public class ReverseString {

	public static void main(String[] args) {

		String letter = "Magic";
		String revletter="";
		
		int n = letter.length();
		for(int i=n-1;i>=0;i--) {
			revletter = revletter + letter.charAt(i);
		}
		System.out.println(revletter);
	}

}
