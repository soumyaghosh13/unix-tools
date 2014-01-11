package soumya.unixtools;

import soumya.fileread.readfile;
import java.io.IOException;


public class ReduceSpace {
    public void trimSpace(String text){
        String formtattedText;
        formtattedText = text.replaceAll("\\ +"," ");
        System.out.println(formtattedText);
    }


    public static void main(String[] args) throws IOException {
        readfile read = new readfile();
        String fileText = read.readFile(args[0]);
        ReduceSpace trim = new ReduceSpace();
        trim.trimSpace(fileText);
    }
}

