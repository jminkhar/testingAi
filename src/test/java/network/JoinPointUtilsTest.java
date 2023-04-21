package network;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Test class for JoinPoint
 */
public class JoinPointUtilsTest {

    /**
     * test computeJoinPoint
     */
    @Test
    public void testComputeJoinPointEasy() {
        int joinPoint = JoinPointUtils.computeJoinPoint(471, 480);
        assertEquals(519, joinPoint);
    }

    @Test
    public void testComputeJoinPointMedium() {
        int joinPoint = JoinPointUtils.computeJoinPoint(471, 492);
        assertEquals(519, joinPoint);
    }
    @Test
    public void testComputeJoinPointMedium2() {
        int joinPoint = JoinPointUtils.computeJoinPoint(498, 480);
        assertEquals(519, joinPoint);
    }

    @Test
    public void testComputeJoinPointHard() {
        int joinPoint = JoinPointUtils.computeJoinPoint(471, 519);
        assertEquals(519, joinPoint);
    }
}
