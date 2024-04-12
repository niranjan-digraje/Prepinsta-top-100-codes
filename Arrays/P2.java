//find second smallest element of array

import java.util.*;

class P2{
	public static int sec_small(int arr[],int n){
		int f_small = arr[0];
		for(int i=0;i<n;i++){
			if(arr[i] < f_small){
				f_small = arr[i];
			}
		}

		int s_small = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>f_small && arr[i] < s_small){
				s_small = arr[i];
			}
		}
		return s_small;
	}

	public static void main(String args[]){
		int arr[] = {12,13,1,10,34,10};
		int n = arr.length;
		System.out.println("Second Smallest element is : "+sec_small(arr,n));
		
	}
}