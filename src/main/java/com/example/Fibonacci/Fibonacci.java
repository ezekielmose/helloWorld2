package com.example.Fibonacci;
public class Fibonacci {
    static int fibonacciSeries(int x)
        {
            if (x==0)
            {
                return 0;
            }
            if (x==1)
            {
                return 1;
            }
        int a=0, b=1,c=0;

        for (int i=0;i<x;i++)
        {
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
    public static void main(String[] args)
    {
        System.out.println(fibonacciSeries(1));
        System.out.println(fibonacciSeries(3));
        System.out.println(fibonacciSeries(4));
        System.out.println(fibonacciSeries(5));
        System.out.println(fibonacciSeries(2));
        System.out.println(fibonacciSeries(6));
        System.out.println(fibonacciSeries(7));
        System.out.println(fibonacciSeries(8));
        System.out.println(fibonacciSeries(9));
        System.out.println(fibonacciSeries(10));
    }
}
