//1
//23
//456
//78910

import java.util.*;

class P16{
	public static void main(String args[]){
		int k=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if((j-i)<=0){
					System.out.print(k);
					k++;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}