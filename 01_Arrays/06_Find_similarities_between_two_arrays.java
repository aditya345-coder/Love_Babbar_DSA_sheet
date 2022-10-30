/* Link : https://www.codingninjas.com/codestudio/problems/find-similarities-between-two-arrays_1229070?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0
*/
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	
	public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
           ArrayList <Integer> arr3 = new ArrayList<>();
           ArrayList <Integer> res = new ArrayList<>();
            for (int i=0; i<n; i++)
            {
                arr3.add(arr1.get(i));
            }
            for(int i=0; i<m; i++)
            {
                boolean check=arr3.contains(arr2.get(i));
                if (check)
                {
                    continue;
                }
                arr3.add(arr2.get(i));
            }
            int count = arr3.size();
            int union = m+n - count;
            res.add(union);
            res.add(count);
            return res;
	}
}



