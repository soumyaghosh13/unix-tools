package soumya.unixtools;


import org.apache.commons.lang.StringUtils;
import soumya.fileread.readfile;
import java.io.IOException;


public class TrimSpace {
    public void trimSpace(String text){
        String formtattedText;
        formtattedText = text.replaceAll("\\ +"," ");
        System.out.println(formtattedText);
    }


    public static void main(String[] args) throws IOException {
        readfile read = new readfile();
        String fileText = read.readFile(args[0]);
        TrimSpace trim = new TrimSpace();
        trim.trimSpace(fileText);
    }
}

