// binary to decimal

import java.util.*;

class P3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number : ");
		String bin = sc.next();
		int length = bin.length();
		int binary = Integer.parseInt(bin);
		int num = binary;
		int decimal = 0;
		
		for(int i=0;i<length;i++){
			int rem = num % 10;
			if(rem == 1){
				int pow=1;
				for(int j=0;j<i;j++){
					if(i > 0 ){
						pow = pow * 2;
					}
				}
				decimal = decimal + pow;
			}
			num = num /10;
		}
		System.out.println("Decimal number is "+decimal);
	}
}