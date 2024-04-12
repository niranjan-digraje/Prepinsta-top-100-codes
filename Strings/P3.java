// find ascii value of given charater

import java.util.*;

class P3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character : ");
		char c = sc.next().charAt(0);
		int i = c;
		System.out.println("ASCII value of '"+c+"' is "+i);
	}
}