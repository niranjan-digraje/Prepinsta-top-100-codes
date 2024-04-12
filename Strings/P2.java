// cheack given character is alphabet or not

import java.util.*;

class P2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character : ");
		char c = sc.next().charAt(0);

		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
			System.out.println("Given charater is alphabet.");
		}
		else{
			System.out.println("given charater is not alphabet");
		}
	}
}