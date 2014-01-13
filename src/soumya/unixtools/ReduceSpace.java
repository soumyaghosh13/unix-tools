package soumya.unixtools;

import soumya.fileread.Readfile;

import java.io.IOException;


public class ReduceSpace {
    public void trimSpace(String text) {
        String formtattedText;
        formtattedText = text.replaceAll("\\ +", " ");
        System.out.println(formtattedText);
    }


    public static void main(String[] args) throws IOException {
        Readfile read = new Readfile();
        String fileText = read.readFile(args[0]);
        ReduceSpace trim = new ReduceSpace();
        trim.trimSpace(fileText);
    }
}

