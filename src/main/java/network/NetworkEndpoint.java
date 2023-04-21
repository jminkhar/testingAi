package network;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NetworkEndpoint {

    public static int findNetworkEndpoint(int startNodeId, int[] fromIds, int[] toIds) {

        // create a hashmap of nodes and their connections
        Map<Integer, ArrayList<Integer>> nodes = new HashMap<>();
        for (int i = 0; i < fromIds.length; i++) {
            if (nodes.containsKey(fromIds[i])) {
                nodes.get(fromIds[i]).add(toIds[i]);
            } else {
                ArrayList<Integer> connections = new ArrayList<>();
                connections.add(toIds[i]);
                nodes.put(fromIds[i], connections);
            }
        }
        // get the terminal node and when you find a loop return the before repeating the loop
        int terminalNode = startNodeId;
        while (nodes.containsKey(terminalNode)) {
            if (nodes.get(terminalNode).size() > 1) {
                return terminalNode;
            }
            terminalNode = nodes.get(terminalNode).get(0);
        }

        return terminalNode;
    }


}
