package kashishm.unixtools.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadTest {
    @Test
    public void testGetLinesFor5Lines() throws Exception {
        Head ob = new Head();
        String expected = "Kunal\nis\ngreat\nrea\ndsc\n";

        String actual = ob.getLines("Kunal\nis\ngreat\nrea\ndsc\niuedsdcjis",5);

        assertEquals(expected, actual);
    }
    @Test
    public void testGetLinesFor10Lines() throws Exception {
        Head ob = new Head();
        String expected = "Kunal\nis\ngreat\nrea\ndsc\ndsc\ndsc\ndsc\ngreat\ngreat\n";

        String actual = ob.getLines("Kunal\nis\ngreat\nrea\ndsc\ndsc\ndsc\ndsc\ngreat\ngreat\ngreat\ngreat\ngreat\ngreat\n");

        assertEquals(expected, actual);
    }
    @Test
    public void testGet5LinesFromTextOf1Line() throws Exception {
        Head ob = new Head();
        String expected = "Kunal\n";

        String actual = ob.getLines("Kunal",5);

        assertEquals(expected, actual);
    }
}
