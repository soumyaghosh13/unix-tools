package kashishm.unixtools.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CutTest {
    @Test
    public void testCutLinesForGivenField() throws Exception {
        Cut ob = new Cut();
        String text = "Abhi abhiu\nKabhi Kabhiu\nAditi Aditiu\n";
        String expected = "abhiu\nKabhiu\nAditiu\n";
        int[] fields = {2};

        String actual = ob.cutLines(text, fields, " ");

        assertEquals(expected, actual);
    }
    @Test
    public void testCutLinesForGivenFields() throws Exception {
        Cut ob = new Cut();
        String expected = "Abhi\tabhiu\nKabhi\tKabhiu\nAditi\tAditiu\n";
        String text = "Abhi\tabhiu\nKabhi\tKabhiu\nAditi\tAditiu\n";
        int[] fields = {1, 2};

        String actual = ob.cutLines(text, fields, "\t");

        assertEquals(expected, actual);
    }
    @Test
    public void testCutLinesForMultipleFields() throws Exception {
        String text = "1 Ram pass \n" +
                "2 Sita fail \n" +
                "3 him her sad dad bad \n" +
                "4 That This \n";
        String expected = "1 Ram\n2 Sita\n3 him\n4 That\n";
        int[] fields = {1, 2};

        String actual = new Cut().cutLines(text, fields, " ");

        assertEquals(expected, actual);
    }

    @Test
    public void testCutLinesForMultipleFieldsFieldNotPresent() throws Exception {
        String text = "1 Ram pass \n" +
                "2 Sita fail \n" +
                "3 him her sad dad bad \n" +
                "4 That This \n";
        String expected = "\n" +
                "\n" +
                "sad dad\n" +
                "\n";
        int[] fields = {4, 5};

        String actual = new Cut().cutLines(text, fields, " ");

        assertEquals(expected, actual);
    }
    @Test
    public void testCutLinesWhenFieldNotPresent() throws Exception {
        String text = "1 Ram pass \n" +
                "2 Sita fail \n" +
                "3 him her sad dad bad \n" +
                "4 That This \n";
        String expected = "\n" +
                "\n" +
                "\n" +
                "\n";
        int[] fields = {10};

        String actual = new Cut().cutLines(text, fields, " ");

        assertEquals(expected, actual);
    }
    @Test
    public void testCutLinesWhenDelimiterIsNotPresentInData() throws Exception {
        String text = "1 Ram pass \n" +
                "2 Sita fail \n" +
                "3 him her sad dad bad \n" +
                "4 That This \n";
        String expected = "1 Ram pass \n" +
                "2 Sita fail \n" +
                "3 him her sad dad bad \n" +
                "4 That This \n";
        int[] fields = {10};

        String actual = new Cut().cutLines(text, fields, ",");

        assertEquals(expected, actual);
    }
}
