package network;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * junit class test for NetworkEndpoint
 */
public class NetworkEndpointTest {

    @Test
    public void testFindNetworkEndpoint() {
        int startNodeId = 1;
        int[] fromIds = {1, 7,3,4,2,6,9};
        int[] toIds = {3,3,4,6,6,9,5};
        int endPointId = NetworkEndpoint.findNetworkEndpoint(startNodeId, fromIds, toIds);
        assertEquals(5, endPointId);
    }
    @Test
    public void testFindNetworkEndpointLoop() {
        int startNodeId = 1;
        int[] fromIds = {1, 7,3,4,3,6,9};
        int[] toIds = {3,3,4,6,6,9,5};
        int endPointId = NetworkEndpoint.findNetworkEndpoint(startNodeId, fromIds, toIds);
        assertEquals(3, endPointId);
    }
}