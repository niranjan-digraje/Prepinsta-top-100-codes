// armstrong number in given range

import java.util.*;

class P14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter last number : ");
		int numn = sc.nextInt();
		
		//int num = Integer.parseInt(str);
		//int num1 = num;
		
		System.out.print("Armstrong numbers are : ");
		for(int k = num1;k<+numn;k++){
			String k1 = Integer.toString(k);
			int len = k1.length();
			int k2 = Integer.parseInt(k1);
			int num = k2;
			int rem,sum =0;
			for(int i=0;i<len;i++){
				rem = num % 10;
				int mul = 1;
			
				for(int j =0;j<len;j++){
					mul = mul * rem;
				}		
	 			sum = sum + mul;
				num = num / 10;
			}
			if(k2 == sum ){
				System.out.print(k2+",");
			}
		}
		
		
	}
}