package datatypes.arrays;

public class SortedArray {
    
    public static boolean isSorted(int[] arr) {
        if (arr == null){
            throw new IllegalArgumentException("Array must not be null");
        }    
        if(arr.length < 2){
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1])  return false;
        }
        return true;
    }

    public static int countElementsGreaterThanK(int[] arr, int k) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2};
        int k = 2;
        System.out.println("Is the array sorted:" + isSorted(arr));
        System.out.println("No. of elements greater than " + k + " is: " + countElementsGreaterThanK(arr, k));
    }

}
