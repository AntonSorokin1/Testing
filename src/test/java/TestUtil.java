import org.junit.*;
import utilities.Util;

public class TestUtil {
    private static Util util;
    private static Long time;

    @BeforeClass
    public static void init() {
        System.out.println("Tests begin");
        util = new Util();
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
        String res = util.concatenateWords("a", "b", "c", " d");
        Assert.assertEquals("abc d", res);
    }

    @Test
    public void testConcatenateWordsEmptyString() {
        String res = util.concatenateWords("", "", "");
        Assert.assertEquals("", res);
    }

    @Test
    public void testConcatenateWordsNull() {
        String res = util.concatenateWords((String) null);
        Assert.assertNull(res);
    }

    @Ignore
    @Test
    public void testComputeFactorial() {
        Long res = util.computeFactorial(5);
        if (res != 120) Assert.fail();
    }
}
