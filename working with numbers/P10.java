// co-ordinate in which qudrant

import java.util.*;

class P10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x : ");
		double x = sc.nextDouble();
		System.out.print("Enter y : ");
		double y = sc.nextDouble();

		if(x>0 && y>0){
			System.out.println("First Qudrant.");
		}
		else if(x<0 && y>0){
			System.out.println("Second  Qudrant.");
		}
		else if(x<0 && y<0){
			System.out.println("Third  Qudrant.");
		}
		else if(x>0 && y<0){
			System.out.println("Forth  Qudrant.");
		}
		else if(x==0 && y==0){
			System.out.println("Origin.");
		}
	}
}