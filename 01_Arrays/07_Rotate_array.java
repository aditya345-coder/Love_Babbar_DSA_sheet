/*
Link : https://www.codingninjas.com/codestudio/problems/rotate-array_1230543?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0
*/

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        int [] arr = new int[n]; // taking values of array from user
        for (int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt(); // number of times the array has to be rotated in the left direction
        Solution obj = new Solution(); // object
        obj.rotate(arr,n,k); // function call
      }
    void rotate(int arr[], int n, int k)
    {
        for (int i=0; i<k;i++)
        {
            int temp = arr[0]; // storing first value of array in each rotation
            for (int j=1; j<arr.length; j++)
            {
                arr[j-1]=arr[j];  // swapping the values
            }
            arr[n-1]= temp;
        }
        // printing the values
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
