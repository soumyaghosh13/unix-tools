package soumya.unixtools.sort;


import soumya.fileread.Readfile;


import java.io.IOException;
import java.util.Arrays;


public class Sort {
    public static void main(String[] args) throws IOException {
        Readfile read = new Readfile();
        String text = read.readFile(args[0]);
        String[] splitContent = text.split("\n");


        Arrays.sort(splitContent);
        System.out.println("\n\n");
        for (int i = 0; i < splitContent.length; i++) {
            System.out.println(splitContent[i]);
        }


    }
}

