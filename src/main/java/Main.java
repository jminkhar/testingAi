import network.NetworkEndpoint;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    /* Ignore and do not change the code below */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startNodeId = in.nextInt();
        int n = in.nextInt();
        int[] fromIds = new int[n];
        for (int i = 0; i < n; i++) {
            fromIds[i] = in.nextInt();
        }
        int[] toIds = new int[n];
        for (int i = 0; i < n; i++) {
            toIds[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int endPointId = NetworkEndpoint.findNetworkEndpoint(startNodeId, fromIds, toIds);
        System.setOut(outStream);
        System.out.println(endPointId);
    }
    /* Ignore and do not change the code above */
}
