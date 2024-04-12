// maximum scaller product of two vectors

import java.util.*;

class P13{
	public static void main(String args[]){
		int arr1[] = {1,2,6,3,7};
		int arr2[] = {10,7,45,3,7};
		int n = arr2.length;
		
 		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int sum =0;
		for(int i=n-1;i>=0;i--){
			sum = sum + (arr1[i]*arr2[i]);
		}
		System.out.println("Maximum scallar product is : "+sum);
	}
}