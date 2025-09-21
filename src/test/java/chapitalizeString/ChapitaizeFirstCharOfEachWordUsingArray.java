package chapitalizeString;

public class ChapitaizeFirstCharOfEachWordUsingArray {

	public static void main(String[] args) {
		String s = "my name is herry potter!";
		String[] words = s.split(" ");
		String newString = "";
		for (String word : words) {
			String firstChar = word.substring(0, 1).toUpperCase();
			String remChars = word.substring(1, word.length());
			String newWord = firstChar.concat(remChars);
			newString = newString + newWord + " ";
		}
		System.out.println(newString.trim());
	}
}
