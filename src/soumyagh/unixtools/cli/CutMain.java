package kashishm.unixtools.cli;

import kashishm.unixtools.lib.CLIParser;
import kashishm.unixtools.fs.ReadWrite;
import kashishm.unixtools.lib.Cut;

import java.io.IOException;
import java.util.Map;


public class CutMain {
    public static void main(String[] args) {
        int[] fieldNumbers = new int[0];
        String[] fields;
        String text = null;
        Map<String, String> input = null;
        try {
            input = new CLIParser().getCLIArgs(args);
            String delimiter = input.get("d");
            fields = input.get("f").split(",");
            String files = input.get("files");
            fieldNumbers = new int[fields.length];
            for (int i = 0; i < fields.length; i++) {
                fieldNumbers[i] = Integer.parseInt(fields[i]);
            }
            text = new ReadWrite().read(files);
            System.out.println(new Cut().cutLines(text, fieldNumbers, delimiter));
        } catch (NullPointerException ex) {
            if (!input.containsKey("d"))
                System.out.println(new Cut().cutLines(text, fieldNumbers, " "));
            else System.out.println("Don't angry me Give proper arguments");
        } catch (IOException e) {
            System.err.println("Give correct file name.");
        } catch (Exception ex) {
            System.out.println("Something went wrong");
        }
    }
}