import org.junit.Test;
import static org.junit.Assert.*;

public class RecursiveMethodsTest {

    // Test for count8 method
    @Test
    public void testCount8_single8() {
        assertEquals(1, RecursiveMethods.count8(8));
    }

    @Test
    public void testCount8_double8() {
        assertEquals(4, RecursiveMethods.count8(8818));
    }

    @Test
    public void testCount8_no8() {
        assertEquals(0, RecursiveMethods.count8(123));
    }

    // Test for countHi method
    @Test
    public void testCountHi_singleHi() {
        assertEquals(1, RecursiveMethods.countHi("hi"));
    }

    @Test
    public void testCountHi_multipleHi() {
        assertEquals(2, RecursiveMethods.countHi("hihihi"));
    }

    @Test
    public void testCountHi_noHi() {
        assertEquals(0, RecursiveMethods.countHi("hello"));
    }

    // Test for countHi2 method
    @Test
    public void testCountHi2_singleHi() {
        assertEquals(1, RecursiveMethods.countHi2("ahixhi"));
    }

    @Test
    public void testCountHi2_excludeX() {
        assertEquals(0, RecursiveMethods.countHi2("xhixhi"));
    }

    @Test
    public void testCountHi2_multipleHi() {
        assertEquals(2, RecursiveMethods.countHi2("ahibhi"));
    }

    // Test for strCount method (counting non-overlapping occurrences of a substring)
    @Test
    public void testStrCount_multipleOccurrences() {
        assertEquals(2, RecursiveMethods.strCount("catcowcat", "cat"));
    }

    @Test
    public void testStrCount_singleOccurrence() {
        assertEquals(1, RecursiveMethods.strCount("catcowcat", "cow"));
    }

    @Test
    public void testStrCount_noOccurrences() {
        assertEquals(0, RecursiveMethods.strCount("catcowcat", "dog"));
    }

    // Test for stringClean method (removing consecutive duplicate characters)
    @Test
    public void testStringClean_removeDuplicates() {
        assertEquals("yza", RecursiveMethods.stringClean("yyzzza"));
    }

    @Test
    public void testStringClean_noDuplicates() {
        assertEquals("abcd", RecursiveMethods.stringClean("abbbcdd"));
    }

    @Test
    public void testStringClean_singleCharacter() {
        assertEquals("Helo", RecursiveMethods.stringClean("Hello"));
    }
}