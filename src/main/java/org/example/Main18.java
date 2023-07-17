package org.example;

public class Main18 {
    public static void main(String[] args) {

        int n = 20;
        int array1[] = new int[n];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=5;
        array1[5]=6;
        array1[6]=7;
        array1[8]=4;
        array1[9]=10;
        array1[10]=11;
        array1[11]=12;
        array1[12]=13;
        array1[13]=14;
        array1[14]=15;
        array1[15]=16;


        // So bi thieu la so 7 va so 20
        //{1=>20}
        for(int i = 0;i<20;i++)
        {
            if(array1[i] != (i+1)){
                System.out.println("Index:"+ i + "Value:"+ (i+1));
            }
        }

    }
}
