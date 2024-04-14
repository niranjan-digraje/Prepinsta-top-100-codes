//3
//44
//555
//6666
//555
//44
//3
import java.util.*;

class P20{
	public static void main(String args[]){
		int k=3;

		for(int i=1;i<=7;i++){
			for(int j=1;j<=4;j++){
				if((j-i)<=0 && (i+j)<=8){
					System.out.print(k);
				}else{
					System.out.print(" ");
				}
			}
			if(i<4){
				k++;
			}else{
				k--;
			}
			System.out.println();
		}
	}
}