package soumya.unixtools.api;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class HeadTest {
    @Test
    public void test_head_should_print_10_lines_without_parameter() throws Exception {
        Head head = new Head();
        String input = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13";
        String expected = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";

        String result = head.getLines(input);

        assertEquals(expected, result);
    }

    @Test
    public void test_head_should_print_given_number_of_lines_with_parameter() throws Exception {
        Head ob = new Head();
        String input = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13";
        String expected = "1\n2\n3\n4\n5\n";
        String actual = ob.getLines(input, 5);

        assertEquals(expected, actual);
    }

    @Test
    public void test_head_should_print_all_lines_if_there_is_less_than_10_lines_without_parameter() throws Exception {
        Head ob = new Head();
        String input = "1\n2\n3\n4\n5";
        String expected = "1\n2\n3\n4\n5\n";

        String actual = ob.getLines(input);

        assertEquals(expected, actual);
    }


    @Test
    public void test_head_should_print_all_lines_if_given_line_no_is_greater_than_total_line() throws Exception {
        Head ob = new Head();
        String input = "1\n2\n3\n4\n5";
        String expected = "1\n2\n3\n4\n5\n";

        String actual = ob.getLines(input, 13);

        assertEquals(expected, actual);
    }
}
