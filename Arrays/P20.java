// find equilibrium index of an array

import java.util.*;

class P20{
	public static int equi(int arr[],int n){
		int sum=0;
		int leftsum =0;
		for(int i=0;i<n;i++){
			sum = sum + arr[i];
		}
		for(int i=0;i<n;++i){
			sum = sum - arr[i];
			if(leftsum == sum){
				return i;
			}
			leftsum = leftsum + arr[i];
		}	
		return -1;
	}
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,1,3,2,4};
		int n=arr.length;
		System.out.print("Equilibrium index is : "+equi(arr,n));
	}
}