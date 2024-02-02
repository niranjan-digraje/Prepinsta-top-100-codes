//gretest of two number

import java.util.*;

public class P5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2){
			System.out.println(num1+" is grater.");
		}else if(num2 > num1){
			System.out.println(num2+" is grater.");
		}else{
			System.out.println(num1+" and "+num2+" is equal numbers.");
		}
	}
}