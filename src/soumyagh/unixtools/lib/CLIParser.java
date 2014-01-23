package soumyagh.unixtools.lib;

import java.util.HashMap;
import java.util.Map;

public class CLIParser {
    public Map getCLIArgs(String[] args) {
        StringBuilder files = new StringBuilder("");
        Map<String, String> numbers
                = new HashMap<String, String>();
        for (String option : args) {
            if (!option.startsWith("-")) {
                files.append(option).append(",");
            } else {
                if (option.length() == 2) {
                    numbers.put(option.substring(1), option.substring(1));
                } else numbers.put(option.substring(1, 2), option.substring(2));
            }
        }
        String fileNames = files.toString();
        if (fileNames.length() > 0)
            numbers.put("files", fileNames.substring(0, fileNames.length() - 1));
        return numbers;
    }
}
