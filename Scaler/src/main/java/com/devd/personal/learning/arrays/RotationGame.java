package com.devd.personal.learning.arrays;

import java.lang.*;
import java.util.*;
/*
 * roblem Description
Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.


Problem Constraints
1 <= N <= 106
1 <= A[i] <=108
1 <= B <= 109


Input Format
There are 2 lines in the input

Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.

Line 2: A single integer B.


Output Format
Print array A after rotating it B times towards the right.


Example Input
Input 1 :
4 1 2 3 4
2


Example Output
Output 1 :
3 4 1 2


Example Explanation
Example 1 :

N = 4, A = [1, 2, 3, 4] and B = 2.

Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]

Final array = [3, 4, 1, 2]


 */
/*
 * Solution Approach
 * 
 * I have multiple solutions here
 * 
 with Space O(N) and  tc O(n)
 create new array and store with totated index.


 */

public class RotationGame {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int length= sc.nextInt();
        int[] nums= new int[length];
        int[]swapped = new int[length];
        for (int i=0;i<length;i++) {
            int next= sc.nextInt();
            nums[i]=next;
        }     
        int rotateBy=sc.nextInt();
        sc.close();
        rotateBy= rotateBy % length;
        for(int i = 0; i < length; i++){
            int x;
            x=(i + rotateBy) % length;
            swapped[x]=nums[i];
        }  
        for(int i=0; i<length;i++){
        System.out.print(swapped[i]); 
        System.out.print(" ");
        }               
    }   
}
