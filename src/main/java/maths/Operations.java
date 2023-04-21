package maths;

import java.util.Arrays;
import java.util.OptionalInt;

public class Operations {

    /** @return the number that is closest to zero */
    public static int closestToZero(int[] ints) {
        int closest = ints[0];
        for(int i = 1; i < ints.length; i++){
            if(Math.abs(ints[i]) < Math.abs(closest)){
                closest = ints[i];
            } else if (Math.abs(ints[i]) == Math.abs(closest) && ints[i] > closest){
                closest = ints[i];
            }
        }
        return closest;
    }

    /** @return the largest number of the given array */
    public static int findLargest(int[] numbers) {
        // find the largest number in the array
        int largest = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    /** @return the number of bags at full capacity after adding additionalRocks */
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int countFullCapacity = 0;
        for(int i=0; i<rocks.length; i++){
            while(rocks[i]<capacity[i] && additionalRocks>0){
                rocks[i]++;
                additionalRocks--;
            }
            if(rocks[i]==capacity[i]) {
                countFullCapacity++;
            }
        }
        return countFullCapacity;
    }

}
