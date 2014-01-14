package soumya.unixtools.cli;

import soumya.unixtools.fs.MyFile;
import soumya.unixtools.api.Head;

import java.io.IOException;

public class HeadMain{
    public static void  main(String args[])throws IOException {
        MyFile myFile = new MyFile();
        Head ob = new Head();
        String lines;

        String input = myFile.readFile(args[0]);
        if (args.length<2) {
            lines = ob.getLines(input);
        }
        else {
            int noOfLines = Integer.parseInt(args[1].substring(1));
            lines =  ob.getLines(input,noOfLines);
        }
            System.out.println(lines);
    }
}

