// remove all space from string

import java.util.*;

class P11{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer();
		String s = "N i ra nj a n";
		String s1[] = s.split("[\\s]");
		for(String string : s1){
			sb.append(string);
		}
		System.out.println(sb);
		
	}
}