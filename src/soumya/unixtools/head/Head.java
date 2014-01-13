package soumya.unixtools.head;

import soumya.fileread.Readfile;

import java.io.IOException;

public class Head {
    public void printLines(String text, int noOfLines) {
        String[] lines = text.split("\n");
        for (int i = 0; i < noOfLines; i++) {
            System.out.println(lines[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        Head head = new Head();
        Readfile read = new Readfile();
        String text = read.readFile(args[0]);

        try {
            int noOfLines = Integer.parseInt(args[1]);
            head.printLines(text, noOfLines);
            System.exit(0);
        } catch (Exception ignored) {
        }
        int noOfLines = 10;
        head.printLines(text, noOfLines);
    }
}