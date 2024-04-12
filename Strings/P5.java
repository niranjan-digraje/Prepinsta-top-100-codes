//toggle the character of string

import java.util.*;

class P5{
	public static void main(String args[]){
		String s1 = "Niranjan";
		String s2 = "";
		for(int i=0;i<s1.length();i++){
			if(Character.isUpperCase(s1.charAt(i))){
				s2= s2 + Character.toLowerCase(s1.charAt(i));
			}
			else{
				s2 = s2 + Character.toUpperCase(s1.charAt(i));
			}	
		}
		System.out.println(s2);
	}
}