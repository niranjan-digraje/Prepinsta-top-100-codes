//find maximum product of subarray in array

import java.util.*;

class P16{
	public static int subArray(int arr[]){
		int n = arr.length;
		int result  = arr[0];

		for(int i=0;i<n;i++){
			int mul = arr[i];
			for(int j=i+1;j<n;j++){
				result = Math.max(result,mul);
				mul = mul * arr[j];
			}
			result = Math.max(result,mul);
		}
		return result;
	}
	public static void main(String args[]){
		int arr[] = {10,-20,-30,0,70,-80,-20};
		System.out.println("maximum product is : "+subArray(arr));
	}
}