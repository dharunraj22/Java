package practice;

import java.lang.Math;

public class BasicsPractice {
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    } 

    public static int reverseInteger(int num) {
        int result = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while(num != 0) {
            result = result * 10 + (num%10);
            num /= 10;
        }
        return result * sign;
    }

    public static int countDigits(int num) {
        if (num == 0)    return 1;
        num = Math.abs(num);
        int result = 0;
        while (num != 0) {
            result++;
            num = num/10;
        }
        return result;
    }

    public static int coountDigitsUsingLog(int num) {
        if (num == 0)   return 1;
        num = Math.abs(num);

        return (int) (Math.floor(Math.log10(num)) + 1);
    }

    public static void main(String[] args) {
        int prime = 12;
        System.out.println("Is " + prime + " prime: " + isPrime(prime));
        int num1 = 123456789;
        System.out.println("Reversed value of " + num1 + " is: " + reverseInteger(num1));
        int num2 = 123456789;
        System.out.println("No. of digits in " + num2 + " is: " + countDigits(num2));
        System.out.println("No. of digits in " + num2 + " using log method is: " + countDigits(num2));
    }   

}
