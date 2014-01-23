package soumyagh.unixtools.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceSpaceTest {
    @Test
    public void testRemoveSpaces() throws Exception {
        ReduceSpace rs = new ReduceSpace();
        String input = "This line  has many   spaces \n in it.";
        String expected = "This line has many spaces \r\n in it.";

        String result = rs.removeSpaces(input);

        assertEquals(expected, result);
    }
    @Test
    public void testRemoveSpacesWithDifferentInputs() throws Exception {
        ReduceSpace rs = new ReduceSpace();
        String input = "This       line  has         m    any   spaces      in           it.";
        String expected = "This line has m any spaces in it.";

        String result = rs.removeSpaces(input);

        assertEquals(expected, result);
    }
    @Test
    public void testRemoveSpacesWhenNoExtraSpacesAreThere() throws Exception {
        ReduceSpace rs = new ReduceSpace();
        String input = "This line has many spaces in it.";
        String expected = "This line has many spaces in it.";

        String result = rs.removeSpaces(input);

        assertEquals(expected, result);
    }
}
