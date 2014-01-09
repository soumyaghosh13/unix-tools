package soumya.fileread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by soumyagh on 1/9/14.
 */
public class readfile {
    public String readFile(String fileName) throws IOException {
        String returnValue = "";
        File file = new File(fileName);
        String line = "";
        try {
            Scanner fileContent = new Scanner(file);
            while (fileContent.hasNextLine()) {
                line = fileContent.nextLine();
                returnValue += line + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return returnValue;
    }
}
