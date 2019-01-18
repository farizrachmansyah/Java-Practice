package com.aizoo;

public class BangunDatar {
	public static void main(String[] args) {
		// kotak
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("+ ");
			}
			if(i==2) {
				System.out.print("   ==> PERSEGI");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// persegi panjang
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				System.out.print("+ ");
			}
			if(i==2) {
				System.out.print("   ==> PERSEGI PANJANG");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// segitiga
		for(int i=0; i<5; i++) {
			for(int j=5; j>(i+1); j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("+ ");
			}
			if(i==2) {
				System.out.print("     ==> SEGITIGA");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// segitiga kebalik
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<5; k++) {
				System.out.print("+ ");
			}
			if(i==2) {
				System.out.print("     ==> SEGITIGA KEBALIK");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// belah ketupat
		for(int i=0; i<5; i++) {
			for(int j=5; j>(i+1); j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("+ ");
			}
			if(i==4)
				System.out.print("   ==> BELAH KETUPAT");
			System.out.println();
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<(i+1); j++) {
				System.out.print(" ");
			}
			for(int k=4; k>i; k--) {
				System.out.print("+ ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		// segitiga siku-siku kiri bawah
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("+ ");
			}
			if(i==2) {
				System.out.print("       ==> SEGITIGA SIKU-SIKU KIRI BAWAH");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// segitiga siku-siku kiri atas
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("+ ");
			}
			if(i==2) {
				System.out.print("       ==> SEGITIGA SIKU-SIKU KIRI ATAS");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// segitiga siku-siku kanan atas
		for(int i=0; i<5; i++) {
			for(int j=0; j<(i*2); j++) {
				System.out.print(" ");
			}
			for(int k=5; k>i; k--) {
				System.out.print("+ ");
			}
			if(i==2) {
				System.out.print("   ==> SEGITIGA SIKU-SIKU KANAN ATAS");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// segitiga siku-siku kanan bawah
		for(int i=0; i<5; i++) {
			for(int j=8; j>(i*2); j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("+ ");
			}
			if(i==2) {
				System.out.print("   ==> SEGITIGA SIKU-SIKU KANAN BAWAH");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// setengah belah ketupat kanan
		for(int i=0; i<9; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("+ ");
				if((i+j) == 8) {
					break;
				}
			}
			if(i==4) {
				System.out.print("   ==> SETENGAH BELAH KETUPAT KANAN");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// setengah belah ketupat kiri
		for(int i=0; i<5; i++) {
			for(int j=8; j>(i*2); j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("+ ");
			}
			if(i==4)
				System.out.print("   ==> SETENGAH BELAH KETUPAT KIRI");
			System.out.println();
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<(i*2+2); j++) {
				System.out.print(" ");
			}
			for(int k=4; k>i; k--) {
				System.out.print("+ ");
			}
			System.out.println();
		}
		
	}
}
