//largest element in an array using recursion

import java.util.*;

class P3{
	public static int largest(int arr[],int i,int large){
		int l = large;
		if(i == arr.length){
			return l;
		}
		if(arr[i] > large){
			large = arr[i];
		}
		return largest(arr,i+1,large);
		
			
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new  int[]{12,43,65,23,87};
		//arr =  [12,43,65,23,87];
		System.out.println(largest(arr,0,arr[0]));
	} 
}