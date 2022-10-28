/* link : https://www.codingninjas.com/codestudio/problems/kth-smallest-and-largest-element-of-array_1115488?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0
*/

import java.util.ArrayList;
import java.util.*;

public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        Collections.sort(arr);
        arr2.add(arr.get(k-1));
        arr2.add(arr.get(n-k));
        return arr2;
    }    
    
}
