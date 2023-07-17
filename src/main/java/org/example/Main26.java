package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Main26 {
    public static void main(String[] args) {
        //        Example 1:
        //
        //        Input: nums = [2,7,11,15], target = 9
        //        Output: [0,1]
        //        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        //        Example 2:
        //
        //        Input: nums = [3,2,4], target = 6
        //        Output: [1,2]
        //        Example 3:
        //
        //        Input: nums = [3,3], target = 6
        //        Output: [0,1]

        int nums[] = {2,11,15,7,22,19,23,123,123,1,4,5,6,8};
        int target = 9;
        int length = nums.length;
        //List<Result> resultList = new ArrayList<>();
        for(int i = 0;i< length;i++)
        {
            for(int j = 0;j< length;j++)
            {
                if(nums[i] + nums[j] == target){
                    if(i<j ){
                        System.out.println("  i="+ i + "  j="+ j);
                        int c[]= {i,j};
                    }
                }
            }
        }
    }
}
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//class Result {
//    private int a;
//    private  int b;
//
//}
