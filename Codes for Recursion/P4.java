//smallest element in array using recursion

import java.util.*;

class P4{
	public static int smallest(int arr[],int i,int small){
		int s = small;
		if(i == arr.length){
			return s;
		}
		if(arr[i] < small){
			s = arr[i];
		}
		return smallest(arr,i+1,s);
	}
	
	public static void main(String args[]){
		int arr[] = new int[]{232,23,121,12,32,3};
		System.out.println("Smallest Element is : "+smallest(arr,0,arr[0]));
	}
}