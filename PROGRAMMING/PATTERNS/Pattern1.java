//package com.sameer.patterns;
a2678
public class Pattern1 {
	
	static int n= 6;

	public static void main(String[] args) {
		
		for(int i = 0; i<n; i++) {
			
			for(int j =0; j<n; j++) {
				
				 if (i==j||i+j==n-1) {
					
					System.out.print("*"+" ");
				}
				else{
				System.out.print(" "+" ");
			}
			
		}
		
			System.out.println();
	}

}
}
