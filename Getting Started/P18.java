//factor of number

import java.util.*;

class P18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.print("Factors is : ");
		for(int i=1;i<=num;i++){
			if(num % i == 0){
				System.out.print(i+",");
			}
		}
	}
}