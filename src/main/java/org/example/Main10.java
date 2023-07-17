package org.example;

public class Main10 {
    public static void main(String[] args) {
        // Find the maximum of all elements in array

        int arr[] = {1,23,1,324,234,54,45,4,2,12,12,1,1,23,4,5,1,4,6,78};

//        Step 1: Start the Program
//        Step 2: Declare a variable max with the value of the first element of the array.
//        Step 3: Compare max with other elements using loop.
//                Step 4: If max < array element value, change max to new max.
//                Step 5: If no element is left, return or print max otherwise goto step 3.
//        Step 6: End of Solution

        int max = arr[0];
        for (int i=0; i< arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
