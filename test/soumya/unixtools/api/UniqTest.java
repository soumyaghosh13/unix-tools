package soumya.unixtools.api;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by soumyagh on 1/15/14.
 */
public class UniqTest {

    @Test
    public void test_uniq_should_print_uniq_lines_() throws Exception {
        Uniq uniq = new Uniq();
        String input = "1\n1\n2\n2\n3\n3\n3\n4\n4\n4\n4\n5\n5\n5\n5\n5";
        String expected[]={"1","2","3","4","5"};

        String[] result = uniq.getUniqLines(input);

        Assert.assertArrayEquals(expected, result);
    }
}
