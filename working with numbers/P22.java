//count how many times return digit in given number

import java.util.*;

class P22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.print("Enter digit which count : ");
		int digi = sc.nextInt();
		int count = 0;
		while(num > 0){
			int rem = num %10;
			if(rem == digi){
				count = count + 1;
			}
			num = num /10;
		}
		System.out.println(count);
	}
}