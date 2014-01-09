package soumya.unixtools;

import soumya.fileread.readfile;
import java.io.IOException;

public class Uniq {
    public void printUniqLines(String text){
        String[] lines = text.split("\n");
        int length = lines.length;
        for (int i = 0; i <length-1 ; i++) {
            if( !( lines[i].equals(lines[i+1] ))  )
                System.out.println(lines[i]);
        }
        System.out.println(lines[length-1]);
    }

    public static void main(String[] args) throws IOException {
        readfile read = new readfile();
        String fileContent = read.readFile(args[0]);

        Uniq u1 = new Uniq();
        u1.printUniqLines(fileContent);
    }
}