//HCF of two number using recursion

import java.util.*;

class P6{
	public static int hcf(int num1,int num2){
		if(num1 == 0){
			return num2;
		}
		else if(num2 == 0){
			return num1;
		}
		else if(num1 == num2){
			return num1;
		}
		else if(num1 > num2){
			return hcf(num1-num2,num2);
		}
		
			return hcf(num1,num2-num1);
	
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.println("LCM is : "+hcf(num1,num2));
		
	}
}