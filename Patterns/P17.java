//10987
//654
//32
//1
import java.util.*;

class P17{
	public static void main(String args[]){
		int k=10;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if((i+j)<=5){
					System.out.print(k);
					k--;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}