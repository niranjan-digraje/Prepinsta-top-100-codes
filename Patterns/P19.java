//3
//44
//555
//6666
import java.util.*;

class P19{
	public static void main(String args[]){
		int k=3;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if((j-i)<=0){
					System.out.print(k);
				}else{
					System.out.print(" ");
				}
			}
			k++;
			System.out.println();
		}
	}
}