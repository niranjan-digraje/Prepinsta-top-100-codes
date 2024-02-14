//calculate area of circle

import java.util.*;

class P17{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter radious of circle : ");
		double red = sc.nextDouble();
		double pi  = 3.14;
		double area = pi * red * red;

		System.out.println("Area of circle is : "+area);
	}
}