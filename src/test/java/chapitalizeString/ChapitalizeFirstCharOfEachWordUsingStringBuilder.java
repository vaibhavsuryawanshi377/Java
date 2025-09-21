package chapitalizeString;

public class ChapitalizeFirstCharOfEachWordUsingStringBuilder {

	public static void main(String[] args) {
		String s = "my name is herry potter!";
		String[] words = s.split(" ");
		StringBuilder newString = new StringBuilder();
		for (String word : words) {
			newString.append(word.substring(0, 1).toUpperCase()).append(word.substring(1, word.length())).append(" ")
					.toString();

		}

		System.out.println(newString);
	}

}
