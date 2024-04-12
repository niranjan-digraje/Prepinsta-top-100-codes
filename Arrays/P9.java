//count distinct element in array

import java.util.*;

public class P9{
	public static void count(int arr[],int n){
		boolean visited[] = new boolean[n];
		Arrays.fill(visited,false);
		int count_dis =0;
		for(int i=0;i<n;i++){
			if(visited[i] == true){
				continue;
			}else{
				for(int j = i+1;j<n;j++){
					if(arr[i] == arr[j]){
						visited[j] = true;
					}
				}
				count_dis++;
			}
		}
		System.out.print(count_dis);
	}
	public static void main(String args[]){
		int arr[] = {10,30,40,20,10,20,50,10};
		int n = arr.length;
		count(arr,n);
	}
}