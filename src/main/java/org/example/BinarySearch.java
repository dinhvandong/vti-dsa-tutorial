package org.example;

public class BinarySearch {

    public static void main(String[] args) {

        int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        // Dieu kien tim kiem nhi phan: Áp dụng cho 1 mảng đã được sắp xếp tăng dần cho trước
        // Có nghĩa là dãy đã được sắp xếp rồi
        // Ví dụ về tìm kiếm theo index trong Database SQL ,...
        int target = 11;
        int indexFound = binarySearch(array, target);
        System.out.println(indexFound);
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1; // indicates that the target element is not found in the array
    }
}
