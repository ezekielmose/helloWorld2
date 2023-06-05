package com.example.helloworld2;

import java.util.*;


/*class HelloApplication{
    public static  void main(String[] args)
    {
        Scanner inputs= new Scanner(System.in);
        System.out.println("Enter first number");
        int fnum= inputs.nextInt();
        System.out.println("Enter second number");
        int snum= inputs.nextInt();
        int diff= fnum-snum;
        System.out.println("The total difference is:"+diff);
    }
}
*/
/*
//Sum of two using method
public  class HelloApplication {
    public  static int sum (int x, int y){
        return  x+y;
    }
    public  static  void  main( String [] args)
    {
        int num1=28, num2=33;
        int results=sum(num1, num2);
        System.out.println("The sum is:"+results);

    }
}
*/

//Difference of two

/*
public  class HelloApplication {
    public static int diff(int m, int n){
        return m-n;
    }
    public static  void main(String[ ] args)
    {
        int numbers1= 77;
        int numbers2= 32;
        int dif=diff(numbers1, numbers2);
        System.out.println("The difference is:" +dif);
    }
}*/


/*
//Function to multiply ywo numbers

public  class HelloApplication {
    public static int mult(int n1, int n2){
        return  n1*n2;
    }
    public  static  void  main(String [] args)
    {
        int ml1=10;
        int ml2=22;
        int mults= mult(ml1, ml2);

        System.out.println("Your multiple value is:"+mults);
    }
}*/

// Multplication function while taking user inputs


/*
import  java.util.Scanner;
public  class HelloApplication {
    public  static  int multInpts(int k, int l){
        return  k*l;
    }
    public static  void  main(String  [] args)
    {
        Scanner inputs= new Scanner(System.in);
        int i=0;
        while ( i<3) {
            System.out.println("Enter your first number");
            int fn = inputs.nextInt();
            System.out.println("Enter your second number");
            int sn = inputs.nextInt();
            int multps = multInpts(fn, sn);
            System.out.println("Your multiple value is:" + multps);

            i++;
        }

    }

}*/
/*
// Arrays in Java

public  class HelloApplication {
    public static  void  main( String  [] args)
    {
        String [] childrens={"Antony", "Kevin", "Amos", "Julias","Ian"};
        System.out.println("Your childrens are:");
        for (int i=0; i<childrens.length; i++){
        System.out.println(childrens[i] );}

    }
*/

/*
public  class HelloApplication {
    public  static  void main (String [] args)
    {
        int [] marks= {33,45,65,22,33,56,87};
        System.out.println("Your marks is:");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);

        }
        System.out.println("The size of your array is: " +marks.length);
        marks[3]=43;
        System.out.println("Your marks after modification is:");
        for (int j=0; j<marks.length; j++){
            System.out.println(marks[j]);
        }
    }
}
*/

// Removing the duplicates elements in an array

class RemoveDup {
    public static int removeDuplicateNumbes( int [] nums){
        int k=0;
        for (int i=0; i<nums.length; i++){
            if (i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            nums[k]=nums[i];
            k++;
        }
        return k;
    }
    public  static  void main(String[] args)
    {
        System.out.println(removeDuplicateNumbes(new int[]{1,1,2,2,2,3,4,5,8,8}));
    }
}


// Arrangininelements in ascending order



class Assend {
    public  static void main(String[] args)
    {
        int [] numbersToArrange={-1,3,4,5,2,1,8,9,0};
        System.out.println("Your elements before arranging");
        for (int i=0; i<numbersToArrange.length; i++){
            System.out.println(numbersToArrange[i]+ "");
        }
        System.out.println("Your elements after arranging:");
        Arrays.sort(numbersToArrange);
        System.out.println(Arrays.toString(numbersToArrange));
    }
}



//Longest substring

class Palind {
    public static boolean isPalindrome (int x)
    {
        if (x<0){
            return false;
        }
        int number=x;
        int reverse=0;
        while (number>0)
        {
            reverse = reverse*10 + number%10;
            number /= 10;
        }
        return  x==reverse;
    }
    public static  void main (String[] args){
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(122));
        System.out.println(isPalindrome(111));
    }
  }

//Longest common substring

