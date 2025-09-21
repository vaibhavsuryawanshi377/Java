package stringPrograms;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) {
		String s = "my name is herry";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse().toString();
		System.out.println(sb);
	}

}
