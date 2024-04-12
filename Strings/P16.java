// replace substring in a string

import java.util.*;

class P16{
	public static String replace(String original,String toreplace,String replacement){
		if(! original.contains(toreplace)){
			return original;
		}
		String modify = original.replaceAll(toreplace,replacement);
		return modify;
	}
	public static void main(String args[]){
		String original = "Hello , World";
		String toreplace = "World";
		String replacement = "Java";

		String modify = replace(original,toreplace,replacement);

		System.out.println("Original string is : "+original);
		System.out.println("Modified string is : "+modify);
	}
}