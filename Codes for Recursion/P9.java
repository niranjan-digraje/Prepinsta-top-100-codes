//print all permutations of string using recursion

import java.util.*;

class P9{
	public static void permutn(String str,String ans){
		if(str.length() == 0){
			System.out.println(ans+"");
			return;
		}

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			String r = str.substring(0,i) + str.substring(i+1);
			permutn(r,ans+ch);
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.next();
		permutn(str,"");
	}
}