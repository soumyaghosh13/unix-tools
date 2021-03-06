package soumyagh.unixtools.cli;

import soumyagh.unixtools.fs.ReadWrite;
import soumyagh.unixtools.lib.Uniq;

import java.io.IOException;

public class UniqMain {
    public static void main(String[] args) throws IOException {
        ReadWrite file = new ReadWrite();
        String text = "";
        try {
            text = file.read(args[0]);
        } catch (IOException ex){
            System.err.println("Unable To Process");
        }
        Uniq uniq = new Uniq();
        String result = uniq.getUniqLines(text);
        System.out.println(result);
    }
}
