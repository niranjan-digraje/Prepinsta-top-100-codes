//print prime number from given range

import java.util.*;

class P9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number in range : ");
		int num1 = sc.nextInt();
		System.out.print("Enter last number in range : ");
		int num2 = sc.nextInt();
		
		System.out.print("Prime numbers : ");
		for(int i=num1;i<=num2;i++){
			int ref = 1;
			for(int j = 2;j<i;j++){
				if(i==1){
					ref=0;
					break;
				}
				if(i==2){
					ref=1;
					break;
				}
				if(i%j == 0){
					ref = 0;
					
				}
			}
			if(ref  == 1){
				System.out.print(i + ",");
			}
		}
	}
}