class LongSS {
    public static String longestSubstring(String[] strs){

        //create an object of the class string builder
        StringBuilder longestCommonPrefix= new StringBuilder();
        //base condition
        if(strs==null ||strs.length==0){
            return longestCommonPrefix.toString();
        }
        //find the minimun length of the string from the array

        int strLength=strs[0].length();
        for (int i=1; i<strs.length; i++){
            strLength=Math.min(strLength, strs[i].length() );
        }
        //loop for the minimum length

        for (int i=0; i<strLength; i++){
            // find the first character from the current string
            char firstChar=  strs[0].charAt(i);
            //check if the char is found in all other stringgs or not
            for(String str:strs){
                if (str.charAt(i) != firstChar){
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(firstChar);
        }
       return longestCommonPrefix.toString();
    }
    public static void main (String[] args)
    {
        System.out.println(longestSubstring(new String[]{"flower","flowes","floral","flat"}));
    }

}



//Check valid character

class CheckValid {
    public static boolean isValid(String s) {
        // Stack to store left symbols
        Stack<Character> leftSymbols = new Stack<>();
        // Loop for each character of the string
        for (char c : s.toCharArray()) {
            // If left symbol is encountered
            if (c == '(' || c == '{' || c == '[') {
                leftSymbols.push(c);
            }
            // If right symbol is encountered
            else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }

        public  static void  main(String[] args){
        System.out.println(isValid("()"));
            System.out.println(isValid("()[]{}"));
            System.out.println(isValid("())"));
        }
    }


//remove specific integer from an array
class RemoveVal {
    public static  int removeVariable(int [] nums, int val)
    {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!= val){
                nums[count++]=  nums[i];
            }
        }
        return count;
    }
    public  static  void  main(String [] args){
        System.out.println(removeVariable(new int[]{2,3,4,5,6,7}, 3));
        System.out.println(removeVariable(new int[]{2,3,4,5,6,7}, 9));
        System.out.println(removeVariable(new int[]{2,3,}, 2));
        System.out.println(removeVariable(new int[]{2,3,4,7}, 3));
    }
}



//Chcking if string is present in another string
class CheckStr {
    public  static  int chekStrings(String heystack, String needle){
        //base condition
        if (heystack==null && needle ==null)
        {
            return -1;
        }
        //check if both strings are equal
        if (heystack.equals(needle))
        {
            return  0;
        }
        //length of needle
        int needleLength= needle.length();
        //loop through heystack and slide teh window
        for (int i=0; i<heystack.length()-needleLength+1; i++)
        {
            //check if substring is equal to needle
            if (heystack.substring(i, i+needleLength).equals(needle)){
                return  i;
            }
        }
        return  -1;
    }
    public  static  void  main(String [] args){
        String heystack="hello";
        String neddle="hel";
        System.out.println(chekStrings(heystack, neddle));
    }
}


// function to return the index of a target number in an array

class NumbsArr {
    public static int numbsArray(int[] nums, int target) {
        int count = nums.length;
        for (int i = 0; i < count; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return count;
    }
    public  static  void main(String [] args)
    {
        System.out.println(numbsArray(new int[]{33,4,33,44,5,66,6}, 44));
    }
}

//returning the size of last string

class LengthOfL {
    public static int lengthOfLastWord(String s)
    {
        String[] words = s.split(" ");
        return words.length == 0 ? 0 : words[words.length - 1].length();
    }
    public static void main (String  [] args)
    {
        System.out.println(lengthOfLastWord(new String("jane is tall")));
    }
}


//Plus one

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
    }
}



//MAHARISHI TESTS


    class Removed{
        public static int removeDuplicates(List<String> array) {
            for (int i = 0; i < array.size(); i++) {
                String next = array.get(i);

                // check if this has already appeared before
                for (int j = 0; j < i; j++) {
                    // if it has, stop the search and remove it
                    if (next.equals(array.get(j))) {
                        array.remove(i);
                        // decrement i since we just removed the i'th element
                        i--;
                        // stop the search
                        break;
                    }
                }
            }
            return 0;
        }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList(new String[] {
                "good", "better", "best", "best", "first", "last", "last", "last",
                "good"}));
        removeDuplicates(list);
        for (String x : list) {
            System.out.println(x);
        }
    }
    }



    //testing the sum to a given integer


    class DR5_TestSum {

        static boolean TestSum(int[] a, int x)
        {
            int i, j,k;
            boolean flag=false;
            for( i=0; i<a.length; i++)
                for( j=i+1; j<a.length;  j++)
                    for( k=j+1; k<a.length;k++)
                        if(a[i]+a[j]+a[k]==x)
                        {  flag= true;
                            break;}
            return flag;
        }
        public static void main( String[] args)
        {
            System.out.println(TestSum(new int[]{1, 1, 2, 4},8));
        }

    }

    //Checking if the middle element is centered

    class IsCentered{
    static int centered(int [] center) {
        if (center==null && center.length%2==0){
            return  0;
        }
        int midIndex=center.length/2;
        int midItem=center[midIndex];
            for (int i=0; i<center.length;i++)
            {
                if(i !=midIndex && midItem >=center[i]){
                    return 0;
            }
        }
            return 1;
    }
        public static void  main(String [] args){
            System.out.println(centered(new int[]{2,3,4,1,4,5,6}));
            System.out.println(centered(new int[]{2,3,4,9,4,5,6}));
            System.out.println(centered(new int[]{2,3,4,1,4,5,}));
        }
    }

    // sumOfTwo={1,3,4,5,6}
    class SumOfOandE{
    static  int oddEven(int[] sumOfTwo){
        int oddNumbers=0;
        int evenNumbers=0;

        for (int i=0; i<sumOfTwo.length; i++){
            if (sumOfTwo[i]%2==0){
                evenNumbers += sumOfTwo[i];
            }
            else {
                oddNumbers += sumOfTwo[i];

            }
        }
        return  oddNumbers-evenNumbers;
    }
        public static  void  main(String [] args) {
        System.out.println(oddEven(new int[]{1,3,4,5,6}));
        }
    }

    //Stair case

