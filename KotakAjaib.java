package com.aizoo;

import java.util.*;

public class KotakAjaib {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int p,l;
		
		System.out.print("Masukkan Panjang: ");
		p = input.nextInt();
		System.out.print("Masukkan Lebar: ");
		l = input.nextInt();
		System.out.println();
		
		gambar(p,l);
		System.out.println();
		result(p,l);
		
		input.close();
	}
	private static void result(int inP, int inL) {
		System.out.println("Luas = " + luas(inP,inL) + "cm");
		System.out.println("Keliling = " + keliling(inP,inL) + "cm");
	}
	private static int keliling(int inP, int inL) {
		int hasil = (inP + inL) * 2;
		return hasil;
	}
	private static int luas(int inP, int inL) {
		int hasil = inP * inL;
		return hasil;
	}
	private static void gambar(int inP, int inL) {
		for(int i=0; i<inL; i++) {
			for(int j=0; j<inP; j++) {
				System.out.print("= ");
			}
			System.out.println();
		}
	}
}
