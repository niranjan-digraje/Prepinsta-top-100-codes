//sort first half of array in ascending order and second half in descending order

import java.util.*;

class P6{
	public static void order(int arr[],int n){
		Arrays.sort(arr);

		for(int i=0;i<n/2;i++){
			System.out.print(arr[i]+"	");
		}

		for(int i=n-1;i>=n/2;i--){
			System.out.print(arr[i]+"	");
		}
	}
	public static void main(String args[]){
		int arr[] = {3,2,4,1,10,30,40,20};

		int n = arr.length;
		order(arr,n);
	}
}