//cheack given character is vowel or consonant

import java.util.*;

class P1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character : ");
		char c = sc.next().charAt(0);

		if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
			System.out.println("Given character is vowel");
		}
		else{
			System.out.println("Given charater is consonant");
		}
	}
}