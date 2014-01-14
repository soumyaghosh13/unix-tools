package soumya.unixtools.api;

import org.junit.Test;

/**
 * Created by soumyagh on 1/15/14.
 */

import static org.junit.Assert.assertEquals;

public class CutTest {
    @Test
    public void test_cut() throws Exception {
        Cut ob = new Cut();
        String input = "Abhi Soumya\nKabhi SAM\nBangalore KOLKATA\n";
        String expected = "Soumya\nSAM\nKOLKATA\n";

        String actual = ob.getFieldData(input,2," ");

        assertEquals(expected, actual);
    }
}
