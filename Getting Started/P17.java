//power of number

import java.util.*;

class P17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.print("Enter power : ");
		int pow = sc.nextInt();
		int total = 1;
		for(int i = 1;i<=pow;i++){
			total = total * num;
		}
		System.out.println("Power is  : "+total);
	}
}