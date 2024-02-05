//prime number or not

import java.util.*;

class P8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int ref =1;
		for(int i=2;i<num;i++){
			if(num == 2){
				//System.out.println(num + " is aprime number.");
				ref = 1;
				break;
			}
			if(num % i == 0){
				ref = 0;
				break;	
			}			
		}
		if(ref == 1){
			System.out.println(num + " is prime number.");
		}
		else{
			System.out.println(num +  " is  not prime number.");
		}
	}
}