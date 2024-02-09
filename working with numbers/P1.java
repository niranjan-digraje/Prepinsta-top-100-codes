//highest common factor

import java.util.*;

class P1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		int factor = 1;
		if(num1 > num2){
			for(int i=1;i<=num2;i++){
				if(num1 % i == 0 && num2 % i == 0){
					if(i > factor){
						factor = i;
					}
				}
			}
		}
		else{
			for(int i=1;i<=num2;i++){
				if(num1 % i == 0 && num2 % i == 0){
					if(i > factor){
						factor = i;
					}
				}
			}
		}
		System.out.println("Highest common factor is "+factor);
	}
}