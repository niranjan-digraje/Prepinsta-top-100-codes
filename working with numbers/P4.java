//octal to decimal

import java.util.*;

class P4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int octal = sc.nextInt();
		int num = octal;
		int sum =0;
		int i =0;
		while(num > 0){
			int rem = num % 10;
			int dec = rem * (int)(Math.pow(8,i));
			sum = sum + dec;
			num = num / 10;
			i++;
		}
		System.out.println("Decimal number : "+sum);
	}
}