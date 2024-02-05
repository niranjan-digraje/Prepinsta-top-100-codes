// armstrong number

import java.util.*;

class P13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		String str = sc.nextLine();
		int len = str.length();
		int num = Integer.parseInt(str);
		int num1 = num;
		int rem,sum =0;
		for(int i=0;i<len;i++){
			rem = num1 % 10;
			int mul = 1;
			
			for(int j =0;j<len;j++){
				mul = mul * rem;
			}		
	 		sum = sum + mul;
			num1 = num1 / 10;
		}
		if(num == sum ){
			System.out.println(num + " is armstrong number. ");
		}
		else{
			System.out.println(num + " is not armstrong number.");
		}
	}
}