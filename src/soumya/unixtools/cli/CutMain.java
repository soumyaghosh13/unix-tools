package soumya.unixtools.cli;

import soumya.unixtools.api.Cut;
import soumya.unixtools.fs.MyFile;

import java.io.IOException;

public class CutMain {
    public static void main(String[] args) throws IOException {
        CutMain obj = new CutMain();
        MyFile myfile = new MyFile();
        Cut cut = new Cut();

        String properArgs[] = obj.getProperArgs(args);

        String fileData = myfile.readFile(properArgs[0]);
        int fieldNo = Integer.parseInt(properArgs[1].substring(2));
        String delimiter = properArgs[2].substring(3,4);

        String desiredFieldData = cut.getFieldData(fileData, fieldNo, delimiter);
        System.out.println(desiredFieldData);
    }

    String[] getProperArgs(String[] args){
        String options[] = new String[3];

        for(int i = 0; i<args.length; i++){
            if(!CutMain.isFileName(args[i])) {
                options[0] = args[i];
            }
            if(CutMain.isfieldNo(args[i])) {
                options[1] = args[i];
            }
            if(CutMain.isDelimiter(args[i])) {
                options[2] = args[i];
            }
        }

        return options;
    }
    static boolean isDelimiter(String arg){
        return arg.matches("-d.*");
    }
    static boolean isfieldNo(String arg){
        return arg.matches("-f.*");
    }
    static boolean isFileName(String arg){
        return arg.matches("-.*");
    }
}

