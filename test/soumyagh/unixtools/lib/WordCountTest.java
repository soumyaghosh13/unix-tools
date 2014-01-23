package kashishm.unixtools.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountTest {
    @Test
    public void testWc() throws Exception {
        WordCount count = new WordCount();

        count.wc("hello world");

        assertEquals(count.numOfChars, 11);
        assertEquals(count.numOfLines, 1);
        assertEquals(count.numOfWords, 2);
    }
    @Test
    public void testWordCountWithTwoLines() throws Exception {
        WordCount count = new WordCount();

        count.wc("hello world\nhello world");

        assertEquals(count.numOfChars, 23);
        assertEquals(count.numOfLines, 2);
        assertEquals(count.numOfWords, 4);
    }
    @Test
    public void testWordCountWithDifferentInputs() throws Exception {
        WordCount count = new WordCount();

        count.wc("hello world\nhello world\nhello world");

        assertEquals(count.numOfChars, 35);
        assertEquals(count.numOfLines, 3);
        assertEquals(count.numOfWords, 6);
    }
}