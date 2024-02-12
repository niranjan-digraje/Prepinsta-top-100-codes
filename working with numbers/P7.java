//decimal to octal

import java.util.*;

class P7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number : ");
		int num = sc.nextInt();
		ArrayList <Integer> arr = new ArrayList<>();
		
		while(num > 0){
			int rem = num % 8;
			arr.add(rem);
			num = num /8;
		}
		for(int i =1;i<=arr.size();i++){
			System.out.print(arr.get(arr.size()-i));
		}
	}
}