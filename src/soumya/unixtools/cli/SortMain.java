package soumya.unixtools.cli;


import soumya.unixtools.fs.;
import soumya.unixtools.api.Sort;

import java.io.IOException;

public class SortMain {
    public static void main(String[] args) {
        try {
            String text = new MyFile ().readFile(args[0]);
            System.out.println(new Sort().getSortedData(text));
        } catch (IOException e) {
            System.err.println("Sorry Something went wrong");
        }

    }
}