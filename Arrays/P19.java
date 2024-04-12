//find the minimum sum of absolute difference of aray

import java.util.*;

class P19{
	public static int minSum(int arr[],int n){
		int result = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=0;j<n;j++){
				sum = sum + Math.abs(arr[i]-arr[j]);
			}
			result = Math.min(sum,result);
		}
		return result;
	}
	public static void main(String args[]){
		int arr[] = {2,4,5,3};
		int n = arr.length;

		System.out.println("minimum sum is : "+minSum(arr,n));
	}
}