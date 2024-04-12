// Scaller product of two vectors

import java.util.*;

class P12{
	public static void main(String args[]){
		int arr1[] = {10,30,40,20};
		int arr2[] = {2,4,5,1};
		int n = arr1.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int sum =0;
		for(int i=0;i<n;i++){
			sum = sum + (arr1[i] * arr2[n-1-i]);
		}
		System.out.println("Scaller product is : "+ sum);
		 
	}
}