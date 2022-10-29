/*
Link: https://www.codingninjas.com/codestudio/problems/move-all-negative-numbers-to-beginning-and-positive-to-end_1112620?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0
*/

import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> separateNegativeAndPositive(ArrayList<Integer> nums) {
        ArrayList arr = new ArrayList<>();
        for (int i=0; i<nums.size();i++)
        {
            if(nums.get(i)<0)
            {
                arr.add(nums.get(i));
            }
        }
        
        for (int j=0; j<nums.size(); j++)
        {
            if(nums.get(j)==0)
            {
                arr.add(nums.get(j));
            }
            if (nums.get(j)>0)
            {
                arr.add(nums.get(j));
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
        Collections.sort(nums);
        return nums;
    }
}
*/
