package soumyagh.unixtools.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void testSortLines() throws Exception {
        Sort ob = new Sort();
        String expected = "great\nis\nkunal\nrea\n";

        String actual = ob.sortLines("kunal\nis\ngreat\nrea");

        assertEquals(expected, actual);
    }
    @Test
    public void testSortLinesWhichAreAlreadySorted() throws Exception {
        Sort ob = new Sort();
        String expected = "1\n2\n3\n4\n";

        String actual = ob.sortLines("1\n2\n3\n4\n");

        assertEquals(expected, actual);
    }
    @Test
    public void testReverseLines() throws Exception {
        Sort ob = new Sort();
        String expected = "4\n3\n2\n1\n";

        String actual = ob.reverseLines("1\n2\n3\n4\n");

        assertEquals(expected, actual);
    }
}