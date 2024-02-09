//least common multiple

import java.util.*;

class P2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		int multiple = num1 * num2;
		int common = 1;
		int common2;
		int common1;
		
		for(int i =1;i<=num1;i++){
			common1 = num1*i;
			for(int j=1;j<=num2;j++){
				common2 = num2*j;
				if(common1 == common2 && common1 <= multiple){
					common = common1;
					break;
				}
			}
				
		}
		System.out.println("Least common multiple is "+common);
		
		
		
	}
}