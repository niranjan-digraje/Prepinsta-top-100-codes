//counting of even and odd element in array

import java.util.*;

class P14{
	public static void main(String args[]){
		int arr[] = {1,20,60,31,75,40,80};
		int n = arr.length;

		int odd=0;
		int even = 0;

		for(int i=0;i<n;i++){
			if(arr[i] % 2 == 0){
				even++;
			}else{
				odd++;
			}
		}

		System.out.println("even = "+even);
		System.out.println("odd = "+odd);
	}
}