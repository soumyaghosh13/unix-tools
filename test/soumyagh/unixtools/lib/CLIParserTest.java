package soumyagh.unixtools.lib;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CLIParserTest {
    @Test
    public void testGetCLIArgs() throws Exception {
        String args[] = {"-5", "-k1,2", "-c", "-d ", "abc", "def"};
        Map<String, String> expected = new HashMap<String, String>();
        expected.put("5", "5");
        expected.put("k", "1,2");
        expected.put("c", "c");
        expected.put("d", " ");
        expected.put("files", "abc,def");

        Map<String, String> result = new CLIParser().getCLIArgs(args);

        assertEquals(expected, result);
    }
    @Test
    public void testGetCLIArgsWithNoFiles() throws Exception {
        String args[] = {"-5", "-k1,2"};
        Map<String, String> expected = new HashMap<String, String>();
        expected.put("5", "5");
        expected.put("k", "1,2");

        Map<String, String> result = new CLIParser().getCLIArgs(args);

        assertEquals(expected, result);
    }
}
