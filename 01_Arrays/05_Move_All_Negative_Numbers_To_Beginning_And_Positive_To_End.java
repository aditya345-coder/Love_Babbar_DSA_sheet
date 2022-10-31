/*
Link: https://www.codingninjas.com/codestudio/problems/move-all-negative-numbers-to-beginning-and-positive-to-end_1112620?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0
*/

import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> separateNegativeAndPositive(ArrayList<Integer> nums) {
        // creating new array
        ArrayList arr = new ArrayList<>(); 
        // Adding values (less than 0) i.e negative values from nums to arr
        for (int i=0; i<nums.size();i++)
        {
            if(nums.get(i)<0)
            {
                arr.add(nums.get(i));
            }
        }
        // After adding all the negative values in the arr 
        for (int j=0; j<nums.size(); j++)
        {
            if(nums.get(j)==0) // checking if the element of array nums is 0 or not
            {
                arr.add(nums.get(j)); // if it is 0 add the number to arr 
            }
            // checking if the element of array nums is greter than 0 (positive number)
            if (nums.get(j)>0)
            {
                arr.add(nums.get(j)); // if it is positive number add the number to arr 
            }
        }
        return arr;
    }
}

// Method 2 
/*
import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> separateNegativeAndPositive(ArrayList<Integer> nums) {
        Collections.sort(nums); // sorting the array
        return nums;
    }
}
*/
