package test;

import interviewcake.Main;
import interviewcake.Quicksort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private Main main;

    @BeforeEach
    public void setup() {
        main = new Main();
    }


    @Test
    public void testMaxProfit() {
        int[] stockPricesYesterday = new int[]{2, 10, 7, 5, 1, 11, 9};
        assertEquals(10, main.getMaxProfit(stockPricesYesterday));
        assertEquals(0, main.getMaxProfit(new int[]{10, 10, 10}));
        try {
            main.getMaxProfit(new int[]{10});
            assertTrue(false);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        assertEquals(-1, main.getMaxProfit(new int[]{10, 8, 4, 3}));
    }

    @Test
    public void testProductOfOtherNumbers() {
        assertArrayEquals(
                new int[] {540, 810, 270, 324, 180},
                main.productOfOtherNumbers(3, 2, 6, 5, 9));
    }

    @Test
    public void testHighestProductOfThree() {
        int[] ints = {2, 3, 6, 5, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 3, 2, 6, 5, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(990, main.highestProductOfThree(ints));
    }
}
