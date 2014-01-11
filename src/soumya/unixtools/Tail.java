package soumya.unixtools;

import soumya.fileread.readfile;
import soumya.fileread.readfile;

import java.io.IOException;

public class Tail {
    public void printLinesFromEnd(String text, int noOfLines) {
        String[] lines = text.split("\n");
        int noOfLinesInFile = lines.length;

        for (int i = noOfLinesInFile - noOfLines; i < noOfLinesInFile; i++) {
            System.out.println(lines[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        Tail tail = new Tail();

        readfile read = new readfile();
        String text = read.readFile(args[0]);

        try {
            int noOfLines = Integer.parseInt(args[1]);
            tail.printLinesFromEnd(text, noOfLines);
            System.exit(0);
        } catch (Exception ignored) {
        }
        int noOfLines = 10;
        tail.printLinesFromEnd(text, noOfLines);
    }
}