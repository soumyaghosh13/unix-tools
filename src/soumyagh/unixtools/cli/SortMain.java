package kashishm.unixtools.cli;

import kashishm.unixtools.lib.CLIParser;
import kashishm.unixtools.fs.ReadWrite;
import kashishm.unixtools.lib.Sort;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class SortMain {
    public static void main(String[] args) throws IOException {
        ReadWrite file = new ReadWrite();
        String text = "";
        Sort ob = new Sort();
        String result = null;
        Map<String, String> input = null;
        try {
            input = new CLIParser().getCLIArgs(args);
            text = file.read(args[0]);
            if (input.containsKey("r"))
                result = ob.reverseLines(text);
            else
                result = ob.sortLines(text);
            System.out.println(result);
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        } catch (IOException ex){
            System.err.println("Unable To Process");
        }
    }
}