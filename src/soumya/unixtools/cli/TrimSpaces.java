package soumya.unixtools.cli;

import soumya.unixtools.api.ReduceSpaces;
import soumya.unixtools.fs.MyFile;

import java.io.IOException;

public class TrimSpaces {
    public static void main(String[] args) throws IOException {
        MyFile myFile = new MyFile();
        ReduceSpaces rs = new ReduceSpaces();

        String fileName = args[0];

        String fileContent = myFile.readFile(fileName);
        String modifiedText = rs.trimSpace(fileContent);

        myFile.writeToFile(fileName,modifiedText);
    }
}

