//333
//313
//323
//333

import java.util.*;

class P15{
	public static void main(String args[]){
		int row=4;
		int col=3;
		int k=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				if((i==2 && j==2) || (i==3 && j==2)){
					System.out.print(k);
					k++;
				}else{
					System.out.print(col);
				}
			}
			System.out.println();
		}
	}
}