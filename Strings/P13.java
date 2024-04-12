//count sum of numbers in string

import java.util.*;

class P13{
	public static void main(String args[]){
		String str = "4m8dsd90s";
		int sum=0;
		for(int i=0;i<str.length();i++){
			if((str.charAt(i) >= '0' && str.charAt(i) <= '9')){
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);
	}
}