//prime factor of number

import java.util.*;

class P19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.print("Prime factors are : ");
		for(int i=2;i<num;i++){
			int sum = 0 ;
			if(num % i == 0){
				for(int j = 2;j<i;j++){
					if(i % j == 0){
						sum=1;
						break;
					}
				}
				if(sum == 0){
					System.out.print(i+",");
				}
			}
			
		}
	}
}