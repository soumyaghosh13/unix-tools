package soumya.unixtools.api;

import org.junit.Test;
import soumya.unixtools.api.Tail;

import static org.junit.Assert.assertEquals;

public class TailTest {
    @Test
    public void test_tail_should_print_last_10_lines_without_parameter() throws Exception {
        String input = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13";
        String expected = "13\n12\n11\n10\n9\n8\n7\n6\n5\n4\n";
        Tail ob = new Tail();

        String actual = ob.getLines(input);

        assertEquals(expected, actual);
    }
    @Test
    public void test_tail_should_print_given_no_of_lines() throws Exception {
        String input = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13";
        String expected = "13\n12\n11\n10\n";
        Tail ob = new Tail();

        String actual = ob.getLines(input,5);

        assertEquals(expected, actual);
    }
}
