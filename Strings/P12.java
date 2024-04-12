//remove all bracket from algebric expression

import java.util.*;

class P12{
	public static void main(String args[]){
		String exp = "{(a+b)*c}";
		String res = exp.replaceAll("[(){}]","");
		System.out.println(res);
	}
}