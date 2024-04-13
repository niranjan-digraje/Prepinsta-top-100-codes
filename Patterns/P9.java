//*******
// *****
//  ***
//   *

import java.util.*;
class P9{
	public static void main(String args[]){
		for(int i=1;i<=4;i++){
			for(int j=1;j<8;j++){
				if(i==j || (i+j)==8){
					System.out.print("*");
				}else{
					if(i==1){
						System.out.print("*");
					}else{
						System.out.print(" ");	
					}				
				}
			}
			System.out.println();
		}
	}
}