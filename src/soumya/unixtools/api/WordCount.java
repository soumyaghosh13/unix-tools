package soumya.unixtools.api;


public class WordCount{
	public int lineCount(String text) {
		String[] lines = text.split("\n");
		return lines.length;
	}

	public int wordCount(String text) {
		String[] words = text.split("\\s");
		return words.length;
	}

	public int charCount(String text) {
		String[] characters = text.split("");
		return characters.length-1;
	}
}
