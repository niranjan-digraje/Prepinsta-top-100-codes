//print all prime number from 1 to 100

import java.util.*;

class P18{
	public static boolean isPrime(int num){
		boolean t = true;
		boolean f = false;
		if(num == 1){
			return f;
		}
		if(num == 2){
			return t;
		}
		int sum =0;
		for(int i=2;i<num;i++){
			if(num % i == 0){
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
		System.out.print("Prime number from 1 to 100 is : ");
		for(int i=1;i<=100;i++){
			if(isPrime(i)){
				System.out.print(i+",");
			}
		}	
	}
} 