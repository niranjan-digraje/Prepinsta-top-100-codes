//power of number using recursion

import java.util.*;

class P1{
	public static int power(int num,int pw,int sum){
		while(pw > 0){
			sum = sum * num;
			pw = pw-1;
			power(num,pw,sum);
		}
		return sum;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.print("Enter power : ");
		int pw = sc.nextInt();
		int sum = 1;
		System.out.println("Power of given number is : "+power(num,pw,sum));
	}
}