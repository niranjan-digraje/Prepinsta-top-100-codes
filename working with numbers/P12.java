//maxmum number of handshake

import java.util.*;

class P12 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of peoples : ");
		int num = sc.nextInt();
		int total = (num-1)*num/2;
		System.out.println("Total number of hanshakes is : "+total);
	}
}