package soumya.unixtools.api;

import org.junit.Test;
import soumya.unixtools.api.WordCount;

import static junit.framework.Assert.assertEquals;


public class WordCountTest {
    @Test

    public void test_for_count_lines() throws Exception {
        WordCount lineCount = new WordCount();
        int noOfLines = lineCount.wordCount("hello");
        int expected = 1;
        assertEquals(expected, noOfLines);
    }

    @Test

    public void test_for_count_multiple_lines() throws Exception {
        WordCount lineCount = new WordCount();
        int noOfLines = lineCount.wordCount("hi\nI'm\nSoumya.");
        int expected = 3;
        assertEquals(expected, noOfLines);
    }

    @Test
    public void test_for_count_words() throws Exception {
        WordCount wordCount = new WordCount();
        int noOfWords = wordCount.wordCount("Soumya");
        int expected = 1;
        assertEquals(expected,noOfWords );
    }


    @Test
    public void test_for_count_multiple_words() throws Exception {
        WordCount wordCount = new WordCount();
        int noOfWords = wordCount.wordCount("My Name is Soumya");
        int expected = 4;
        assertEquals(expected,noOfWords );
    }


    @Test
    public void test_for_count_single_character() throws Exception {
        WordCount charCount = new WordCount();
        int noOfCharacters = charCount.charCount("A");
        int expected = 1;
        assertEquals(expected, noOfCharacters);
    }

    @Test
    public void test_for_count_multiple_character() throws Exception {
        WordCount charCount = new WordCount();
        int noOfCharacters = charCount.charCount("Hello");
        int expected = 5;
        assertEquals(expected, noOfCharacters);
    }


    @Test
    public void test_for_count_character_with_white_space_character() throws Exception {
        WordCount charCount = new WordCount();
        int noOfCharacters = charCount.charCount("Hi I'm Soumya.\nHow are You ?");
        int expected = 28;
        assertEquals(expected, noOfCharacters);
    }
}