class  StairCase{
    static  int stair(int n){
        if (n<=3)
        {
            return n;
        }
        int a=2 , b=3;
        for (int i=0; i<n-3; i++)
        {
            a= a+b;
            b= a-b;

        }
        return a;
    }
    public static void  main(String [] args)
    {
        System.out.println(stair(5));
    }

}

//removing duplicate elements from a list

class ListNode{
    private static ListNode head;
    private ListNode next;
    private ListNode val;

    static  ListNode lists (ListNode head){
        ListNode list = head;
        if (head==null || head.next==null){
            return head;
        }
        while (list.next != null) {
        if (list.val == list.next.val)
            {
                list.next=list.next.next;
            }
        else {
            list=list.next;
        }
        }
        return  head;
    }

}

//Merging arrays
class  MergeArrays{
    static int mergeTwoSorted(int [] nums1, int [] nums2, int m, int n){
        int i= m-1;
        int j= n-1;
        int k= m+n-1;

        while (i>=0  && j>=0){
            if (nums1[i]> nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else {
                nums1[j--]=nums1[k--];
            }

        }
        while (j>=0){
            nums1[k--]=nums2[j--];
            break;
        }
        return 0;
    }

}


 class ReverseInteger {

    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        long reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
    }
    
}



//ENTRY EXAMINATION SAMPLES

// Array to return the sum of the largest adjasent element
// [2,3,4,5,1,2,8,1,1]
//2+3=5  / 4+5=9 / 1+2=3 / 8+1=9/ 1+1=2
//should return 9
//add first element with second element and store the sum
//compare all the sums

class AdjasentSum {

    static int largestAdjasentSum(int[] a) {

        int maxSum=Integer.MIN_VALUE;
        for (int i=0; i<a.length-1; i++)
        {
           if (a[i]+a[i+1]>maxSum){
               maxSum= a[i]+a[i+1];
           }
        }
        return maxSum;
    }
    public static void main(String [] args)
    {
        System.out.println(largestAdjasentSum(new int[]{2,3,4,1,1}));
    }

}

//Check concatenated sum
//you are given  a number and its sums of individual digits shoud add up to the original number
//that is 197 (11+99+77= 197)




//median of two sorted arrays
/*
class MedianOfTwoArrays{

    private double findOfTwoSortedArrays(int[] nums2, int[] nums1) {
        if (nums1.length>nums2.length)
        {
            return findOfTwoSortedArrays(nums2, nums1);
        }
        int n= nums1.length;
        int m= nums2.length;

        int start = 0;
        int end = 0;

        while ((start<= end)){
            int partitionNum1=(start+end)/2;
            int partitionNum2=(m+n+1)/2;


            int maxLeftNums1= partitionNum1==0? Integer.MIN_VALUE: nums1[partitionNum1-1];
            int manrightNums1= partitionNum2==0? Integer.MAX_VALUE: nums2[partitionNum2-1];

            int maxLeftNum2=partitionNum2==0? Integer.MIN_VALUE:nums2[partitionNum2-1];
            int minRigthNum2=partitionNum2==0? Integer.MAX_VALUE:nums2[partitionNum2];

            //Check if the combined array is of an even/odd length

            if ((m+n)%2==0)
            {
                return (Math.max(maxLeftNum2, maxLeftNum2)+Math.min(minRigthNum2, minRigthNum2))/2.0;
            }else {
                return Math.max(maxLeftNum2, maxLeftNum2);
            }
        }

    }
}
*/

//Integer array {3,45,6,7,5,5,7} return true
//integer array {3,4,5,1,6,7} return false

class DistictArray{
    static  boolean distictElements(int []nums ){

        //check if an element apears only once
        for (int i=0;i<nums.length; i++){
           for (int j=0; j<i;j++){
               if(nums[i]==nums[j]){
                   return true;
               }
           }
        }
        return false;

    }
    public static void main(String [] args)
    {
        System.out.println(distictElements(new int[]{3,45,6,7,5,5,7}));
        System.out.println(distictElements(new int[]{3,4,5,1,6,7}));
    }
}

 class SumArray {

    static int sum(int[] numbers) {

        //{3,4,2,1,2,4}
        int sums=0;
        int l=numbers.length;

        if(l==0)
        {
            return 0;
        }

        for(int i=0;i<l-1;i++)
        {
            sums += numbers[i];
        }
        return sums;
    }
    public static void main (String[] args)
    {
        System.out.println(sum(new int[]{3,9,3,4,5}));
    }

}
