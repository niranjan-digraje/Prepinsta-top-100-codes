//Check if a Number is Positive or Negative in Java

import java.util.*;

public class P1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		if(num > 0){
			System.out.println("It is positive number");
		}		
		else if(num < 0){
			System.out.println("It is negative number");
		}else{
			System.out.println("It is Zero");
		}
	}
}