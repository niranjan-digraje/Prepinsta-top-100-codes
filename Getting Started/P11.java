//reverse of number

import java.util.*;

class P11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int revs = 0,rem;
		while (num !=0){
			rem = num % 10;
			revs  = revs * 10 + rem;
			num = num / 10;
		}
		System.out.println("reverse of number is : "+ revs);
	}
}