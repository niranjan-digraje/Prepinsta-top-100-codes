//find length of string using recursion

import java.util.*;

class P8{
	public static int lenstr(String str,int i){
		int j =i;
		if(str == ""){
			return j;
		}
		j = j+1;
		return lenstr(str.substring(1),j);
	}	

	public static void main(String args[]){
		String str = "Niranjan";
		//System.out.println(str.substring(1));
		System.out.println("length of string is : "+lenstr(str,0));		

	}
}