//sort the array in assending order

import java.util.*;

class P7{
	public static void order(int arr[],int n){
		Arrays.sort(arr);
		System.out.print("Sorted array is : ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+"	");
		}
	}
	public static void main(String args[]){
		int arr[] = {3,2,4,1,10,30,40,20};
		int n = arr.length;
		order(arr,n);
	}
}