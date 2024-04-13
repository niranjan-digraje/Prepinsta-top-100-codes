//   *
//  **
// ***
//****
// ***
//  **
//   *

import java.util.*;

class P11{
	public static void main(String args[]){
		for(int i=1;i<8;i++){
			for(int j=1;j<=4;j++){
				if((i+j)>=5 && (j-i)>=-3){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}	
}