package org.example;

public class LinearSearch {

    public static void main(String[] args) {
         int array[] = {1,23,4,56,7,8,9,23,3,12,12,4,4,6,32,23,324,432,32,432};
         //     Tim vi tri so nguyen to trong array (INDEX)
         //     [0,1,2,3,....len-1]
        for(int i = 0;i< array.length; i++)
        {
            if(checkSNT(array[i])){
                System.out.println(i);
            }
        }
    }
    static boolean checkSNT2(int x){
        if(x<2) return false;
        if(x==2) return  true;
        for(int i = 2;i< x ;i++){
            if(x%i==0) return false;
        }
        return true;
    }

    static boolean checkSNT(int x){
        if (x <2){
            return  false;
        }
        int count = 0;
        for (int i =1; i<=x ;i++){
            if(x%i == 0){
                count ++;
            }
        }
        if ( count ==2 ){
            return true;
        }
        return  false;
    }
}
