package datatypes.arrays;
import java.util.Map;
import java.util.HashMap;

public class SubArrays {
    
    // Time complexity:O(nk)
    public static int[] subarraySum(int[] arr, int k) {
        int len = arr.length;
        int idx=0;
        int[] result = new int[len-k+1];
        for (int i=0; i+k-1<len; i++) {
            int sum = 0;
            for (int j=i; j<i+k; j++) {
                sum += arr[j];
            }
            result[idx++] = sum;
        }
        return result;
    }

    public static int longestSubarray(int[] arr, int k) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        int len = arr.length;
        int result = 0;
        for (int i=1; i<=len; i++) {
            for (int j=0; j+i-1<len; j++) {
                int sum = 0;
                for (int a=j; a<j+i; a++) {
                    sum += arr[a];
                }
                if (sum <= k) {
                    result = Math.max(result, i);
                    break;
                }
            }
        }
        return result;
    }

    public static int longestSubarrayWithUnique(String s) {
        if (s==null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        Map<Character, Integer> freq = new HashMap<>();
        int left=0, result=0;
        for (int right=0; right<s.length(); right++) {
            char curr = s.charAt(right);
            if (!freq.containsKey(curr) || freq.get(curr) < left) {
                result = Math.max(result, right-left+1);
            }else {
                left = freq.get(curr)+1;
            }
            freq.put(curr, right);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7};
        int k = 4;
        int result = longestSubarray(arr, k);
        System.out.println("Longest Subarray with sum less than " + k + " is: " + result);
        // System.out.println("Subarray sum: ");
        // for (int i : result) {
        //     System.out.print(i + " ");
        // }


    }

}
