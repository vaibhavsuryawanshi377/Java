package stringPrograms;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		String s = "my name is herry";
		StringBuilder sb = new StringBuilder(s);
		StringBuilder rev = sb.reverse();
		String reverse = rev.toString();
		System.out.println(reverse);

	}

}
