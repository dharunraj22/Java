package datatypes.arrays;
import java.util.Scanner;

import datatypes.Strings;

public class Array {

    public static void main(Strings[] args) {
        int myarray[] = new int[10];
        for( int i : myarray) {
            System.out.println(i);
        }

        int arr2[] = {1, 2, 3, 4};
        for( int i : arr2) {
            System.out.println(i);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of cols:");
        int cols = scanner.nextInt();
        int arr3[][] = new int[rows][];

        for(int i=0; i<rows; i++) {
            arr3[i] = new int[cols];
        }
        
        for(int[] i : arr3) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
        
    }
} 
