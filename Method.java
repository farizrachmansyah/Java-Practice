package com.aizoo;
import java.util.*;

public class Method {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int p;
		
		System.out.println("+++ MENGHITUNG LUAS PERSEGI +++ \n");
		System.out.println("Diketahui lebar = 7cm \n");
		System.out.print("Masukkan Panjang: ");
		p = hasil(input.nextInt());
		
		System.out.println("Luas Persegi = " + p + "cm");
		
		input.close();
	}
	static int hasil(int panjang) {
		int h;
		int l = 7;
		
		h = panjang * l;
		
		return h;
	}
}
