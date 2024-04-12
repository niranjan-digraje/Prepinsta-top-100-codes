// capatilize first and last character of string

import java.util.*;

class P14{
	public static void main(String args[]){
		String str = "niranjan";
		String newstr = "";
		String s[] = str.split("\\str");
		for(String string : s){
			int len = string.length();
			String first = string.substring(0,1);
			String rest = string.substring(1,len-1);
			String last = Character.toString(string.charAt(len-1));
			newstr= newstr + first.toUpperCase() + rest + last.toUpperCase();
		}
		System.out.println(newstr);
	}
}