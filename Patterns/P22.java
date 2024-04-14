//3
//54
//876
//1211109
//876
//54
//3

import java.util.*;

class P22{
	public static void main(String args[]){
		int k=3;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=4;j++){
				if((j-i)<=0 && (i+j)<=8){
					System.out.print(k);
					k--;
				}else{
					System.out.print("");
				}
			}
			if(i==1 || i==5){
				k=5;
			}else if(i==2 || i==4 ){
				k=8;
			}else if(i==3){
				k=12;
			}else if(i==6){
				k=3;
			}
			System.out.println();
		}
	}
}