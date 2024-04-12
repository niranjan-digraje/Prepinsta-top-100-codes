// length of string

import java.util.*;

class P4{
	public static void main(String args[]){
		String str = "Niranjan";
		int length = 0;
		for(char c : str.toCharArray()){
			length++;
		}
		System.out.println("Length of string is "+length);
	}
}