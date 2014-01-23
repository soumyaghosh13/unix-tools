package kashishm.unixtools.lib;

import java.util.Arrays;
import java.util.Collections;

public class Sort  {
    String[] text;
    private String[] doSorting (String data) {
        text = data.split("\n");
        Arrays.sort(text);
        return text;
    }

    public String sortLines (String data) {
        return this.getString(this.doSorting(data));
    }

    public String reverseLines (String data) {
        Collections.reverse(Arrays.asList(this.doSorting(data)));
        return this.getString(text);
    }

    private String getString(String[] text){
        StringBuilder result = new StringBuilder("");
        for (String s : text) {
            result.append(s).append("\n");
        }
        return result.toString();
    }

}
