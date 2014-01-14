package soumya.unixtools.cli;

import soumya.unixtools.api.Tail;
import soumya.unixtools.fs.MyFile;

import java.io.IOException;

public class TailMain{
    public static void  main(String args[])throws IOException{
        MyFile myFile = new MyFile();
        Tail ob = new Tail();
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

