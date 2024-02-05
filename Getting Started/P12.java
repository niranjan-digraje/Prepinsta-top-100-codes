//palindrone number

import java.util.*;

class P12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int num1 = num;
		int revs = 0,rem;

		while(num1 != 0){
			rem = num1 % 10;
			revs = revs * 10 + rem;
			num1 = num1 /10;
		}

		if(num == revs){
			System.out.println(num  + " is palindrone number.");
		}
		else{
			System.out.println(num + " is not palindrone number.");
		}
	}
}