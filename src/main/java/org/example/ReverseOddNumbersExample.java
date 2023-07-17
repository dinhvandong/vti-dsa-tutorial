package org.example;

import java.util.Arrays;

public class ReverseOddNumbersExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Reverse the odd numbers in the array
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Find the leftmost odd number
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            // Find the rightmost odd number
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }
            // Swap odd numbers at left and right indices
            if (arr[left] % 2 != 0 && arr[right] % 2 != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            // Move left and right indices towards the center
            left++;
            right--;
        }

        System.out.println("Reversed odd numbers: " + Arrays.toString(arr));
    }
}