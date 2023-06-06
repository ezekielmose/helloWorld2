package com.example.reverseString;
 class ReverseStr {
    static void reverseStrs(char[] s){
        int start=0;
        int end= s.length-1;
        while (start<end)
        {
            char temp= s[start];
            s[start++]=s[end];
            s[end--] =temp;

        }
        //return 0;
    }
    public static  void main(String[] args)
    {


       //System.out.println(reverseStrs(new char[], "hello"));
    }
}
