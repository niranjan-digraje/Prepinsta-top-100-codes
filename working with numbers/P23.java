//calculate root of qudratic equation

import java.util.*;

class P23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		double a = sc.nextDouble();
		System.out.print("Enter value of b: ");
		double b = sc.nextDouble(); 
		System.out.print("Enter value of c: ");
		double c = sc.nextDouble();  

		double deter = (b*b)-(4*a*c);
		if(deter >= 0){
			double x1 = ((-b) + (Math.sqrt(deter))) / (2*a);
			double x2 = ((-b) - (Math.sqrt(deter))) / (2*a);
			System.out.println("x1 = "+x1+"\nx2 = "+x2);
		}else{
			System.out.println("roots are not defined");
		}
	}
}