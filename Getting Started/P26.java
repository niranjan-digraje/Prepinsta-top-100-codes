//friendly pair numbers

import java.util.*;

class P26{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();

		int sum1=0;
		int sum2=0;
		for(int i=1;i<num1;i++){
			if(num1 % i == 0){
				sum1 = sum1 + i;
			}
		}
		double rem1 = sum1 / num1;
		
		for(int i =1;i<num2;i++){
			if(num2 % i == 0){
				sum2 = sum2 + i;
			}
		}
		double rem2 = sum2 / num2;

		if(rem1 == rem2){
			System.out.println("Given numbers are friendly pair numbers.");
		}
		else { 
			System.out.println("Given numbers are not friendly pair numbers.");
		}
	}
}