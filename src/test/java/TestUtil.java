import org.junit.*;
import utilities.Util;

import java.math.BigInteger;
import static org.mockito.Mockito.*;

public class TestUtil {
    private Util mUtil = mock(Util.class);
    private static Long time;

    @BeforeClass
    public static void init() {
        System.out.println("Tests begin");
        time = System.nanoTime();
    }

    @AfterClass
    public static void end() {
        time = (System.nanoTime() - time);
        System.out.println("Tests over");
        System.out.println("Time taken: " + time / 1000000 + " ms");
    }

    @Test
    public void testConcatenateWordsCustomString() {
        when(mUtil.concatenateWords("a", "b", "c", " d")).thenReturn("abc d");
        String res = mUtil.concatenateWords("a", "b", "c", " d");
        Assert.assertEquals("abc d", res);
        verify(mUtil).concatenateWords("a", "b", "c", " d");
    }

    @Test
    public void testConcatenateWordsEmptyString() {
        when(mUtil.concatenateWords("", "", "")).thenReturn("");
        String res = mUtil.concatenateWords("", "", "");
        Assert.assertEquals("", res);
        verify(mUtil).concatenateWords("", "", "");
    }

    @Test
    public void testConcatenateWordsNull() {
        when(mUtil.concatenateWords((String) null)).thenReturn("");
        String res = mUtil.concatenateWords((String) null);
        Assert.assertNull(res);
        verify(mUtil).concatenateWords((String) null);
    }

    @Ignore
    @Test
    public void testComputeFactorial() {
        BigInteger res = mUtil.computeFactorial(5);
        BigInteger prom = new BigInteger(String.valueOf(120));
        if (!res.equals(prom)) Assert.fail();
    }
}
