//find repeating element in array

import java.util.*;

public class P10{
	public static void repeate(int arr[],int n){
		boolean visited[] = new boolean[n];
		Arrays.fill(visited,false);
		
		for(int i=0;i<n;i++){
			int count =0;
			for(int j=i+1;j<n;j++){
				if(arr[i] == arr[j] && visited[i] == false){
					visited[i] = true;
					visited[j] = true;
					count =1;
				}
			}
			if(count ==1){
				System.out.println(arr[i]);
			}
		}

	}
	public static void main(String args[]){
		int arr[] = {10,30,20,40,30,10,10};
		int n = arr.length;
		repeate(arr,n);
	}
}