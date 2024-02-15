//count number of  days in month

import java.util.*;

class P21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number : ");
		int mn = sc.nextInt();
		System.out.print("Enter year : ");
		int  year = sc.nextInt();
		
		if(mn==1 || mn==3 || mn==5 || mn==7 || mn==9 || mn==11){
			System.out.println("number of days is 31");
		}else if (mn == 2){
			if(year % 4 == 0){
				System.out.println("number of days is 29");
			}else{
				System.out.println("number of days is 28");
			}
		}else{
			System.out.println("number of days is 30");
		}
	}
}