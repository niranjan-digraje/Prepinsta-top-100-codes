// remove vowels from string

import java.util.*;

class P7{
	public static void main(String args[]){
		String str1 = "niranjan";
		String str2 = "";
		str2 = str1.replaceAll("[aeiou]"," ");
		System.out.println(str2);
	}
}