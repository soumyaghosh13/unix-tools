package soumya.unixtools.api;


public class Head {
    StringBuilder result = new StringBuilder("");
    String[] lines;

    public String getLines(String data, int numOfLines) {
        lines = data.split("\n", numOfLines + 1);
        for (int i = 0; i < numOfLines && i < lines.length; i++) {
            result.append(lines[i]).append("\n");
        }
        return result.toString();
    }

    public String getLines(String data) {
        lines = data.split("\n", 11);
        for (int i = 0; i < 10 && i < lines.length; i++) {
            result.append(lines[i]).append("\n");
        }
        return result.toString();
    }
}