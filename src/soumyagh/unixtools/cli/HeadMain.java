package soumyagh.unixtools.cli;

import soumyagh.unixtools.lib.CLIParser;
import soumyagh.unixtools.fs.ReadWrite;
import soumyagh.unixtools.lib.Head;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Map;

public class HeadMain {
    public static void main(String[] args) {
        String text = null;
        try {
            Map<String,String> input = new CLIParser().getCLIArgs(args);
            text = new ReadWrite().read(input.get("files"));
            System.out.println(new Head().getLines(text, Integer.parseInt(input.get("n"))));
        } catch (NumberFormatException ex) {
            System.out.println(new Head().getLines(text, 10));
        } catch (NullPointerException ex) {
            System.out.println(new Head().getLines(text, 10));
        } catch (IOException e) {
            System.err.println("File not present.");
        } catch (Exception e) {
            System.err.println("Sorry,Something went wrong. Please try again");
        }
    }
}