//decimal to binary

import java.util.*;

class P6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number : ");
		int num = sc.nextInt();
		
		ArrayList <Integer> arr = new ArrayList<>();
		
		while(num > 0){
			int rem = num % 2;
			if(rem == 0){
				arr.add(0);
			}else{
				arr.add(1);
			}
			
			num = num / 2;
		}
		for(int i =1;i<=arr.size();i++){
			System.out.print(arr.get(arr.size()-i));
		}
		
	}
}