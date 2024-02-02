//print sum of first n natural number

import java.util.*;

public class P3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nth number : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<num;i++){
			sum = sum + i;
		}
		System.out.println("Sum of first "+num+"th natural number is "+sum);
	}
}