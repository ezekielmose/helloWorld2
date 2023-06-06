package com.example.LeetCode;

class LeetCode {
    static int dropSingle(int [] nums){
        int ans=0;
        for(int i=0; i<nums.length; i++)
        {
            ans ^=nums[i];
        }
        return ans;

    }
    public static void main(String[] args)
    {
        System.out.println(dropSingle(new int[]{4,4,5,9,6,6,5}));
    }



}
