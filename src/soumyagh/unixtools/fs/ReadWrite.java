package kashishm.unixtools.fs;

import java.io.*;

public class ReadWrite {
    StringBuilder text = new StringBuilder("");
    String line;
    public String read(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while ((line = br.readLine()) != null)
            text.append(line).append("\n");
        return text.toString().trim();
    }

    public int write(String fileName, String content) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
        return 0;

    }
}

