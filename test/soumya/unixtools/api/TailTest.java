package soumya.unixtools.api;

import org.junit.Test;
import soumya.unixtools.api.Tail;

import static org.junit.Assert.assertEquals;

public class TailTest {
    @Test
    public void testGetLines() throws Exception {
        String data = "Kunal\nis\ngreat\nI\n";
        String expected = "I\ngreat\nis\n";
        Tail ob = new Tail();

        String actual = ob.getLines(data);

        assertEquals(expected, actual);
    }
    @Test
    public void testGet10Lines() throws Exception {
        String data = "Kunal\nis\ngreat\nI\nam\na\nbig\nfan\nof\nhis\ni\nthink\ntooo";
        String expected = "tooo\nthink\ni\nhis\nof\nfan\nbig\na\nam\nI\n";
        Tail ob = new Tail();

        String actual = ob.getLines(data);

        assertEquals(expected, actual);
    }
}
