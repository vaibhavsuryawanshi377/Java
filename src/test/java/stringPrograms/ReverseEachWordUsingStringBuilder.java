package stringPrograms;

public class ReverseEachWordUsingStringBuilder {

	public static void main(String[] args) {
		String s = "my name is herry poter";
		String[] words = s.split(" ");
		String revString = "";
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			revString = revString + sb.toString() + " ";
		}
		System.out.println(revString);

	}

}
