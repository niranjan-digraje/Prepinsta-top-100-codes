// remove all  alphabet from string

import java.util.*;

class P10{
	public static void main(String args[]){
		String str = "Nira@njan";
		str = str.replaceAll("[a-zA-Z]","");
		System.out.println(str);
	}
}