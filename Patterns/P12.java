//   *
//  ***
// *****
//*******
// *****
//  ***
//   *
import java.util.*;

class P12{
	public static void main(String args[]){
		for(int i=1;i<8;i++){
			for(int j=1;j<8;j++){
				if(i<=4){
					if(((i+j)>=5 && (j-i)<=3)){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				if(i>4){
					if((i+j)<=11 && (j-i)>=-3){
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