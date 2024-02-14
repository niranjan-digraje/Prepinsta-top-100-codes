//cheack number is sum of two prime number

import java.util.*;

public class P15{
	public static boolean isPrime(int num1){
		boolean t=true;
		boolean f=false;
		if(num1 == 1){
			return f;
			
		}
		if(num1 == 2){
			return t;
			
		}
		int sum=0;
		for(int i=2;i<num1;i++){
			if(num1 % i ==0){
				sum = 1;
				
			}
		}
		if(sum == 0){
			return t;
		}else{
			return f;
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		for(int i=1;i<=num/2;i++){
			if(isPrime(i)){
				if(isPrime(num - i)){
					System.out.println(i+"+"+(num-i)+"="+num);
				}
			}
		}
	}
}  