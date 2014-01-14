package soumya.unixtools.api;

import org.junit.Test;
import soumya.unixtools.api.Sort;

import static junit.framework.Assert.assertEquals;


public class SortTest {
    @Test
    public void test_for_sort() throws Exception {
        Sort sort = new Sort();
        String input = "A\nZ\nN\nY";
        String expected = "A\nN\nY\nZ\n";
        String result = sort.getSortedData(input);
        assertEquals(expected, result);
    }
}