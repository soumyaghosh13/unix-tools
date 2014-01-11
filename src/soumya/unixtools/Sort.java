package soumya.unixtools;

import sun.misc.Sort;
import soumya.fileread.readfile;

import java.io.IOException;
import java.util.Arrays;

class Sorter {
    public void Sorted(String fileName,String[] args) {
        readfile fs = new readfile();
        String fileContent = null;
        try {
            fileContent = fs.readFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] lines = fileContent.split("\n");
        Arrays.sort(lines);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
