package soumya.unixtools.api;

import java.util.Arrays;

public class Sort {
    public String getSortedData(String text) {
        StringBuilder result = new StringBuilder("");
        String lines[] = text.split("\n");
        Arrays.sort(lines);
//        Collections.reverse(Arrays.asList(lines));
        for (String line : lines) {
            result.append(line).append("\n");
        }
        return result.toString();
    }

}