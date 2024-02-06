//factorial of number 

import java.util.*;

class P16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++){
			fact = fact*i;
		}
		System.out.println("Factorial is  : "+fact);
	}
}