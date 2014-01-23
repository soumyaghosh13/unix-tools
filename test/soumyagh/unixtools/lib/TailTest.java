package soumyagh.unixtools.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TailTest {
    @Test
    public void testGetLines() throws Exception {
        Tail ob = new Tail();
        String expected = "dsc\ndsc\ndsc\ndsc\ngreat\ngreat\ngreat\ngreat\ngreat\ngreat\n";

        String actual = ob.getLines("Kunal\nis\ngreat\nrea\ndsc\ndsc\ndsc\ndsc\ngreat\ngreat\ngreat\ngreat\ngreat\ngreat");

        assertEquals(expected, actual);
    }
    @Test
    public void testGetLinesWithLimit() throws Exception {
        Tail ob = new Tail();
        String expected = "great\n";

        String actual = ob.getLines("Kunal\nis\ngreat\nrea\ndsc\ndsc\ndsc\ndsc\ngreat\ngreat\ngreat\ngreat\ngreat\ngreat",1);

        assertEquals(expected, actual);
    }
    @Test
    public void testGet10LastLinesFromTextOf1Line() throws Exception {
        Tail ob = new Tail();
        String expected = "dsc\n";

        String actual = ob.getLines("dsc");

        assertEquals(expected, actual);
    }
}
