package org.danielbrutti;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class KataTest {
    /**
     * Duplicate Encoder tests
     */
    @Test
    public void testDuplicateEncoder() {
        assertTrue(DuplicateEncoder.duplicateEncoder("din").equals("((("));
        assertTrue(DuplicateEncoder.duplicateEncoder("recede").equals("()()()"));
        assertTrue(DuplicateEncoder.duplicateEncoder("Success").equals(")())())"));
        assertTrue(DuplicateEncoder.duplicateEncoder("(( @").equals("))(("));
        assertTrue(DuplicateEncoder.duplicateEncoder("   ()(   ").equals("))))())))"));
        assertTrue(DuplicateEncoder.duplicateEncoder("Prespecialized").equals(")()())()(()()("));
    }

    /**
     * Trailing Zeros tests
     */
    @Test
    public void testTralingZeros() {
        assertTrue(TrailingZeros.trailingZeros(1) == 0L);
        assertTrue(TrailingZeros.trailingZeros(4) == 0L);
        assertTrue(TrailingZeros.trailingZeros(6) == 1L);
        assertTrue(TrailingZeros.trailingZeros(12) == 2L);
        assertTrue(TrailingZeros.trailingZeros(100) == 24L);
        assertTrue(TrailingZeros.trailingZeros(1000) == 249L);
        assertTrue(TrailingZeros.trailingZeros(1000000) == 249998L);
        assertTrue(TrailingZeros.trailingZeros(1000000000) == 249999998L);
    }

    /**
     * Duplicate Encoder tests
     */
    @Test
    public void testBitCounting() {
        assertEquals(BitCounting.bitCount(0), 0);
        assertEquals(BitCounting.bitCount(8), 1);
        assertEquals(BitCounting.bitCount(12), 2);
        assertEquals(BitCounting.bitCount(1234), 5);
    }

    @Test
    public void testSumOfParts() {
        assertArrayEquals(SumOfParts.sumParts(new int[] {}), new int[] {0});
        assertArrayEquals(SumOfParts.sumParts(new int[] {0, 1, 3, 6, 10}),  new int[] {20, 20, 19, 16, 10, 0});
        assertArrayEquals(SumOfParts.sumParts(new int[] {1, 2, 3, 4, 5, 6}),  new int[] {21, 20, 18, 15, 11, 6, 0});        
        assertArrayEquals(SumOfParts.sumParts(new int[] {744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358}), 
                new int[] {10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0});
    }
}
