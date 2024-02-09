//harshad number

import java.util.*;

class P24{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		int num1 = num;
		int sum = 0;
		while(num1 > 0){
			int rem = num1 % 10;
			sum = sum + rem;
			num1 = num1 / 10;
		}
		if(num % sum == 0){
			System.out.println("Given number is harshad number.");
		}
		else{
			System.out.println("Given number is not harshad number.");
		}
	}
}