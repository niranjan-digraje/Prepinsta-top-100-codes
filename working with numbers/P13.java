//addition of two fraction

import java.util.*;

class P13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first numrator n1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter first denominator d1 : ");
		int d1 = sc.nextInt();
		System.out.print("Enter second numrator n2 : ");
		int n2 = sc.nextInt();
		System.out.print("Enter second denominator d2 : ");
		int d2 = sc.nextInt();

		int num = (n1*d2)+(n2*d1);
		int deno = d1*d2;
		int num1=num;
		for(int i=1;i<=num1;i++){
			if(num % i==0 && deno % i==0){
				num = num/i;
				deno = deno/i;
				i=1;
			}
			
		}
		System.out.println("Total : "+num+"/"+deno);
	}
}