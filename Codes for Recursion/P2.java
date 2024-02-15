//prime number using recursion

import java.util.*;

class P2{
	public static boolean isPrime(int num ,  int i){
		boolean t = true;
		boolean f = false;
		if(i+1 != num){
			if(num % i == 0){
				return f;
			}
			else{
				return isPrime(num,i+1);
			}
		}
		return t;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int i=2;
		boolean b = isPrime(num,i);
		if(b == true){
			System.out.println("Given number is prime");
		}
		else{
			System.out.println("Given number is not prime");
		}
	}
}