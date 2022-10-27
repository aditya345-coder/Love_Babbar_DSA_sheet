/*link: https://www.codingninjas.com/codestudio/problems/sum-of-max-and-min_1081476?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0
*/

import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Sort the array
      Arrays.sort(arr);
      int min = arr[0];
      int max = arr[n-1];
      // Adding minimum and maximum numbers in a array
      int sum = min + max;
      return sum;
  }
}
