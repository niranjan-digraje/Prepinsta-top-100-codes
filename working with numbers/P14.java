//replace all 0s with 1s

import java.util.*;

class P14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		String num = sc.next();
		System.out.print("New string is : ");
		for(int i=0;i<num.length();i++){
			if(num.charAt(i) == '0'){
				System.out.print("1");
			}else{
				System.out.print(num.charAt(i));
			}
		}
		
	}
}