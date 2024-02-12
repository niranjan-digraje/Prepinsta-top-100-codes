//Permutations in which n people can occupy r seats in a classroom 

import java.util.*;

class P11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of people : ");
		int n = sc.nextInt();
		System.out.print("Enter number of seats : ");
		int r = sc.nextInt();
		
		int num = 1;
		for(int i=1;i<=n;i++){
			num = num *i;
		}
		int deno = 1;
		for(int j=1;j<=n-r;j++){
			deno = deno * j;
		}
		int perm = num / deno;
		System.out.println("Permutation is : "+perm);
	}
}