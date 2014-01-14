package soumya.unixtools.api;

import org.junit.Test;
import soumya.unixtools.api.ReduceSpaces;

import static junit.framework.Assert.assertEquals;

public class ReduceSpacesTest {
    @Test
    public void testRemoveSpaces() throws Exception {
        ReduceSpaces rc = new ReduceSpaces();
        String input = "This line  has many   spaces in it.";
        String expected = "This line has many spaces in it.";

        String result = rc.trimSpace(input);

        assertEquals(expected, result);
    }

    @Test
    public void testRemoveSpacesMultipleLines() throws Exception {
        ReduceSpaces rc = new ReduceSpaces();
        String input = "This line  has\n many   spaces in it.";
        String expected = "This line has\n many spaces in it.";

        String result = rc.trimSpace(input);

        assertEquals(expected, result);
    }
}