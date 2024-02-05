//sum of digits of number

import java.util.*;

class P10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		int sum = 0 ;
		do{
			int num1 = num % 10;
			sum = sum + num1;
			num = num / 10;
		}while(num != 0);
		System.out.println("Sum of digits is : "+ sum);
	}
}