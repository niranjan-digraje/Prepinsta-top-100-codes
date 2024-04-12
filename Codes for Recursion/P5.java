//reverse the number using recursion

import java.util.*;

class P5{
	public static int reverse(int num){
		int rem = num % 10;
		num = num / 10;
		System.out.print(rem);
		if(num == 0){
			return 0;
		}
		return reverse(num);
	}	
		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.print("Reverse number is : ");
		reverse(num);
	}
}