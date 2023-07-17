package org.example;

public class Main21 {

    public static void main(String[] args) {

        int array[] = {10,23,5,6,8,9,123,321,321,321,1,231,1,12,321,213,123,3123231};
        // Bubble sort
        int size = array.length;
        // Selection Sort
        for(int i = 0;i< size -1;i ++)
            for(int j = i+1;j< size -1 ; j ++)
            {
                if(array[i]> array[j]){
                    int temp = array[i];
                    array[i]= array[j];
                    array[j]= temp;

                }
            }
//        for(int i = 0;i< size - 1; i++)
//            for(int j = 0;j< size - 1 ;j ++)
//            {
//                if(array[j]> array[j+1]){
//                    // Neu gia tri dung truoc > gia tri dung sau:::::
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
        for(int i = 0;i< size;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
