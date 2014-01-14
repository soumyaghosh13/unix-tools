package soumya.unixtools.api;

import junit.framework.TestCase;

public class UniqTest extends TestCase {
    public void testGetUniqueLines() throws Exception {
        String text = "Soumya\nSam\nSam\nSoumya\nSoumya";
        String expected = "Soumya\nSam\n";

        Uniq uniq = new Uniq();
        assertEquals(expected,uniq.getUniqueLines(text));
    }
}