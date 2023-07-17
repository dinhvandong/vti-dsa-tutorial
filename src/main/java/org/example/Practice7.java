package org.example;

public class Practice7 {
    public static void main(String[] args) {
        // Tinh tong so cac chu so  123  = 1+2 +3 = 6
        // 12313= 1+2 +3 +1 +3 = 10
        int n = 123;

        System.out.println(sumNumber(n));
    }
    public static int sumNumber(int n){
        String n1 = n+"";
        String arrayString[]= n1.split("");
        int count = 0;
        for (int i=0; i< arrayString.length;i++){
            String item = arrayString[i];
            int num= Integer.parseInt(item);
            count = count + num;
        }
        return count;
    }
}
