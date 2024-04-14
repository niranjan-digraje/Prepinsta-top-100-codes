//2
//34
//567
//891011
//891011
//567
//34
//2
import java.util.*;

class P24{
	public static void main(String args[]){
		int k=2;
		for(int i=1;i<=8;i++){
			for(int j=1;j<=4;j++){
				if((j-i)<=0 && (i+j)<=9){
					System.out.print(k);
					k++;
				}else{
					System.out.print(" ");
				}
			}
			if(i==4){
				k=8;
			}
			if(i==5){
				k=5;
			}
			if(i==6){
				k=3;
			}
			if(i==7){
				k=2;
			}
			System.out.println();
		}
	}
}