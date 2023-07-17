package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main27 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public static void main(String[] args) {

        int array[] ={1,312,312,321,4,5,5,6,6,7,8,9123};
        Arrays.sort(array);
        for(int i = 0;i< array.length;i++)
        {
            System.out.print(array[i] + "  ");
        }


    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while(l1.next != null){
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2.next!= null){
            list2.add(l2.val);
            l2 = l2.next;
        }
        String s1 ="";
        for(int i = list1.size()-1 ;i>=0;i--){
            s1 += list1.get(i).toString();
        }
        String s2 = "";
        for(int i = list2.size()-1 ;i>=0;i--){
            s2 += list2.get(i).toString();
        }
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int sum = num1 + num2;
        // 645
        String s = sum + "";
        String [] splitString = s.split("");
        for(int i = 0;i< splitString.length;i++)
        {
            listNode.val = Integer.parseInt(splitString[i]) ;
            listNode = listNode.next;
        }
        return  listNode;
    }
}

class ListNode {
        int val;
         ListNode next;
         ListNode() {

         }
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) {
             this.val = val; this.next = next;
         }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len_sum = len1 + len2;
        int c[] = new int[len1 + len2];
        for(int i = 0;i< len1;i++)
        {
            c[i] = nums1[i];
        }
        for(int i = len1;i< len_sum ;i++)
        {
            c[i] = nums2[i-len1];
        }
        Arrays.sort(c);
        if(len_sum %2 ==0){
            int num1 = c[len_sum/2 - 1];
            int num2 = c[len_sum/2];
            return (num1+num2)/2.0;
        }
        return  c[len_sum/2];

    }
}
