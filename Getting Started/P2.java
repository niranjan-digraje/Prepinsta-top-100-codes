//Check if a Number is Even or odd in Java

import java.util.*;

public class P2{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter number");
		int num = sc.nextInt();
		if(num % 2 == 0){
			System.out.println(num +" is even number");
		}else{
			System.out.println(num +" is odd number");
		}
	}

}