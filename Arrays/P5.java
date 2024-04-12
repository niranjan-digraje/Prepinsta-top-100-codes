//reverse the array

import java.util.*;

class P5{
	public static void main(String args[]){
		int arr[] = {12,13,1,10,34};
		int n = arr.length;
		for(int i=0;i<=n/2;i++){
			int num = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = num;
		}
		System.out.print("reverse of array is : {");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+",");
		}
		System.out.print("}");
	}
}