//strong number

import java.util.*;

class P20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		//String str = (String) num;
		//System.out.print(str);
		int num1 = num;
		int sum = 0;
		
		while(num1 > 0){
			int fact = 1;
			int rem = num1 % 10;
			for(int i = 1;i<=rem;i++){
				fact = fact * i;
			}
			sum = sum + fact;
			num1 = num1 / 10;
		}
		if(sum == num){
			System.out.println("Given number is strong number.");
		}
		else{
			System.out.println("Given number is not strong number.");
		}
	}
}