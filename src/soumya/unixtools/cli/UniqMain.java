package soumya.unixtools.cli;

import soumya.unixtools.fs.MyFile;
import soumya.unixtools.api.Uniq;

import java.io.IOException;

public class UniqMain {
    public static void main(String[] args) {
        String text;
        try {
            text = new MyFile().readFile(args[0]);
            System.out.println(new Uniq().getUniqueLines(text));
        } catch (IOException e) {
            System.err.println("Something went wrong");
        }
    }
}