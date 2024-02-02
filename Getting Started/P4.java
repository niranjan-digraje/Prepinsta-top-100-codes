//sum of numbers in given range

import java.util.*;

public class P4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number in range : ");
		int num1 = sc.nextInt();
		System.out.print("Enter last number in range : ");
		int num2 = sc.nextInt();
		int sum = 0; 
		
		for(int i=num1;i<=num2;i++){
			sum = sum + i;
		}
		
		System.out.println("Sum of numbers between given range "+num1+" to "+num2+" is "+sum);
	
	}
}