//find largest and Smallest element in array

import java.util.*;

class P1{
	public static void main(String args[]){
		int arr[] = {12,13,1,10,34,10};
		int max =0;
		int min = arr[0];

		for(int i=0;i<arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}

		System.out.println("Largest element of array is : "+max);
		System.out.println("Smallest element of array is : "+min);
	}
}