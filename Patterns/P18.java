//6666
//555
//44
//3
import java.util.*;

class P18{
	public static void main(String args[]){
		int k=6;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if((i+j)<=5){
					System.out.print(k);
				}else{
					System.out.print(" ");
				}
			}
			k--;
			System.out.println();
		}
	}
}