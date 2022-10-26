/* link : https://www.codingninjas.com/codestudio/problems/reverse-the-array_1262298?topList=love-babbar-dsa-sheet-problems&leftPanelTab=1
*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
          int n = arr.size();
          for (int i = m+1;i<n;i++)
          {
              Collections.swap(arr,i,n-1);
              n--;
          }
    }
}
