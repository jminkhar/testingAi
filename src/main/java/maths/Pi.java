package maths;

public class Pi {
    /**
     * Approximate pi using the given points.
     */
    static double approx(double[][] pts) {
        //loop through the points
        //calculate the sum of the square of the points
        int countInside = 0;
        for (double[] pt : pts) {
            double x = pt[0];
            double y = pt[1];
            double sum = Math.pow(x, 2) + Math.pow(y, 2);
            if (sum <= 1) {
                countInside++;
            }
        }
        double insideProbability = (double) countInside / pts.length; // = pi/4

        return 4.0* insideProbability;
    }
}
