//fibonacci serries till nth term

import java.util.*;

class P15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nth term : ");
		int nth = sc.nextInt();
		int a = 0,b=1;
		int next;
		System.out.print("fibonacci series  : "+a+","+b+",");
		for(int i=2;i<=nth-1;i++){
			next = a+b;
			a=b;
			b=next;
			System.out.print(next+",");
		}
	}
}