package soumya.unixtools.uniq;

import soumya.fileread.Readfile;
import java.io.IOException;

public class Uniq {
    public void printUniqLines(String text) {
        String[] lines = text.split("\n");
        int length = lines.length;
        for (int i = 0; i < length - 1; i++) {
            if (!(lines[i].equals(lines[i + 1])))
                System.out.println(lines[i]);
        }
        System.out.println(lines[length - 1]);
    }

    public static void main(String[] args) throws IOException {
        Readfile read = new Readfile();
        String fileContent = read.readFile(args[0]);
        Uniq uniq = new Uniq();
        uniq.printUniqLines(fileContent);
    }
}