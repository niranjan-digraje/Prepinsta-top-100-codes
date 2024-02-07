//perfect square number

import java.util.*;

class P22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		int num1 = num;
		int sum =0;
		while(num1 >0){
			int rem = num1 % 10;
			int sr = (int)Math.sqrt(rem);
			if(rem == (sr*sr)){
				sum =1;
			}else{
				sum =0;
				break;
			}
			num1 = num1 /10;
		}
		if(sum == 1){
			System.out.println("Given number is perfect square number.");
		}
		else{
			System.out.println("Given number is not perfect square number.");
		}
	}
}