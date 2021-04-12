import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyMatcherTest {
    private MyMatcher matcher;

    @Before
    public void setUp() {
        matcher = new MyMatcher();
    }

    @Test
    public void testInvalidRegex() {
        String text = "text";
        String regex = "[t-}*";

        boolean actual = matcher.matches(text, regex);

        Assert.assertFalse(actual);
    }

    @Test
    public void testSmallText() {
        String text = "text";
        String regex = "^t.*";

        boolean actual = matcher.matches(text, regex);

        Assert.assertTrue(actual);
    }

    // Для следующих 2-х тестов был использован НКА и генератор строки для него.
    @Test
    public void testLongText() throws IOException {
        FileInputStream fstream = new FileInputStream("test/testString120");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String text = br.readLine();
        String regex = "((a|b)*ac+((b|c)*|b))+";

        boolean actual = matcher.matches(text, regex);

        Assert.assertTrue(actual);
    }

    @Test
    public void testKillingText() throws IOException {
        FileInputStream fstream = new FileInputStream("test/testString3000");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String text = br.readLine();
        String regex = "((a|b)*ac+((b|c)*|b))+";

        boolean actual = matcher.matches(text, regex);

        Assert.assertFalse(actual);
    }

    @Test(timeout = 1100)
    public void testKillingRegex() {
        String text = "0".repeat(10);
        String regex = "((((0*)*)*)*)*1";

        boolean actual = matcher.matches(text, regex);

        Assert.assertFalse(actual);
    }

    @Test(timeout = 600)
    public void testTimeout() {
        String text = "0".repeat(10);
        String regex = "((((0*)*)*)*)*1";
        long timeout = 500;

        boolean actual = matcher.matches(text, regex, timeout);

        Assert.assertFalse(actual);
    }
}