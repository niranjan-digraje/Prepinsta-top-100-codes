//3
//45
//678
//9101112
//678
//45
//3

import java.util.*;

class P21{
	public static void main(String args[]){
		int k=3;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=4;j++){
				if((j-i)<=0 && (i+j)<=8){
					System.out.print(k);
					k++;
				}else{
					System.out.print(" ");
				}
			}
			if(i==4){
				k=6;
			}else if(i==5){
				k=4;
			}else if(i==6){
				k=3;
			}
			System.out.println();
		}
	}
}