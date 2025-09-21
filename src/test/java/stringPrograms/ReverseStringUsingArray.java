package stringPrograms;

public class ReverseStringUsingArray {

	// Reverse a string

	public static void main(String[] args) {
		String s = "malayalam";
		int l = s.length();
		String rev = "";

		for (int i = l - 1; i >= 0; i--) {
			char chr = s.charAt(i);
			rev = rev + chr;
		}
		System.out.println(rev);

	}

}
