//cheack string is palindrom or not

import java.util.*;

class P8{
	public static void main(String args[]){
		String str = "nitin";
		String rev = "";
		for(int i = str.length() -1 ;i>=0;i--){
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("Given string is palindrome");
		}
		else{
			System.out.println("Given string is not palindrome");
		}
	}
}