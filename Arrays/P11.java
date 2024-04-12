// remove all repeating element from array

import java.util.*;

class P11{
	public static void main(String args[]){
		int arr[] = {10,20,20,30,40,40,40,50,50};
		int n = arr.length;
		Set hash_set = new HashSet();

		for(int i=0;i<n;i++){
			hash_set.add(arr[i]);
		}
		System.out.println(hash_set);
	}
}