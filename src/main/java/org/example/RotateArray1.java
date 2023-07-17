package org.example;

public class RotateArray1 {
    static int[] nums = {1,2,3,4,5,6,7};
    public static void main(String[] args) {
//        Input: nums = [1,2,3,4,5,6,7], k = 3 [0,1,2,3,4,5,6]
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
        rotate(nums, 3);
        for(int x: nums){
            System.out.println(x);
        }
    }

    static void rotate(int[] nums, int k) {
        for(int x = 1;x<=k;x++){
            int lastNum = nums[nums.length-1];
            for(int i =nums.length-2;i>=0;i--)
            {
                nums[i+1] = nums[i];
            }
            nums[0] = lastNum;
        }
    }

}
