package org.example;

public class Main5 {
    public static void main(String[] args) {
        int n = 5;
        int x = n-1;
        int y  = n+1;
        while(x>=2){
            boolean check = checkSNT(x);
            if(check){
                // check ==true
                break;
            }
            x--;
        }
        int count_snt = 0;
        while(count_snt < 1){

            boolean check = checkSNT(y);
            if(check){
                break;
            }
            y++;
        }

        System.out.println("x:"+ x);
        System.out.println("y:"+ y);
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
