package org.example;

public class Main9 {
    public static void main(String[] args) {


        int array [] = {1,321,321,12,21,1,11,123,3,4,5,6,7,7,8,8,2,32,3,3,532,4,32,34,324};

        int n = array.length;
        int index = 0;
        //

        for(int i = 0;i<n-1;i++)
            for(int j = i+1;j<n;j++)
            {
                if(array[i]>array[j])
                {
                    index ++;
                    System.out.println("index:"+ index);
                    int temp = array[i];
                    array[i]= array[j];
                    array[j]= temp;
                }
            }


        for(int i = 0;i< n;i++)
        {
            System.out.print(array[i] + "-");
        }


    }

    void test5(int n, int m)
    {

        for(int i = 1;i<n;i++)
            for(int j = 1;j<m/2;j++)
            {
                System.out.println("AAAAA");
            }
        // DO phuc tap = n*m
    }
    void test4(int n, int m)
    {
        // n+ m
        // max(0n, Om)

        for(int i = 0;i<n;i++)
        {
            System.out.println("Hello n");
        }
        for(int i =1;i< m; i++)
        {
            System.out.println("Hello m");
        }
    }

    static void hello3(int n){
        int index = 0;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                index++;
                System.out.println(index+ "Hello, World");

            }
        }
    }
     void hello2(int n){
        // Tang tuyen tinh theo n
        for(int i = 1;i<=n;i++){
            System.out.println("Hello, World");
        }
     }

    void hello(int n){
        System.out.println("Hello, World" + n);
    }

    int pow(int n){
        // n=1
        // n= 10
        //n= 50

        return n*n;
    }
    int test2(int n){
        n=n+1;
        n++; // n= n+1
        return n*n;
    }
}
