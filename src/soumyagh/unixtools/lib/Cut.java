package kashishm.unixtools.lib;

public class Cut {
    public String cutLines(String data, int[] fieldNumbers, String delimiter) {
        String[] lines;
        StringBuilder result = new StringBuilder("");
        lines = data.split("\n");
        if (!data.contains(delimiter))  return data;
        getCutLinesWithRequiredColumns(fieldNumbers, delimiter, lines, result);
        return result.toString();
    }

    private void getCutLinesWithRequiredColumns(int[] fieldNumbers, String delimiter, String[] lines, StringBuilder result) {
        for (String line1 : lines) {
            String[] words = line1.split(delimiter);
            StringBuilder line = getStringBuilderWithRequiredFields(fieldNumbers, delimiter, words);
            if (line.length() > 0) line.setLength(line.length() - 1);
            line.append("\n");
            result.append(line);
        }
    }

    private StringBuilder getStringBuilderWithRequiredFields(int[] fieldNumbers, String delimiter, String[] words) {
        StringBuilder line = new StringBuilder("");
        for (int fieldNumber : fieldNumbers) {
            appendLinesToStringBuilder(delimiter, words, line, fieldNumber);
        }
        return line;
    }

    private void appendLinesToStringBuilder(String delimiter, String[] words, StringBuilder line, int fieldNumber) {
        fieldNumber--;
        if (fieldNumber >= words.length)    line.append("");
        else line.append(words[fieldNumber]).append(delimiter);
    }
}