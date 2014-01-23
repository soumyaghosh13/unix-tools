package soumyagh.unixtools.lib;

public class Head {

    StringBuilder result = new StringBuilder("");

    public String getLines(String data, int limit) {
        String[] lines;
        lines = data.split("\\n", limit + 1);
        for (int i = 0; i < limit && i < lines.length; i++) {
            result.append(lines[i]).append("\n");
        }
        return result.toString();
    }

    public String getLines(String data) {
        return this.getLines(data,10);
    }
}
