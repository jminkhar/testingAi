package network;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JoinPointUtils {
    public static int computeJoinPoint(int s1, int s2) {

        List<Integer> suiteS1 = new ArrayList<>();
        List<Integer> suiteS2 = new ArrayList<>();
        suiteS1.add(s1);
        suiteS2.add(s2);

        //get the intersection of suiteS1 and suiteS2
        while(suiteS1.stream().noneMatch(suiteS2::contains)){
            // get all digit of s1 and sum them up
            int sum1 = s1;
            while (s1 > 0) {
                sum1 += s1 % 10;
                s1 /= 10;
            }
            suiteS1.add(sum1);
            s1 = sum1;
            // get all digit of s2 and sum them up
            int sum2 = s2;
            while (s2 > 0) {
                sum2 += s2 % 10;
                s2 /= 10;
            }
            suiteS2.add(sum2);
            s2 = sum2;
        }

        return suiteS1.stream().filter(suiteS2::contains).findFirst().orElse(-1);
    }

    /* Ignore and do not change the code below */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int res = computeJoinPoint(s1, s2);
        System.setOut(outStream);
        System.out.println(res);
    }
    /* Ignore and do not change the code above */
}
