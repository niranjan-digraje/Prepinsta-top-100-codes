//binary to octal

import java.util.*;

class P9{
	public static void main(String argss[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number : ");
		String str = sc.next();
		double sum = 0;
		int num = Integer.parseInt(str);
		for(int i=0;i<str.length();i++){
			int rem = num % 10;
			if(rem == 1){
				sum = sum + Math.pow(2,i);
			}
			num = num /10;
		}
		System.out.println(sum);
	}
}