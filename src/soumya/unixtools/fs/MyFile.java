package soumya.unixtools.fs;

import java.io.*;
import java.util.Scanner;

public class MyFile {
  public String readFile(String fileName) throws IOException {
    String returnValue = "";
    String line = "";
    File file = new File(fileName);
    try {
        Scanner fileContent = new Scanner(file);
		while (fileContent.hasNextLine()) {
			line = fileContent.nextLine();
			returnValue += line + "\n";
		}
    }catch (FileNotFoundException e) {
		throw new RuntimeException("File not found");
    }
    return returnValue;
  }
    public void writeToFile(String fileName,String content){
        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            String[]  temp = content.split("\n");
            for(String line : temp)
                writer.println(line);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
