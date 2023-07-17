package org.example;

public class Main2 {

    public static void main(String[] args) {
        int arrays []= {1,2,3,4,5,6,4312,4321,
                432,432,3,4,56,67,78};
        int len = arrays.length;
        // Tim cac so nguyen to trong array
        for(int i = 0;i< len;i++)
        {
            boolean check = checkSNT(arrays[i]);
            if(check == true){
                System.out.println(arrays[i]);
            }
        }
    }
     static boolean checkSNT(int a){
        /// a la SNT thi return true
        // a khong la SNT return false
        if(a<2){
            return false; // nho hon 2 chac chan khong phai la so nguyen to
        }
        int count = 0;
        for(int i = 1;i<=a;i ++){
            if(a%i ==0){
                count ++;
            }
        }
        if(count ==2 ){
            return true;
        }
        return false;
    }
}
