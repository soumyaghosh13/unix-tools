package soumyagh.unixtools.lib;

public class WordCount {
    public int numOfLines = 0, numOfWords = 0, numOfChars = 0;
    public void wc(String data) {
        this.numOfLines = data.split("\\n").length;
        this.numOfWords = data.split("\\W").length;
        this.numOfChars = data.length();
    }
}