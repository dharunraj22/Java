package datatypes.arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int len = arr.length;
        for (int i=0, j=len-1; i<arr.length/2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static boolean isPalindrome(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        for (int i=0, j=arr.length-1; i<j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseArray(arr);
        System.out.print("Reversed Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\nIs the given array a palindrome? " + isPalindrome(arr));
    }
    
}
