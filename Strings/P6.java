//count number vowels from the string

import java.util.*;

class P6{
	public static void main(String args[]){
		String str = "Niranjan";
		int count =0;
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
				count++;
			}
		}
		System.out.println("number of vowels in string is "+count);
	}
}