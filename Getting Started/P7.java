//leap year or not

import java.util.*;

class P7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0){
			System.out.println(year + " is leap year.");
		}else{
			System.out.println(year +" is not leap year.");
		}
	}
}