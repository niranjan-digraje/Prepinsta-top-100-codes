//count frequency of element in array

import java.util.*;

class P8{
	public static void frequency(int arr[],int n){
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
			int count =1;
			while(i<n-1 && arr[i] == arr[i+1]){
				i++;
				count++;
			}
			System.out.println(arr[i]+" : "+count);
		}
	}
	public static void main(String args[]){
		int arr[] = {10,30,10,20,10,20,30,10};
		int n = arr.length;
		frequency(arr,n);
	}
}