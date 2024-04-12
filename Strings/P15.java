//cheack two strings are anagram or not

import java.util.*;

class P15{
	public static boolean isAnagram(String str1,String str2){
		String s1 = str1.replaceAll("[\\s]","");
		String s2 = str2.replaceAll("[\\s]","");
		boolean status = true;

		if(s1.length() != s2.length()){
			status = false;
		}else{
			char a1[] = s1.toLowerCase().toCharArray();
			char a2[] = s1.toLowerCase().toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			status = Arrays.equals(a1,a2);
		}
		return status;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two strings : ");
		String str1 = sc.next();
		String str2 = sc.next();

		boolean status = isAnagram(str1,str2);

		if(status){
			System.out.println("Given strings are anagram");
		}
		else{
			System.out.println("Given strings are not anagram");
		}
	}
}