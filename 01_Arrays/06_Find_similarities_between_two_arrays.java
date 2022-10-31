/* Link : https://www.codingninjas.com/codestudio/problems/find-similarities-between-two-arrays_1229070?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0
*/
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	
	public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
           ArrayList <Integer> arr3 = new ArrayList<>();
           ArrayList <Integer> res = new ArrayList<>();
           
	    // Inserting values of arr1 into new array arr3
	    for (int i=0; i<n; i++)
            {
                arr3.add(arr1.get(i));
            }
	
            for(int i=0; i<m; i++)
            {
		// checking if value to be inserted in arr3 from arr2 already exist?
                boolean check=arr3.contains(arr2.get(i)); 
                if (check)
                {
                    continue;
                }
                arr3.add(arr2.get(i)); // if the value to be inserted in arr3 from arr2 does not exist in arr3 then it will insert this new value into arr3
            }
            int count = arr3.size(); // calculting the size of arr3 
            int union = m+n - count; // finding union {n(A⋃B) = n(A) + n(B) - n(A⋂B)} ( here, count referce to intersection)
            res.add(union); // inserting variable union in res array
            res.add(count);  // inserting variable count  in res array ( here, count referce to intersection)
            return res;
	}
}



