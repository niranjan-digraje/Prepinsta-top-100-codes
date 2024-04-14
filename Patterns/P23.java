//2
//33
//444
//5555
//5555
//444
//33
//2

import java.util.*;

class P23{
	public static void main(String args[]){
		int k=2;
		for(int i=1;i<=8;i++){
			for(int j=1;j<=4;j++){
				if((j-i)<=0 && (i+j)<=9){
					System.out.print(k);
				}else{
					System.out.print(" ");
				}
			}
			if(i<4){
				k++;
			}else if(i>=5){
				k--;
			}else{
				k=5;
			}
			System.out.println();
		}
	}
}