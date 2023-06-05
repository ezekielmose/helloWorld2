package com.example.helloworld2;

import java.util.Scanner;

public class sumOfTwo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scanner.nextInt();
        System.out.println("Enter second number");
        int num2=scanner.nextInt();
        int sums=num2+num1;
        System.out.println("The total sum is:"+sums);
    }
}
