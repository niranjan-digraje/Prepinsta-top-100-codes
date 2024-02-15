//calculate number of digits in integer

import java.util.*;

class P19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int sum =0;
		while(num > 0){
			sum = sum +1;
			num = num / 10;
		}
		System.out.println(sum);
	}
}