package kashishm.unixtools.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqTest {
    @Test
    public void testGetUniqLines() throws Exception {
        Uniq ob = new Uniq();
        String expected = "great\nkash\ngreat\n";

        String actual = ob.getUniqLines("great\ngreat\nkash\ngreat\ngreat\ngreat\ngreat\ngreat");

        assertEquals(expected, actual);
    }
    @Test
    public void testGetUniqLinesWithDifferentInputs() throws Exception {
        Uniq ob = new Uniq();
        String expected = "great\nhi\nkash\ngreat\n";

        String actual = ob.getUniqLines("great\ngreat\nhi\nkash\nkash\nkash\ngreat\ngreat\ngreat\ngreat\ngreat\n");

        assertEquals(expected, actual);
    }
}

