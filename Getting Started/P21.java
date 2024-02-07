//perfect number

import java.util.*;

class P21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int sum =0;
		for(int i=1;i<num;i++){
			if(num % i == 0){
				sum = sum + i;
			}
		}

		if(num == sum){
			System.out.println("Given number is perfect number.");
		}else{
			System.out.println("Given number is not perfect number.");
		}
	}
}