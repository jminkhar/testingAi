package maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {
    /**
     * Test the closestToZero method.
     */
    @Test
    public void testClosestToZero() {
        int[] ints = {-1, 2, 3, 4, 1, 7, 8, 9, 10};
        int closest = Operations.closestToZero(ints);
        assertEquals(1, closest);
    }
    /**
     * Test the findLargest method.
     */
    @Test
    public void testFindLargest() {
        int[] ints = {-1, 2, 3, 4, 1, 7, 8, 9, 10};
        int largest = Operations.findLargest(ints);
        assertEquals(10, largest);
    }
    /**
     * Test the maximumBags method
     */
    @Test
    public void testMaximumBagsTwoRocks(){
        int[] capacity = {2,3,4,5}, rocks = {1,2,4,4};
        int additionalRocks = 2;
        int atFullCapacity = Operations.maximumBags(capacity,rocks,additionalRocks);
        int expected = 3;
        assertEquals(expected,atFullCapacity);
    }
    @Test
    public void testMaximumBags100Rocks(){
        int[] capacity = {10,2,2}, rocks = {2,2,0};
        int additionalRocks = 100;
        int atFullCapacity = Operations.maximumBags(capacity,rocks,additionalRocks);
        int expected = 3;
        assertEquals(expected,atFullCapacity);
    }
}
