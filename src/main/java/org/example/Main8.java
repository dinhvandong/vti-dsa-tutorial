package org.example;

public class Main8 {
    public static void main(String[] args) {
        // Fibonaci
        // F0  = 1;
        // F1 = 1;
        // Fn = Fn-1 + Fn-2 (n>=0)
        // F3 = F2 + F1
        // F100 = F99 + F98
        long n = 1000;
        long f0 = 1;
        long f1 = 1;
        long f2=2;
        for(int i=2;i<=n;i++)
        {
             f2 = f1 + f0;
             f0 = f1;
             f1 = f2;
        }
        // Dynamic Programming - Quy hoach dong
        System.out.println(f2);
    }

    public static long fibonaci(int n)
    {
        if(n==0) return 1;
        if(n==1 )  return 1;
        return fibonaci(n-1) + fibonaci(n-2);
    }
}
