//2
//43
//765
//111098
//111098
//765
//43
//2

import java.util.*;

class P25{
	public static void main(String args[]){
		int k=2;
		for(int i=1;i<=8;i++){
			if(i==1 || i==8){
				k=2;
			}
			if(i==2 || i==7){
				k=4;
			}
			if(i==3 || i==6){
				k=7;
			}
			if(i==4 || i==5){
				k=11;
			}
			for(int j=1;j<=4;j++){
				if((j-i)<=0 && (i+j)<=9){
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