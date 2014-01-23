package kashishm.unixtools.lib;

public class Uniq {
    StringBuilder result = new StringBuilder("");

    public String getUniqLines(String data) {
        String[] lines;
        lines = data.split("\n");
        result.append(lines[0]).append("\n");
        for (int i = 0; i < lines.length - 1; i++) {
            if(!lines[i].equalsIgnoreCase(lines[i+1]))
                result.append(lines[i+1]).append("\n");
        }
        return result.toString();
    }
}