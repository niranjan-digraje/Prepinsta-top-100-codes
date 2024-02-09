//atomorphic number

import java.util.*;

class P23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		int sqr = num * num;
		if(sqr % 10 == num){
			System.out.println("Given number is atomorphic number.");
		}
		else{
			System.out.println("Given number is not automorphic number.");
		}
	}
}