package com.forLoop;

import java.util.Scanner;

public class LoopUsingScanner {

	public static void main(String[] args) {

		System.out.println("Please enter how many stars you want");
		Scanner s = new Scanner(System.in);
		int numberOfStars = s.nextInt();
// if input is 8; here 8 times print aagum 
		for(int i=1;i<=numberOfStars;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		// if input is 8; here 7 times print aagum
		for(int i=numberOfStars-1;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
	}

}
