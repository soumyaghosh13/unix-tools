package soumyagh.unixtools.cli;
import soumyagh.unixtools.fs.ReadWrite;
import soumyagh.unixtools.lib.WordCount;

import java.io.IOException;

public class WcMain {
    public static void main(String[] args) throws IOException {
        ReadWrite file = new ReadWrite();
        String text = "";
        try {
            text = file.read(args[0]);
            WordCount count = new WordCount();
            count.wc(text);
            System.out.println(count.numOfLines + "\t" + count.numOfWords + "\t" + count.numOfChars + "\t" + args[0]);
        } catch (IOException ex){
            System.err.println("Unable To Process");
        }
    }
}