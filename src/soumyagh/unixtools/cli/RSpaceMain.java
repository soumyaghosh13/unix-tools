package kashishm.unixtools.cli;

import kashishm.unixtools.fs.ReadWrite;
import kashishm.unixtools.lib.ReduceSpace;

import java.io.IOException;

public class RSpaceMain {
    public static void main(String[] args) throws IOException {
        ReadWrite file = new ReadWrite();
        String text = "";
        try {
            text = file.read(args[0]);
            ReduceSpace rs = new ReduceSpace();
            String result = rs.removeSpaces(text);
            file.write(args[0],result);
        } catch (IOException ex){
            System.err.println("Unable To Process");
        }
    }
}
