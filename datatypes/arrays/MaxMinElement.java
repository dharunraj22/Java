package datatypes.arrays;

public class MaxMinElement {
    
    public static int[] findMinMax(int[] arr) {

        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for(int value : arr) {
            if(value > maxElement) {
                maxElement = value;
            }
            if(value < minElement) {
                minElement = value;
            }
        }

        return new int[] {minElement, maxElement};
    }

    public static void main(String args[]) {
        int[] arr = {1, 4, 3, 6, 23, 12, 13,2, 43, 53, 5, 34, 35, 4, 64 ,2, 2, 32, 3,24 ,23, 43, 2};
        int[] result = findMinMax(arr);
        System.out.println("Minimum value in the array: " + result[0]);
        System.out.println("Maximum element in the array: " + result[1]);
    }

}
