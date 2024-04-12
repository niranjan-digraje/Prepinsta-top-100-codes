//reverse the array

import java.util.*;

class P4{
	public static void reverse(int arr[],int n){
		int rev[] = new int[n];
		int j=0;
		
		for(int i=n-1;i>=0;i--){
			rev[j] = arr[i];
			j++;
		}

		System.out.print("Reverse of array is : {");
		for(int i=0;i<n;i++){
			System.out.print(rev[i]+",");
		}
		System.out.println("}");
		

	}

	public static void main(String args[]){
		int arr[] = {12,13,1,10,34,10};
		int n = arr.length;
		reverse(arr,n);
	}
}