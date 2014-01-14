package soumya.unixtools.cli;

import soumya.unixtools.api.WordCount;
import soumya.unixtools.fs.MyFile;

import java.io.IOException;

public class WordCountMain{
	public static void main(String[] args) throws IOException {
	MyFile myFile = new MyFile();
	WordCount count = new WordCount();

    String input = myFile.readFile(args[0]);

    int noOfLines = count.lineCount(input);
    int noOfCharacter = count.charCount(input);
    int noOfWords = count.wordCount(input);

    System.out.println(noOfLines +" "+noOfWords+" "+noOfCharacter+" "+ args[0]);
	}
}

