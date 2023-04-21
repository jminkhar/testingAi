package maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiTest {
    /**
     * Test the approx method.
     */
    @Test
    public void testApprox() {
        //initialize a double[][] array of 40 points with x and y coordinates between 0 and 1
        double[][] pts = new double[40][2];
        for(int i = 0; i < pts.length; i++){
            pts[i][0] = Math.random();
            pts[i][1] = Math.random();
            if(Math.pow(pts[i][0], 2) + Math.pow(pts[i][1], 2) > 1 && i<=30){
                pts[i][0] = 0;
                pts[i][1] = 1;
            } else if(Math.pow(pts[i][0], 2) + Math.pow(pts[i][1], 2) <=1 && i>30){
                pts[i][0] = 1;
                pts[i][1] = 1;
            }
        }


        double pi = Pi.approx(pts);
        assertEquals(Math.PI, pi, 0.1);
    }
}
