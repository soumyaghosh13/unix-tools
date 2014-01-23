package kashishm.unixtools.lib;

public class Tail {
    StringBuilder result = new StringBuilder("");

    public String getLines(String data, int limit) {
        String[] lines;
        int i;
        lines = data.split("\\n");
        if(limit > lines.length) i = 0;
        else i = lines.length - limit;
        for (; i < lines.length; i++) {
            result.append(lines[i]).append("\n");
        }
        return result.toString();
    }

    public String getLines(String data) {
        return this.getLines(data,10);
    }
}
