//*
//**
//***
//****
//***
//**
//*

import java.util.*;

class P10{
	public static void main(String args[]){
		for(int i=1;i<8;i++){
			for(int j=1;j<=4;j++){
				if((j-i)<=0 && (i+j)<=8){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}