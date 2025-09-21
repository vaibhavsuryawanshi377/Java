package stringPrograms;

public class ReverseEachWordUsingArray {
	public static void main(String args[]) {
		String s = "my name is herry poter";
		String[] words = s.split(" ");
		String revString = "";
		for (String word : words) {
			int l = word.length();
			String revWord = "";
			for (int i = l - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString.trim());
	}
}
