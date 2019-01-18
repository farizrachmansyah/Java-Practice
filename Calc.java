package com.aizoo;
import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a1,a2;
		float h;
		char o,pil;
		boolean lagi = false;
		
		do {
			System.out.println("================================");
			System.out.println("           CALCULATOR           ");
			System.out.println("================================");
			System.out.print("Masukkan Angka Pertama	: ");
			a1 = input.nextFloat();
			System.out.print("Masukkan Operator	: ");
			o = input.next().charAt(0);
			System.out.print("Masukkan Angka Kedua	: ");
			a2 = input.nextFloat();
			System.out.println("================================");
			
			if(o == '+') {
				System.out.println();
				h = a1 + a2;
				System.out.println(a1 + " + " + a2 + " = " + h);
			} else if(o == '-') {
				System.out.println();
				h = a1 - a2;
				System.out.println(a1 + " - " + a2 + " = " + h);
			} else if(o == '*') {
				System.out.println();
				h = a1 * a2;
				System.out.println(a1 + " x " + a2 + " = " + h);
			} else if(o == '/') {
				System.out.println();
				h = a1 / a2;
				System.out.println(a1 + " / " + a2 + " = " + h);
			} else if(o == '%') {
				System.out.println();
				h = a1 % a2;
				System.out.println(a1 + " % " + a2 + " = " + h);
			} else {
				System.out.println();
				System.out.println("Operator Salah!");
				System.out.println("Calculator closed.");
				break;
			}
			
			System.out.println();
			System.out.print("Try Again? (Y/N) : ");
			pil = input.next().charAt(0);
			if((pil == 'Y') || (pil == 'y')) {
				lagi = true;
			} else if((pil == 'N') || (pil == 'n')) {
				System.out.println();
				System.out.println("Calculator closed.");
			}
		} while(lagi);
		
		input.close();
	}
}












